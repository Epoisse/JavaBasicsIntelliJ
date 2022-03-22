package com.syntax.homework;

public class Draft3 {

}
class Main {

    public static void main (String []args) {
        EncapsulationDemo main =new EncapsulationDemo();
        main.setEmpName("John");
        main.setEmpAge(30);
        System.out.println("Employee Name: "+main.getEmpName());
        System.out.println("Employee Age: "+main.getEmpAge());
    }

}
class EncapsulationDemo {
    private String empName;
    private int empAge;

    public void setEmpName (String empName) {
        this.empName=empName;
    }
    public void setEmpAge (int empAge) {
        this.empAge=empAge;
    }
    public String getEmpName () {
        return empName;
    }
    public int getEmpAge () {
        return empAge;
    }

}