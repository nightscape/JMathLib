// test_jmathlib_toolbox_general_sign
package jmathlibtests.scripts; 
import jmathlib.tools.junit.framework.JMathLibTestCase;
import junit.framework.Test;
import junit.framework.TestSuite;

public class test_jmathlib_toolbox_general_sign extends JMathLibTestCase {     
     
    public test_jmathlib_toolbox_general_sign(String name) {           
        super(name);                            
    }                                           
    public static void main (String[] args) {   
        junit.textui.TestRunner.run (suite()); 
    }                                           
 
    public static Test suite() {                
        return new TestSuite(test_jmathlib_toolbox_general_sign.class); 
    } 

    public void test_jmathlib_toolbox_general_sign0()           
    { 
           ml.executeExpression("a=sign(0i);");
           assertTrue(0 == ml.getScalarValueRe("a"));
           assertTrue(0 == ml.getScalarValueIm("a"));
         
    }

    public void test_jmathlib_toolbox_general_sign1()           
    { 
           ml.executeExpression("a=sign(-5i);");
           assertTrue(0  == ml.getScalarValueRe("a"));
           assertTrue(-1 == ml.getScalarValueIm("a"));
         
    }

    public void test_jmathlib_toolbox_general_sign2()           
    { 
           ml.executeExpression("a=sign(8i);");
           assertTrue(0 == ml.getScalarValueRe("a"));
           assertTrue(1 == ml.getScalarValueIm("a"));
         
    }

    public void test_jmathlib_toolbox_general_sign3()           
    { 
           ml.executeExpression("a=sign(0);");
           assertTrue(0 == ml.getScalarValueRe("a"));
           assertTrue(0 == ml.getScalarValueIm("a"));
         
         
    }

    public void test_jmathlib_toolbox_general_sign4()           
    { 
           ml.executeExpression("a=sign(-12);");
           assertTrue(-1 == ml.getScalarValueRe("a"));
           assertTrue(0  == ml.getScalarValueIm("a"));
         
    }

    public void test_jmathlib_toolbox_general_sign5()           
    { 
           ml.executeExpression("a=sign(11);");
           assertTrue(1 == ml.getScalarValueRe("a"));
           assertTrue(0 == ml.getScalarValueIm("a"));
         
    }
}
