/* 
 * This file is part or JMathLib 
 * 
 * Check it out at http://www.jmathlib.de
 *
 * Author:  Stefan Mueller (stefan@held-mueller.de) 
 * (c) 2007, 2008, 2009   
 */

package jmathlibtests.toolbox.toolbox_skeleton;

import jmathlib.core.interpreter.Interpreter;
import jmathlib.tools.junit.framework.JMathLibTestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

public class testTemplate extends JMathLibTestCase {
	protected Interpreter ml;
	
    public testTemplate(String name) {
		super(name);
	}
	public static void main (String[] args) {
		junit.textui.TestRunner.run (suite());
	}

	public static Test suite() {
		return new TestSuite(testTemplate.class);
	}

	public void testTemplate01() {
        assertEvalScalarEquals("a=abs(8)", "a", 8);
	}
    public void testTemplate02() {
        assertEvalScalarEquals("A=abs(88)", "A", 88);
	}
    public void testTemplate03() {
        assertEvalScalarEquals("b=55", "b", 55);
    }



}
