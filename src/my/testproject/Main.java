package my.testproject;

public class Main {

    public static void main(String[] args) {

        Tester vasya = new Tester(2, "Vasiliy");
        System.out.println(vasya.toString());
        vasya.printTasks();
    }
}
