// test_jmathlib_toolbox_general_bitor
package jmathlibtests.scripts; 
import jmathlib.tools.junit.framework.JMathLibTestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

public class test_jmathlib_toolbox_general_bitor extends JMathLibTestCase {     
     
    public test_jmathlib_toolbox_general_bitor(String name) {           
        super(name);                            
    }                                           
    public static void main (String[] args) {   
        junit.textui.TestRunner.run (suite()); 
    }                                           
 
    public static Test suite() {                
        return new TestSuite(test_jmathlib_toolbox_general_bitor.class); 
    } 

    public void test_jmathlib_toolbox_general_bitor0()           
    { 
                 ml.executeExpression("a=abs(-3);");
                 assertTrue(3 == ml.getScalarValueRe("a"));
         
    }

    public void test_jmathlib_toolbox_general_bitor1()           
    { 
                  ml.executeExpression("a=abs(1);");
                 assertTrue(1 == ml.getScalarValueRe("a"));
         
    }
}
