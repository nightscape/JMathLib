// test_jmathlib_toolbox_general_uint8
package jmathlibtests.scripts; 
import jmathlib.tools.junit.framework.JMathLibTestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

public class test_jmathlib_toolbox_general_uint8 extends JMathLibTestCase {     
     
    public test_jmathlib_toolbox_general_uint8(String name) {           
        super(name);                            
    }                                           
    public static void main (String[] args) {   
        junit.textui.TestRunner.run (suite()); 
    }                                           
 
    public static Test suite() {                
        return new TestSuite(test_jmathlib_toolbox_general_uint8.class); 
    } 

    public void test_jmathlib_toolbox_general_uint80()           
    { 
           ml.executeExpression("a=uint16(88);");
           ml.executeExpression("b=class(a);");
           assertEquals( "uint16", ml.getString("b"));
         
    }
}
