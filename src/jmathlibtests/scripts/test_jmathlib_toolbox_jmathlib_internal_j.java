// test_jmathlib_toolbox_jmathlib_internal_j
package jmathlibtests.scripts; 
import jmathlib.tools.junit.framework.JMathLibTestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

public class test_jmathlib_toolbox_jmathlib_internal_j extends JMathLibTestCase {     
     
    public test_jmathlib_toolbox_jmathlib_internal_j(String name) {           
        super(name);                            
    }                                           
    public static void main (String[] args) {   
        junit.textui.TestRunner.run (suite()); 
    }                                           
 
    public static Test suite() {                
        return new TestSuite(test_jmathlib_toolbox_jmathlib_internal_j.class); 
    } 

    public void test_jmathlib_toolbox_jmathlib_internal_j0()           
    { 
           ml.executeExpression("a=3;");
           assertTrue(3 == ml.getScalarValueRe("a"));
           assertTrue(0 == ml.getScalarValueIm("a"));
         
    }

    public void test_jmathlib_toolbox_jmathlib_internal_j1()           
    { 
           ml.executeExpression("a=2+3i;");
           assertTrue(2 == ml.getScalarValueRe("a"));
           assertTrue(3 == ml.getScalarValueIm("a"));
         
    }

    public void test_jmathlib_toolbox_jmathlib_internal_j2()           
    { 
           ml.executeExpression("a=i;");
           assertTrue(0 == ml.getScalarValueRe("a"));
           assertTrue(1 == ml.getScalarValueIm("a"));
         
    }
}
