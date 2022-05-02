package com.syntax.class19;

public class TaskFourConstructors {

private TaskFourConstructors () {
    System.out.println("First constructor");
}
TaskFourConstructors (int a, String b) {
    System.out.println(b+a);
}
protected TaskFourConstructors (double c, float d) {
    System.out.println(c+d);
}
public TaskFourConstructors (int e) {
    System.out.println(e);
}

    public static void main(String[] args) {
        TaskFourConstructors taskFourConstructors=new TaskFourConstructors();
    }
}
