package OcciSimulation.design.extended.services;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Configuration;
import org.eclipse.cmf.occi.core.Extension;
import org.eclipse.cmf.occi.core.Kind;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Mixin;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.core.util.OcciHelper;

public final class SimulationHelper {
	
	
	private SimulationHelper()
	{
	}
	
	public static final Set<String> attributesToOmit = new HashSet<String>();
	static {
		attributesToOmit.add("occi.core.id");
		attributesToOmit.add("occi.core.source");
		attributesToOmit.add("occi.core.target");
	};
	
	public static boolean schemeExists(Configuration configuration, String scheme){

		Extension extension = OcciHelper.loadExtension(scheme);
		ArrayList<String> schemas = new ArrayList<String>();

		for(Extension ex: configuration.getUse()){
			schemas.add(ex.getScheme());
		}
		return schemas.contains(extension.getScheme());

	}

	public static boolean isCompute(Resource resource){
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
	
	
	public static void copyEntity(Configuration configuration, Link source, Link target)
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


	public static void copyEntity(Configuration configuration, Resource source, Resource target)
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
		//result.setTerm(mixin.getTerm()); To verify
		extension.getMixins().add(result);
		return result;
	}


	private static String schemeWithoutSharp(String scheme) {
		return scheme.substring(0, scheme.length()-2);
	}

}
