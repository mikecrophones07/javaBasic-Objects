package com.cultivation.javaBasic.showYourIntelligence;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class StackFrameHelper {
    public static String getCurrentMethodName() {
        // TODO: please modify the following code to pass the test
        // <--start
        String obj1 = new Exception().getStackTrace()[1].getClassName();
        String obj2 = new Exception().getStackTrace()[1].getMethodName();
        return new StringBuilder().append(obj1).append(".").append(obj2).toString();
        // --end-->
    }
}
