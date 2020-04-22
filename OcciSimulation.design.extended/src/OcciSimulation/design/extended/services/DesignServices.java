package OcciSimulation.design.extended.services;

import java.util.Iterator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.json.simple.parser.ParseException;
import org.occiware.clouddesigner.occi.simulation.cloudsim.handlers.BinomialDistribution;
import org.occiware.clouddesigner.occi.simulation.cloudsim.handlers.BrigeConfigSimulation;
import org.occiware.clouddesigner.occi.simulation.cloudsim.handlers.Parser.Dc_Config;
import org.occiware.clouddesigner.occi.simulation.cloudsim.handlers.Parser.Entity;
import org.occiware.clouddesigner.occi.simulation.cloudsim.handlers.Parser.VM_Config;
import org.occiware.clouddesigner.occi.simulation.cloudsim.handlers.Simulation;

import OcciSimulation.design.extended.treatment.Price;
import org.eclipse.cmf.occi.core.Attribute;
import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.core.design.dialog.LoadExtensionDialog;
import org.eclipse.cmf.occi.core.Resource;


public class DesignServices {

	public static final Set<String> attributesToOmit = new HashSet<String>();
	static {
		attributesToOmit.add("occi.core.id");
		attributesToOmit.add("occi.core.source");
		attributesToOmit.add("occi.core.target");
	};

	String scheme = "http://schemas.ogf.org/occi/simulation#";
	String core = "http://schemas.ogf.org/occi/core#";

	public void tagDatacenter(Resource resource) {
		tagResource(resource, "datacenter");
	}

	public void tagHost(Resource resource) {
		tagResource(resource, "host");
	}

	public void tagVM(Resource resource) {
		tagResource(resource, "vm");
	}

	public void tagApplication(Resource resource) {
		tagResource(resource, "cloudlet");
	}

	public void tagStorage(Resource resource) {
		//tagResource(resource, "storage");
		System.out.println("Not yet implemented");
	}

	public void tagNetwork(Resource resource) {
		//tagResource(resource, "network");
		System.out.println("Not yet implemented");
	}

	public void addPackage(Resource resource){
		//add core to use package
		Configuration configuration = OcciHelper.getConfiguration(resource);
		Extension extension = OcciHelper.loadExtension(resource.getKind().getScheme());
		List<Extension> extensions = configuration.getUse();
		if(extensions.size() == 0){
			configuration.getUse().add(OcciHelper.loadExtension(scheme));
			configuration.getUse().add(OcciHelper.loadExtension(core));
		}else {
			if(!schemeExists(configuration, extension.getScheme())){
				configuration.getUse().add(OcciHelper.loadExtension(resource.getKind().getScheme()));
			}
		}

	}

	public static boolean schemeExists(Configuration configuration, String scheme){

		Extension extension = OcciHelper.loadExtension(scheme);
		ArrayList<String> schemas = new ArrayList<String>();

		for(Extension ex: configuration.getUse()){
			schemas.add(ex.getScheme());
		}
		return schemas.contains(extension.getScheme());

	}

	public boolean isCompute(Resource resource){
		String scheme = resource.getKind().getScheme();
		String term = resource.getKind().getTerm();
		final Extension extension = OcciHelper.loadExtension(scheme);
		for(Kind kind: extension.getKinds()){
			if(kind.getTerm().equals(term)){
				Kind d = kind.getParent();
				while(d!=null && !d.getTerm().equals("compute")){
					d = d.getParent();
				}
				if(d !=null && d.getTerm().equals("compute"))
					return true;
			}
		}
		return false;
	}

