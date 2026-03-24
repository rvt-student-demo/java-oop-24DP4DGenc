package rvt;

import java.util.ArrayList;

public class To_do_list {
    private ArrayList<String> tasks;

    public To_do_list() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        tasks.add(task);
    }

    public void print() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ": " + tasks.get(i));
        }
    }

    public void remove(int number) {
        tasks.remove(number - 1);
    }
}