package com.syntax.reviewclass7;

public class objectsAndClass {

    String empName;
    int empID;
    String group;

    void employeeDetails() {
        System.out.println(empName + empID);
    }

    void employeeGroup() {
        System.out.println(group);
    }

    public static void main(String[] args) {
        objectsAndClass obj=new objectsAndClass();
        obj.empID=234324;
        obj.employeeDetails();

    }

}