	public void tagResource(Resource resource, String term) {
		if(resource.getKind().getTerm().equals("resource") || isCompute(resource)){
			//add core to use package
			addPackage(resource);
			//if resource is tagged 
			if(tagedBefore(resource)){
				JOptionPane.showMessageDialog(null, "This resource is tagged");
				return;
			}

			final Extension extension = OcciHelper.loadExtension(scheme);

			for (Mixin mixin : extension.getMixins()) {			
				if(mixin.getTerm().contains(term)){
					resource.getMixins().add(mixin);
					for(Attribute att: mixin.getAttributes()){
						AttributeState as = OCCIFactory.eINSTANCE.createAttributeState();
						as.setName(att.getName());
						as.setValue(att.getDefault());
						resource.getAttributes().add(as);
					}
				}
			}
		}else{
			System.out.println("This resource is not a compute");
			Shell shell = this.getShell();
			MessageDialog.openInformation(shell, "Info", "This resource is not a compute");
		}

	}
	/*double getProba(Configuration config){
		for(Resource resource : config.getResources()) {
			for(MixinBase mixin : resource.getParts()) {
				System.out.println(mixin.getMixin().getName());
				if(mixin.getMixin().getName().equals("binomiale"))
				{
					BinomialeImpl m = (BinomialeImpl) mixin;

					return BinomialDistribution.computePValue(m.getNumCorrect(),
							m.getNumTrials(), m.getChance());
					
				}
			}
		}
		return 0;
		
	}*/

