package jmathlibtests.toolbox.jmathlib.system;

import jmathlib.core.interpreter.Interpreter;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class testUsage extends TestCase {
	protected Interpreter ml;
	
    public testUsage(String name) {
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
		return new TestSuite(testUsage.class);
	}

	public void testAbs01() {
        ml.executeExpression("a=abs(1);");
		assertTrue(1 == ml.getScalarValueRe("a"));
	}
    public void testAbs02() {
        ml.executeExpression("a=abs(-3);");
		assertTrue(3 == ml.getScalarValueRe("a"));
	}



}
