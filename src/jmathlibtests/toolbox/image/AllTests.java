package jmathlibtests.toolbox.image;

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
		TestSuite suite= new TestSuite("image functions");

		/* include subdirectories here */
		//suite.addTest(MathLib.Tools.TestSuite.Functions.Control.system.AllTests.suite());
        
	    /* include tests in this directory here */
		//suite.addTest(MathLib.Tools.TestSuite.Functions.Control.testXXX.suite());

	    return suite;
	}
}
