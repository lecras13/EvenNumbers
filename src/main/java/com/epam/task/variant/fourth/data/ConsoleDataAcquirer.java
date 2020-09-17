package com.epam.task.variant.fourth.data;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ConsoleDataAcquirer implements DataAcquirer {
    public List<Integer> getNumbers() {
        List<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 4 integers:");
        try {
            while (list.size() < 4) {
                list.add(scanner.nextInt());
            }
        } catch (InputMismatchException e) {
            System.out.println("Illegal argument!Not a number!");
        } finally {
            scanner.close();
        }
        return list;
    }
}
