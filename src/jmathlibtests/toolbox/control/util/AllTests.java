package jmathlibtests.toolbox.control.util;

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
		TestSuite suite= new TestSuite("control util functions");

		/* include subdirectories here */
		//suite.addTest(MathLib.Tools.TestSuite.Functions.Control.system.AllTests.suite());
        
	    /* include tests in this directory here */
		suite.addTest(jmathlibtests.toolbox.control.util.testSwap.suite());


	    return suite;
	}
}
