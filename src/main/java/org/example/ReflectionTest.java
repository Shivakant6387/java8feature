package org.example;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionTest {
    public static void main(String args[]){
        try {
            Class c=Class.forName("com.w3spoint.TestClass");
            Method method = c.getMethod("display", String.class);
            Parameter[] parameters = method.getParameters();
            //We can also use getParameterTypes() to get parameter type list
            for(int i=0; i<parameters.length; i++){
                System.out.println("Parameter name: " + parameters[i].getName());
                System.out.println("Parameter Type: " + parameters[i].getType());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
