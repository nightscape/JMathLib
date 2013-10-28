// test_jmathlib_toolbox_jmathlib_internal_minusminus
package jmathlibtests.scripts; 
import jmathlib.tools.junit.framework.JMathLibTestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

public class test_jmathlib_toolbox_jmathlib_internal_minusminus extends JMathLibTestCase {     
     
    public test_jmathlib_toolbox_jmathlib_internal_minusminus(String name) {           
        super(name);                            
    }                                           
    public static void main (String[] args) {   
        junit.textui.TestRunner.run (suite()); 
    }                                           
 
    public static Test suite() {                
        return new TestSuite(test_jmathlib_toolbox_jmathlib_internal_minusminus.class); 
    } 

    public void test_jmathlib_toolbox_jmathlib_internal_minusminus0()           
    { 
           ml.executeExpression("a=2;");
           ml.executeExpression("a--;");
           assertTrue(1 == ml.getScalarValueRe("a"));
           assertTrue(0 == ml.getScalarValueIm("a"));
         
    }
}
