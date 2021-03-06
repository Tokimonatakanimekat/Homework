package my.testproject;

public class Tester extends Employee {

    private String jobType = "Tester";

    protected Tester(int id, String name){
        super(id, name);
    }

    protected void printEmployee() {
        System.out.println("Employee: " + this.getName() + "\n" +
                "ID: " + this.getId() + "\n" +
                "Position: " + this.jobType + "\n");
    }

}
