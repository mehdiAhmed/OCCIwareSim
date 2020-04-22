package org.occiware.clouddesigner.occi.simulation.cloudsim.handlers;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BinomialDistribution
{
	/**
	 * Out of numTrials trials where numCorrect have been chosen correct, 
	 * what is the chance that the result was random when those trials are 50/50 chances each?
	 * 
	 * @see http://phintsan.kapsi.fi/abx.html
	 * @see http://mathworld.wolfram.com/BinomialDistribution.html
	 */
	public static double computePValue(int numCorrect, int numTrials)
	{
		return(computePValue(numCorrect, numTrials, 0.5d));
	}

	/**
	 * Out of numTrials trials each of which have chance chance of being guessed, where numCorrect have been chosen correct, what is the chance that the
	 * result was random?
	 * 
	 * @see http://phintsan.kapsi.fi/abx.html
	 * @see http://mathworld.wolfram.com/BinomialDistribution.html
	 */
	public static double computePValue(int numCorrect, int numTrials, double chance)
	{
		double total = 0d;
		
		// want chance that one could guess numCorrect to numTrials times correctly (since e.g. guessing numCorrect+1 times correctly implies guessing numCorrect times correctly)
		for (int i=numCorrect; i<=numTrials; i++)
		{
			total += binomialDist(i, numTrials, chance);
		}

		return(total);
	}
	
	/**
	 * Compute the binomial distribution function for numCorrect correct choices out of numTrials trials with probability of probValue.
	 * 
	 * @see http://mathworld.wolfram.com/BinomialDistribution.html
	 */
	public static double binomialDist(int numCorrect, int numTrials, double probValue)
	{
		BigInteger ntF = factorial(numTrials);
		BigInteger denom = factorial(numCorrect).multiply(factorial(numTrials - numCorrect));

		BigDecimal ntFBD = new BigDecimal(ntF);
		BigDecimal denomBD = new BigDecimal(denom);
		BigDecimal quotient = ntFBD.divide(denomBD, 40, RoundingMode.HALF_UP);

		BigDecimal restBD = BigDecimal.valueOf(Math.pow(probValue, numCorrect) * Math.pow((1d - probValue), numTrials - numCorrect));
		return(quotient.multiply(restBD).doubleValue());
	}
	
	/**
	 * Compute factorial of n
	 */
	public static BigInteger factorial(int n)
	{
		BigInteger res = BigInteger.ONE;

		for (int i = n; i>1; i--)
		{
			res = res.multiply(BigInteger.valueOf(i));
		}
		return(res);
	}
	
	public static void main(String[] args)
	{
		System.out.println("The pValue of 10 guesses out of 13 for a coin flip is: " + computePValue(2,15));
	}
}

