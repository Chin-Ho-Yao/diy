package com.yao.testutil.initorder.Base;

public class Derived extends Base {

    static { System.out.println("Derived Static Block 1"); }

    private static String staticValue = Log.initLog("Derived Static Fiels");

    static { System.out.println("Derived Static Block 2"); }

    { System.out.println("Derived Normal Block 1"); }

    private String value = Log.initLog("Derived Normal Field");

    { System.out.println("Derived Normal Block 2"); }

    Derived() { System.out.println("Derived Constructor"); }


}