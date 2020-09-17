package com.epam.task.variant.fourth.view;

public class ConsoleResultPrinter implements ResultPrinter {
    public void print(boolean result) {
        System.out.println("Our result is: " + result);
    }
}
