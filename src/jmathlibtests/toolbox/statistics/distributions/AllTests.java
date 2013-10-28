package jmathlibtests.toolbox.statistics.distributions;

import junit.framework.*;

/**
 * TestSuite that runs all the tests
 *
 */
public class AllTests {

	public static void main (String[] args) {
		junit.textui.TestRunner.run (suite());
	}
	public static Test suite ( ) {
		TestSuite suite= new TestSuite("statistics distributions functions");

		/* include subdirectories here */
		// none
        
	    /* include tests in this directory here */
		//suite.addTest(MathLib.Tools.TestSuite.Functions.Statistics.base.testMean.suite());

	    return suite;
	}
}
