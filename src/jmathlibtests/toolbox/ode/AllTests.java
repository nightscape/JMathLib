package jmathlibtests.toolbox.ode;

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
		TestSuite suite= new TestSuite("ode functions");

		/* include subdirectories here */
		// none
        
	    /* include tests in this directory here */
		// none yet
		
	    return suite;
	}
}
