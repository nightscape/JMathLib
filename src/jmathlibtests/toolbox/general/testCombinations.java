package jmathlibtests.toolbox.general;

import jmathlib.core.interpreter.Interpreter;
import junit.framework.*;

public class testCombinations extends TestCase {
	protected Interpreter ml;
	
    public testCombinations(String name) {
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
		return new TestSuite(testCombinations.class);
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
