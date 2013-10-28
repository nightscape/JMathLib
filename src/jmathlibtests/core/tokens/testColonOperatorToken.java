package jmathlibtests.core.tokens;

import jmathlib.core.interpreter.Interpreter;
import junit.framework.*;

public class testColonOperatorToken extends TestCase {
	protected Interpreter ml;
	
    public testColonOperatorToken(String name) {
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
		return new TestSuite(testColonOperatorToken.class);
	}

	/************* simple expressions ****************************************/
    public void test001() {
        ml.executeExpression("a=[0:1:10];b=a(2);c=a(6)");
		assertTrue(1 == ml.getScalarValueRe("b"));
        assertTrue(5 == ml.getScalarValueRe("c"));
	}


												    
}