package jmathlibtests.ui;

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
		TestSuite suite= new TestSuite("ui");

		/* include subdirectories here */
        //suite.addTest(jmathlibtests.core.functions.AllTests.suite());
        

		/* include tests in this directory here */
		//suite.addTest(MathLib.Tools.TestSuite.Interpreter.testParser.suite());

	    return suite;
	}
}

