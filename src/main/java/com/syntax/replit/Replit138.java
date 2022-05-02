package com.syntax.replit;

public class Replit138 {
    static private String returnTypeOfMethod () {
        return "private";
    }
    static String returnTypeOfMethodDef () {
        return "default";
    }
    static protected String returnTypeOfMethodPrtcd () {
        return "protected";
    }
    static public String returnTypeOfMethodPblc () {
        return "public";
    }

}
class Main {
    public static void main(String[] args) {
        System.out.println(Replit138.returnTypeOfMethodDef());
        System.out.println(Replit138.returnTypeOfMethodPrtcd());
        System.out.println(Replit138.returnTypeOfMethodPblc());
    }

}
/*For you to do:
In AnotherClass declare a private, default, protected, public methods and have them each return the name of the what access modifier they are using.
All methods should be accessible by class name
Call methods of Another class inside Main class
Expected Output:
default
protected
public
 */