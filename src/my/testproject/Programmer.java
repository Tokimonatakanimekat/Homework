package my.testproject;

public class Programmer extends Employee {

    private String jobType = "Programmer";

    protected Programmer(int id, String name){
        super(id, name);
    }

    protected void printEmployee() {
        System.out.println("Employee: " + this.getName() + "\n" +
                "ID: " + this.getId() + "\n" +
                "Position: " + this.jobType + "\n");
    }

}
