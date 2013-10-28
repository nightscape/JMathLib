package jmathlibtests.toolbox.quaternion;

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
		TestSuite suite= new TestSuite("quaternion functions");

		/* include subdirectories here */
		// none
        
	    /* include tests in this directory here */
		// none yet
		
	    return suite;
	}
}
