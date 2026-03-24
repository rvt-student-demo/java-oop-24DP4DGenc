package rvt;

import java.util.Scanner;

public class Todolist_test {
    public static void main(String[] args) {
        To_do_list list = new To_do_list();
        Scanner scanner = new Scanner(System.in);
        UserInterface ui = new UserInterface(list, scanner);
        ui.start();
    }
}
