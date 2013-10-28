package jmathlibtests.toolbox.jmathlib.matrix;

import jmathlib.core.interpreter.Interpreter;
import jmathlibtests.Compare;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class testFliplr extends TestCase {
	protected Interpreter ml;
	
    public testFliplr(String name) {
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
		return new TestSuite(testFliplr.class);
	}

    /****** Fliplr() ***********************************************************/
    public void testFliplr01() {
        double[][] b = {{3.0, 2.0, 1.0},{6.0, 5.0, 4.0},{9.0, 8.0, 7.0}};
        ml.executeExpression("a = [1, 2, 3; 4, 5, 6; 7, 8, 9];");
        ml.executeExpression("b = fliplr(a)");
 		assertTrue(Compare.ArrayEquals(b, ml.getArrayValueRe("b")));
	}
 
}