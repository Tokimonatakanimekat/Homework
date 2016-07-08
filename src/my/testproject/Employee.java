package my.testproject;

import java.util.ArrayList;

public class Employee {
    private int id;
    private String name;
    private int freetime = 480; // in minutes
    private ArrayList<Task> assignedTasks = new ArrayList<>();

    protected Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    protected void changeFtime(int a){
        this.freetime -= a;
    }

    protected int getId(){
        return this.id;
    }

    protected String getName(){
        return this.name;
    }

    protected int getFreetime(){
        return this.freetime;
    }

    protected void assignTask(Task t) {
        assignedTasks.add(t);
        this.changeFtime(t.getDuration());
    }

    protected void printTasks(){
        if (!assignedTasks.isEmpty()) {
            for (Task t : assignedTasks) {
                t.printTask();
            }
        } else System.out.println("User has no tasks!");
        System.out.println("*-------*");
    }
}
