// test_jmathlib_toolbox_jmathlib_internal_pi
package jmathlibtests.scripts; 
import jmathlib.tools.junit.framework.JMathLibTestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

public class test_jmathlib_toolbox_jmathlib_internal_pi extends JMathLibTestCase {     
     
    public test_jmathlib_toolbox_jmathlib_internal_pi(String name) {           
        super(name);                            
    }                                           
    public static void main (String[] args) {   
        junit.textui.TestRunner.run (suite()); 
    }                                           
 
    public static Test suite() {                
        return new TestSuite(test_jmathlib_toolbox_jmathlib_internal_pi.class); 
    } 

    public void test_jmathlib_toolbox_jmathlib_internal_pi0()           
    { 
           ml.executeExpression("clear('all');");
           ml.executeExpression("a=pi;");
           assertEquals( 3.1415926, ml.getScalarValueRe("a"), 0.0001);
           assertTrue(0 == ml.getScalarValueIm("a"));
         
    }
}
