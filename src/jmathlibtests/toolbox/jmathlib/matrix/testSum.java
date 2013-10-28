package jmathlibtests.toolbox.jmathlib.matrix;

import jmathlib.core.interpreter.Interpreter;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class testSum extends TestCase {
	protected Interpreter ml;
	
    public testSum(String name) {
		super(name);
	}
	public static void main (String[] args) {
		junit.textui.TestRunner.run(suite());
	}
	protected void setUp() {
		ml = new Interpreter(true);
	}
    protected void tearDown() {
        ml = null;
    }

	public static Test suite() {
		return new TestSuite(testSum.class);
	}

	public void testSum01() {
        ml.executeExpression("a=sum([1,2,3])");
        assertTrue(6.0 == ml.getScalarValueRe("a"));
	}

    public void testSum02() {
        ml.executeExpression("a=sum([2,2,3])");
        assertTrue(7.0 == ml.getScalarValueRe("a"));
    }

	

}