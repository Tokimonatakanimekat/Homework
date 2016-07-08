package my.testproject;

/**
 * Created by Doppelori on 07.07.2016.
 */
public class Task {
    private int id;

    protected Task() {
        this.id = 0;
    }

    protected Task(int id) {
        this.id = id;
    }

    protected int getId(){
        return this.id;

    }
}
