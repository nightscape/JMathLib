package jmathlibtests.toolbox.jmathlib.matrix;

import jmathlib.core.interpreter.Interpreter;
import jmathlibtests.Compare;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class testNe extends TestCase {
	protected Interpreter ml;
	
    public testNe(String name) {
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
		return new TestSuite(testNe.class);
	}

    /*****************************************************************/
	public void testNe01() {
        ml.executeExpression("a=ne(5,5);");
		assertTrue(false == ml.getScalarValueBoolean("a"));
	}

    public void testNe02() {
        ml.executeExpression("b=ne(5,6)");
		assertTrue(true == ml.getScalarValueBoolean("b"));
	}

    public void testNe03() {
        ml.executeExpression("b=ne(6,5)");
		assertTrue(true == ml.getScalarValueBoolean("b"));
    }

    public void testNe04() {
        ml.executeExpression("b=ne(0,0)");
		assertTrue(false == ml.getScalarValueBoolean("b"));
	}
    
    public void testNe05() {
        boolean[][] c = {{true, true},{false, true}};
        ml.executeExpression("a=[1,3; 2,3]");
        ml.executeExpression("b=[0,7; 2,7]");
        ml.executeExpression("z = ne(a,b)");
 		assertTrue(Compare.ArrayEquals(c, ml.getArrayValueBoolean("z")));
	}
 
}