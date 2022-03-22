package com.syntax.groupProgect2;

public class MarksAvg {
    public static void main(String[] args) {
        Students []students= {new StudentA("Joe", "Trump", 23,32,45),
                new StudentB("Donald", "Baiden",33,22,11,54)};
        for (Students s:students
             ) {
            System.out.println("Average grade for student "+s.name+" "+ s.lastName+" is "+s.getPercentage());
        }
    }
}
abstract class Marks {
    abstract double getPercentage ();
}
class Students extends Marks {
    String name;
    String lastName;
    double math;
    double history;
    double coding;

    public Students(String name, String lastName, double math, double history, double coding) {
        this.name = name;
        this.lastName = lastName;
        this.math = math;
        this.history = history;
        this.coding = coding;
    }

    @Override
    double getPercentage() {
        return 0;
    }
}
class StudentA extends Students {

    public StudentA(String name, String lastName, double math, double history, double coding) {
        super(name, lastName, math, history, coding);
    }

    @Override
    double getPercentage() {
        return (math+history+coding)/3;
    }
}
class StudentB extends Students {
    double chemistry;

    public StudentB(String name, String lastName, double math, double history, double coding, double chemistry) {
        super(name, lastName, math, history, coding);
        this.chemistry = chemistry;
    }

    @Override
    double getPercentage() {
        return (math+history+coding+chemistry)/4;
    }
}