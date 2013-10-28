package jmathlibtests.toolbox.finance;

import jmathlib.core.interpreter.Interpreter;
import junit.framework.*;

public class testFvl extends TestCase {
	protected Interpreter ml;
	
    public testFvl(String name) {
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
		return new TestSuite(testFvl.class);
	}

 
	public void testFvl01() {
        ml.executeExpression(" a= fvl(1,2,3) "); 
		assertTrue(12.0 == ml.getScalarValueRe("a"));
	}

 
}