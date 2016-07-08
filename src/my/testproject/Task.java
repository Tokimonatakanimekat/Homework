package my.testproject;


public class Task {
    private int id = 0;
    private int duration = 0;
    private String name = "null";
    private int taskType = 0;

    protected Task(int id, int duration, String name, int taskType) {
        this.id = id;
        this.duration = duration;
        this.name = name;
        this.taskType = taskType;
    }

    protected int getId(){
        return this.id;
    }
    protected String getName(){
        return this.name;
    }
    protected int getDuration(){
        return this.duration;
    }

    protected int getTaskType(){
        return this.taskType;
    }

    protected void printTask(){
        System.out.println("Task: " + this.name + "\n" + "ID: " + this.id + "\n" + "Duration: " + this.duration);
        switch (this.taskType) {
            case 1:
                System.out.println("This is task for architects" + "\n");
                break;
            case 2:
                System.out.println("This is task for testers" + "\n");
                break;
            case 3:
                System.out.println("This is task for programmers" + "\n");
                break;
            default:
                System.out.println("This is task for Cthulhu" + "\n");
                break;
        }
    }
}