	public void start(Configuration config) {
		System.out.println("start simulation ... "+config);
		BrigeConfigSimulation bridge = new BrigeConfigSimulation(config); 
		System.out.println("After brige");
		Map<Entity, Set<Entity>> entities= bridge.ExtaractEntities();
		
		System.out.println(entities.size());
		getPricing(entities);
		
		Shell shell = this.getShell();
		String msg = bridge.checkEntities();
		System.out.println("msg: "+msg);
		if(msg==null){
			System.out.println("Configuration contains correct informations");
			Simulation simulation = new Simulation(entities);
			simulation.runExtension();
			if(simulation.getCloudSimError()){
				JOptionPane.showMessageDialog(null, "Thanks to verify your configuration",
						"Simulation Result",
						JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			//verify the additionnal entities
			verifyTheAdditionnalResource(simulation.entities, config);
			System.out.println(simulation.getResult());
			JOptionPane.showMessageDialog(null, simulation.getResult(),
					"Simulation Result",
					JOptionPane.INFORMATION_MESSAGE);
			return;

		}else{
			System.err.println("Thanks to verify your linked resources in configuration");
			MessageDialog.openInformation(shell, "Info", "Thanks to verify your linked resources in configuration \n"
					+ msg);
		}
	}
	
	public void getPricing(Map<Entity, Set<Entity>> entities)
	{
		String location = "", os="";
		int pesNum=0, ram;
		
		//Temporary
		for(Entity et: entities.keySet())
		{
			if(et instanceof Dc_Config)
			{
				Dc_Config dc =(Dc_Config) et;
				location = dc.getLocation();
			}
		}//Temporary
		
		for(Entity et: entities.keySet())
		{
			if(et instanceof Dc_Config)
			{
					Dc_Config dc =(Dc_Config) et;
					location = dc.getLocation();					
			}
			
			if(et instanceof VM_Config)
			{
				VM_Config vm =(VM_Config) et;
				os = vm.getOs();
				pesNum = vm.getPesNumber();
				ram = vm.getRam();
				System.out.println(">>>> location="+location+", os="+os+", pesNum="+pesNum+", ram="+ram);
				try {
					Price.getInstancePrice(location, os, pesNum, ram, 1);
				} catch (Exception e) {
					System.out.println("######################################################################################### "+e);
					e.printStackTrace();
				}/* catch (ParseException e) {
					// TODO Auto-generated catch block
					System.out.println("Exception e2: "+e);
					e.printStackTrace();
				}*/
			}
		}
	}

	public boolean tagedBefore(Resource resource){
		for(Mixin mixin : resource.getMixins()){
			if(mixin.getTerm().equals("datacenter") || mixin.getTerm().equals("host") ||
					mixin.getTerm().equals("VM") || mixin.getTerm().equals("cloudlet"))
				return true;
		}
		return false;
	}

	public Shell getShell() {
		Display _current = Display.getCurrent();
		return _current.getActiveShell();
	}

	public static void print(Configuration configuration)
	{
		System.out.println("Configuration");
		System.out.println("  - used extensions:");
		for(Extension extension : configuration.getUse()) {
			System.out.println("    * Extension " + extension.getName() + " " + extension.getScheme());
		}
		System.out.println("  - resources:");
		for(Resource resource : configuration.getResources()) {
			System.out.println("    * Resource id " + resource.getId());
			Kind resourceKind = resource.getKind();
			System.out.println("      - Kind " + resourceKind.getScheme() + resourceKind.getTerm());
			System.out.println("      - mixins:");
			for(Mixin mixin : resource.getMixins()) {
				System.out.println("        * Mixin " + mixin.getScheme() + mixin.getTerm());
			}
			System.out.println("      - attributes:");
			for(AttributeState as : resource.getAttributes()) {
				System.out.println("        * AttributeState " + as.getName() + "=" + as.getValue());
			}
			System.out.println("      - links:");
			for(Link link : resource.getLinks()) {
				System.out.println("        * Link id " + link.getId());
				Kind linkKind = link.getKind();
				System.out.println("         - Kind " + linkKind.getScheme() + linkKind.getTerm());
				System.out.println("         - mixins:");
				for(Mixin mixin : link.getMixins()) {
					System.out.println("        * Mixin " + mixin.getScheme() + mixin.getTerm());
				}
				System.out.println("         - attributes:");
				for(AttributeState as : link.getAttributes()) {
					System.out.println("           * AttributeState " + as.getName() + "=" + as.getValue());
				}
				Resource source = link.getSource();
				System.out.println("        - source id " + source.getId());
				Resource target = link.getTarget();
				if(target != null) {
					System.out.println("        - target id " + target.getId());
				} else {
					System.out.println("        - no target");
				}
			}
		}
	}

	public void importConfiguration(Configuration configuration) {
		Shell shell = Display.getCurrent().getActiveShell();
		Session session = SessionManager.INSTANCE.getSession(configuration);
		//LoadExtensionDialog dialog = new LoadExtensionDialog(shell, session.getTransactionalEditingDomain());
		LoadConfigurationDialog dialog = new LoadConfigurationDialog(shell, session.getTransactionalEditingDomain());
		dialog.open();

		if(!schemeExists(configuration, scheme)){
			Extension extension = OcciHelper.loadExtension(scheme);
			configuration.getUse().add(extension);
		}

		URI uri_ = dialog.getURIs().get(0);
		Configuration conf = OcciHelper.loadConfiguration(uri_.toString());
		OCCIFactory factory = OCCIFactory.eINSTANCE;

		List<Resource> targetConfigurationResources = configuration.getResources();	
		Map<String, Resource> targetResources = new HashMap<String, Resource>();
		for(Resource resource : conf.getResources()) {

			if(!schemeExists(configuration, resource.getKind().getScheme())){
				Extension extension = OcciHelper.loadExtension(resource.getKind().getScheme());
				configuration.getUse().add(extension);
			}

			Resource targetResource = factory.createResource();
			targetConfigurationResources.add(targetResource);
			copyEntity(configuration, resource,targetResource);
			targetResources.put(resource.getId(), targetResource);
		}

		for(Resource resource : conf.getResources()) {
			Resource targetResource = targetResources.get(resource.getId());
			for(Link sourceLink: resource.getLinks()){
				Link targetLink = factory.createLink();
				targetLink.setSource(targetResource);
				copyEntity(configuration, sourceLink, targetLink);
				// Set the target's link target.
				String sourceLinkTarget = sourceLink.getTarget().getId();
				Resource linkTargetResource = targetResources.get(sourceLinkTarget);
				if(linkTargetResource != null) {
					targetLink.setTarget(linkTargetResource);
				} else {
					System.err.println("Resource " + sourceLinkTarget + " unknown!");
				}
			}
		}
	}

	private static void copyEntity(Configuration configuration, Link source, Link target)
	{
		target.setId(source.getId());
		String sourceKindIdentifier = source.getId();
		Kind targetKind = searchKind(configuration, source.getKind());
		if(targetKind != null) {
			target.setKind(targetKind);
		} else {
			System.err.println("Kind " + sourceKindIdentifier + " unknown!");
		}
		List<Mixin> targetMixins = target.getMixins();
		for(Mixin mixin : source.getMixins()) {
			Mixin targetMixin = searchMixin(configuration, mixin);
			if(targetMixin != null) {
				targetMixins.add(targetMixin);
			} else {
				System.err.println("Mixin  unknown!");
			}
		}
	}


	private static void copyEntity(Configuration configuration, Resource source, Resource target)
	{
		target.setId(source.getId());
		Kind targetKind = searchKind(configuration, source.getKind());
		if(targetKind != null) {
			target.setKind(targetKind);
		} else {
			System.err.println("Kind  unknown!");
		}
		List<Mixin> targetMixins = target.getMixins();
		for(Mixin mixin : source.getMixins()) {
			Mixin targetMixin = searchMixin(configuration, mixin);
			if(targetMixin != null) {
				targetMixins.add(targetMixin);
			} else {
				System.err.println("Mixin unknown!");
			}
		}
		// Create all target entity's attributes.
		List<AttributeState> targetAttributes = target.getAttributes();
		for(AttributeState att: source.getAttributes()) {
			String attributeName = att.getName();
			if(!attributesToOmit.contains(attributeName)) {
				AttributeState targetAttribute = OCCIFactory.eINSTANCE.createAttributeState();
				targetAttributes.add(targetAttribute);
				targetAttribute.setName(att.getName());
				targetAttribute.setValue(att.getValue());
			}
		}
	}

	private static Kind searchKind(Configuration configuration, Kind kind)
	{
		Extension extension = OcciHelper.loadExtension(kind.getScheme().toString());
		if(!schemeExists(configuration, kind.getScheme().toString())){
			configuration.getUse().add(extension);
		}
		String term = kind.getTerm();
		for(Kind k : extension.getKinds()) {
			if(term.equals(k.getTerm())) {
				return k;
			}
		}
		return null;
	}

	private static Mixin searchMixin(Configuration configuration, Mixin mixin)
	{
		String mixinSchemeWithoutSharp = schemeWithoutSharp(mixin.getScheme().toString());
		Extension extension = null;
		for(Extension ext : configuration.getUse()) {
			if(mixinSchemeWithoutSharp.startsWith(schemeWithoutSharp(ext.getScheme()))) {
				extension = ext;
				break;
			}
		}
		if(extension == null) {
			if(!schemeExists(configuration, mixin.getScheme().toString()) ){
				extension = OcciHelper.loadExtension(mixin.getScheme().toString());
				configuration.getUse().add(extension);
			}

		}

		String term = mixin.getTerm();
		for(Mixin m : extension.getMixins()) {
			if(term.equals(m.getTerm())) {
				return m;
			}
		}
		Mixin result = OCCIFactory.eINSTANCE.createMixin();
		result.setScheme(mixin.getScheme().toString());
		//result.setTerm(mixin.getTerm()); //To verify
		extension.getMixins().add(result);
		return result;
	}


	private static String schemeWithoutSharp(String scheme) {
		return scheme.substring(0, scheme.length()-2);
	}

	private void verifyTheAdditionnalResource(ConcurrentHashMap<Entity, Set<Entity>> entities,Configuration conf){
		Map<String, Resource> targetResources = new HashMap<String, Resource>();

		for(Entity entity: entities.keySet()){
			boolean exist=false;
			for(Resource resource : conf.getResources()) {
				if(entity.getId().equals(resource.getId()))
					exist=true;
			}
			if(!exist){
				System.out.println("resource to ADD: "+entity);
				System.out.println("Linked to : "+entities.get(entity));
			}
		}
		
		for(Resource resource : conf.getResources()){
			boolean exist=false;
			for(Entity entity: entities.keySet()) {
				if(entity.getId().equals(resource.getId()))
					exist=true;
			}
			if(!exist){
				System.out.println("resource to Remove: "+resource);
			}
		}

	}

}
