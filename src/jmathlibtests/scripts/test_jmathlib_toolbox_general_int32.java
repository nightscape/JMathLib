// test_jmathlib_toolbox_general_int32
package jmathlibtests.scripts; 
import jmathlib.tools.junit.framework.JMathLibTestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

public class test_jmathlib_toolbox_general_int32 extends JMathLibTestCase {     
     
    public test_jmathlib_toolbox_general_int32(String name) {           
        super(name);                            
    }                                           
    public static void main (String[] args) {   
        junit.textui.TestRunner.run (suite()); 
    }                                           
 
    public static Test suite() {                
        return new TestSuite(test_jmathlib_toolbox_general_int32.class); 
    } 

    public void test_jmathlib_toolbox_general_int320()           
    { 
           ml.executeExpression("a=int32(8);");
           ml.executeExpression("b=class(a);");
           assertEquals( "int32", ml.getString("b"));
         
    }
}
