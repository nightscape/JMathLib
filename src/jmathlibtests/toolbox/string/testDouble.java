package jmathlibtests.toolbox.string;

import jmathlib.core.interpreter.Interpreter;
import jmathlibtests.Compare;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class testDouble extends TestCase {
	protected Interpreter ml;
	
    public testDouble(String name) {
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
		return new TestSuite(testDouble.class);
	}

	public void testDouble01a() {
        ml.executeExpression(" a=double(\"1\"); ");
		assertTrue(ml.getScalarValueRe("a") == 49);
	}
	public void testDouble01b() {
        ml.executeExpression(" a=_double(\"1\"); ");
		assertTrue(ml.getScalarValueRe("a") == 49);
	}
    public void testDouble02a() {
        double[][] b = {{97, 100, 103, 57}};
        ml.executeExpression(" a=double(\"adg9\"); ");
        assertTrue(Compare.ArrayEquals(b, ml.getArrayValueRe("a")));
    }
    public void testDouble02b() {
        double[][] b = {{97, 100, 103, 57}};
        ml.executeExpression(" a=_double(\"adg9\"); ");
        assertTrue(Compare.ArrayEquals(b, ml.getArrayValueRe("a")));
    }

}
