package com.syntax.class33;

public class DoSomething {
    void doSomething (int a, int b){
        Calc calc=new Calc();
        calc.doTheMath(a,b);
    }

    public static void main(String[] args) {
        DoSomething doSomething=new DoSomething();
        doSomething.doSomething(10, 2);
    }
}
