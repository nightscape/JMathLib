package jmathlibtests.toolbox.jmathlib.matrix;

import jmathlib.core.interpreter.Interpreter;
import jmathlibtests.Compare;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class testAdjoint extends TestCase {
	protected Interpreter ml;
	
    public testAdjoint(String name) {
		super(name);
	}
	public static void main (String[] args) {
		junit.textui.TestRunner.run (suite());
	}
	protected void setUp() {
		ml = new Interpreter(true);
	}

    protected void tearDown() {
        ml = null;
    }

	public static Test suite() {
		return new TestSuite(testAdjoint.class);
	}

    public void testAdjoint01() {
        double[][] b = {{5, -3},{-4, 2}};
        ml.executeExpression("z = adjoint([2,3;4,5])");
 		assertTrue(Compare.ArrayEquals(b, ml.getArrayValueRe("z")));
	}

}