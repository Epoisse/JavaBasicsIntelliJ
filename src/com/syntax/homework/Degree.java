package com.syntax.homework;

public class Degree {
   void getPrerequisite () {
       System.out.println("To get a degree yu need high school diploma");
   }
}
class Bachelors extends Degree {
}

class Masters extends Degree {
    void getPrerequisite() {
        System.out.println("To get a Masters you need Bachelor Degree");
    }
}
class DegreeTest {
    public static void main(String[] args) {
        new Degree().getPrerequisite();
        new Bachelors().getPrerequisite();
        new Masters().getPrerequisite();
    }
}