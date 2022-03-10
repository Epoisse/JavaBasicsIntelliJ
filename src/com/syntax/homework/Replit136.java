package com.syntax.homework;

public class Replit136 {

    private void prvtMethod() {
        System.out.println("This is Private Method");
    }

    void dfltMethod() {
        System.out.println("This is Default Method");
    }

    protected void prtdMethod() {
        System.out.println("This is Protected Method");
    }

    public void pblMethod() {
        System.out.println("This is Public Method");
    }

    public static void main(String[] args) {
        new Replit136().prvtMethod();
        new Replit136().dfltMethod();
        new Replit136().prtdMethod();
        new Replit136().pblMethod();
    }

}
/*For you to do:
Please create methods with different access modifiers (one for each access modifier)
and call them properly in main method one by one
In each method write the logic accordingly like for private method write the logic
in the println Statement as "This is Private Method" accordingly for rest of the
methods that have different access modifiers should be a total of 4 outputs,
please make sure they are in the same order that is printed below.

Expected Output:

This is Private Method
This is Default Method
This is Protected Method
This is Public Method
*/