package jmathlibtests.core.functions;

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
		TestSuite suite= new TestSuite("functions");

		/* include subdirectories here */
        //suite.addTest(jmathlibtests.core.graphics.AllTests.suite());


		/* include tests in this directory here */
		//suite.addTest(MathLib.Tools.TestSuite.Interpreter.testParser.suite());

	    return suite;
	}
}

