package jmathlibtests.toolbox.jmathlib.matrix;

import jmathlib.core.interpreter.Interpreter;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class testNumel extends TestCase {
	protected Interpreter ml;
	
    public testNumel(String name) {
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
		return new TestSuite(testNumel.class);
	}

    
	public void testNumel01() {
        ml.executeExpression("a = numel([8,2,6,1,9])");
        assertTrue(5 == ml.getScalarValueRe("a"));
	}

    public void testNumel02() {
        ml.executeExpression("a = numel([8,1,1,1])");
        assertTrue(4 == ml.getScalarValueRe("a"));
    }

    public void testNumel10() {
        ml.executeExpression("a = numel([8,1,1; 3,5,3; 2,9,4; 2,3,4])");
        assertTrue(12 == ml.getScalarValueRe("a"));
    }

 
}