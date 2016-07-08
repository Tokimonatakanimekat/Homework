package my.testproject;

public class Architect extends Employee {

    private String jobType = "Architect";

    protected Architect(int id, String name){
        super(id, name);
    }

    protected void printEmployee() {
        System.out.println("***Employee: " + this.getName() + "\n" +
                "ID: " + this.getId() + "\n" +
                "Position: " + this.jobType + "\n" +
                "FT: " + this.getFreetime() + "\n");
    }

}
