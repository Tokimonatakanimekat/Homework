package my.testproject;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void swap(Employee[] a, int i, int j){
        Employee temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void bubbleSort (Employee[] arr) {
        boolean proceed = true;
        while (proceed) {
            proceed = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].getFreetime() > arr[i + 1].getFreetime()) {
                    swap(arr, i, i+1);
                    proceed = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Architect[] architects = new Architect[5];
        Tester[] testers = new Tester[5];
        Programmer[] programmers = new Programmer[5];
        ArrayList<Task> taskpool = new ArrayList<>();
        ArrayList<Task> unassignedTasks = new ArrayList<>();
        boolean flag = false;

        for (int i = 0; i<5; i++) {
            architects[i] = new Architect(i+1, ("Vasya" + (i+1)));
            testers[i] = new Tester(i+1, ("Petya" + (i+1)));
            programmers[i] = new Programmer(i+1, ("Kolya" + (i+1)));
        }

        for (int i = 0; i<10; i++) {
            Random d = new Random();
            taskpool.add(i, (new Task(i+1, d.nextInt(151)+30, "Task" + (i+1), d.nextInt(3)+1)));
            //taskpool.get(i).printTask();
        }

        bubbleSort(architects);

        for (Task tk : taskpool) {
            switch(tk.getTaskType()){
                case 1:{
                    if (architects[architects.length - 1].getFreetime() >= tk.getDuration()) {
                        architects[architects.length - 1].assignTask(tk);
                        //taskpool.remove(tk);
                        bubbleSort(architects);
                    } else {
                        System.out.println("No free architects for this task!");
                        unassignedTasks.add(tk);
                        //taskpool.remove(tk);
                    }
                    break;
                }
                case 2:{

                }
                case 3:{

                }
            }
        }

        for (Architect arch : architects) {
            arch.printEmployee();
            arch.printTasks();
        }


    }
}
