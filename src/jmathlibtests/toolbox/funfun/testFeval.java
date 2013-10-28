/* 
 * This file is part or JMathLib 
 * 
 * Check it out at http://www.jmathlib.de
 *
 * Author:  Stefan Mueller (stefan@held-mueller.de) 
 * (c) 2007, 2008, 2009   
 */

package jmathlibtests.toolbox.funfun;

import jmathlib.core.interpreter.Interpreter;
import junit.framework.*;

public class testFeval extends TestCase {
	protected Interpreter ml;
	
    public testFeval(String name) {
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
		return new TestSuite(testFeval.class);
	}

    /****** feval() ***********************************************************/
	public void testFeval01() {
        ml.executeExpression("a=feval('sin',0);");
		assertTrue(0 == ml.getScalarValueRe("a"));
	}
    public void testFeval02() {
        ml.executeExpression("a=feval('cos',0);");
        assertTrue(1.0 == ml.getScalarValueRe("a"));
    }
    public void testFeval03() {
        ml.executeExpression("a=feval('min',2,5);");
        assertTrue(2.0 == ml.getScalarValueRe("a"));
    }
    public void testFeval04() {
        ml.executeExpression("a=feval('max',2,5);");
        assertTrue(5.0 == ml.getScalarValueRe("a"));
    }
    public void testFeval05() {
        // test repeated evaluation of functions
        ml.executeExpression("a=feval('max',2,6);");
        assertTrue(6.0 == ml.getScalarValueRe("a"));
    }
    public void testFeval06() {
        // test repeated evaluation of functions
        ml.executeExpression("a=feval('max',3,6);");
        assertTrue(6.0 == ml.getScalarValueRe("a"));
    }


}