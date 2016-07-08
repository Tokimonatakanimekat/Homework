package my.testproject;

import java.util.ArrayList;

public class Employee {
    private int id;
    private String name;
    private int freetime = 480; // in minutes
    private ArrayList<Task> assignedTasks = new ArrayList<>();

    /*protected Employee(){
        this.id = -1;
        this.name = "null";
    }*/

    protected Employee(int id, String name) {
        this.id = id;
        this.name = name;
        //Task t = new Task(1337);
        //this.assignedTasks.add(0, t);
    }

    //@Override //--- ПЕРЕДЕЛАТЬ ХУИТУ
    /*public String toString() {
        return (this.id + " " + this.name + " " + this.freetime);
    }*/

    protected void changeFtime(int a){
        this.freetime -= a;
    }

    protected void printTasks(){
        if (!assignedTasks.isEmpty()) {
            for (Task t : assignedTasks) {
                //НАПИШИ МЕТОД У ТАСКА НА ВЫВОД
            }
        } else System.out.println("User has no tasks!");
    }
}
