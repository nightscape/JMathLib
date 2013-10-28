package jmathlibtests.core.tokens;

import jmathlib.core.interpreter.Interpreter;
import junit.framework.*;

public class testScalarToken extends TestCase {
	protected Interpreter ml;
	
    public testScalarToken(String name) {
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
		return new TestSuite(testScalarToken.class);
	}

	/************* simple expressions ****************************************/
    public void test001() {
        ml.executeExpression("a=2+3");
		assertTrue(5 == ml.getScalarValueRe("a"));
	}


												    
}