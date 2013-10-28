package jmathlibtests.toolbox.jmathlib.system;

import jmathlib.tools.junit.framework.JMathLibTestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

public class testGetDebug extends JMathLibTestCase {
	
    public testGetDebug(String name) {
		super(name);
	}
	public static void main (String[] args) {
		junit.textui.TestRunner.run (suite());
	}

	public static Test suite() {
		return new TestSuite(testGetDebug.class);
	}

	public void testGetDebug01() {
	    assertEvalScalarEquals("setdebug(1); a=getdebug()","a", true);
	}

    public void testGetDebug02() {
        assertEvalScalarEquals("setdebug(0); a=getdebug()","a", false);
    }
   



}
