package jmathlibtests.toolbox.polynomial;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * TestSuite that runs all the tests
 *
 */
public class AllTests {

	public static void main (String[] args) {
		junit.textui.TestRunner.run (suite());
	}
	public static Test suite ( ) {
		TestSuite suite= new TestSuite("polynomial functions");

		/* include subdirectories here */
		// none
        
	    /* include tests in this directory here */
		suite.addTest(jmathlibtests.toolbox.polynomial.testBinomial.suite());

	    return suite;
	}
}
