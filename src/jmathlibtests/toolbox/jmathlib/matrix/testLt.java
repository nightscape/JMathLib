package jmathlibtests.toolbox.jmathlib.matrix;

import jmathlib.core.interpreter.Interpreter;
import jmathlibtests.Compare;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class testLt extends TestCase {
	protected Interpreter ml;
	
    public testLt(String name) {
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
		return new TestSuite(testLt.class);
	}

    /*****************************************************************/
	public void testLt01() {
        ml.executeExpression("a=lt(5,5);");
		assertTrue(false == ml.getScalarValueBoolean("a"));
	}

    public void testLt02() {
        ml.executeExpression("b=lt(5,6)");
		assertTrue(true == ml.getScalarValueBoolean("b"));
	}

    public void testLt03() {
        ml.executeExpression("b=lt(6,5)");
		assertTrue(false == ml.getScalarValueBoolean("b"));
    }

    public void testLt04() {
        ml.executeExpression("b=lt(0,0)");
		assertTrue(false == ml.getScalarValueBoolean("b"));
	}
    
    public void testLt05() {
        boolean[][] c = {{false, true},{false, true}};
        ml.executeExpression("a=[1,3; 2,3]");
        ml.executeExpression("b=[0,7; 2,7]");
        ml.executeExpression("z = lt(a,b)");
 		assertTrue(Compare.ArrayEquals(c, ml.getArrayValueBoolean("z")));
	}
 
}