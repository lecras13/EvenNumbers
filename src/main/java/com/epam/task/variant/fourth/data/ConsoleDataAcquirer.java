package com.epam.task.variant.fourth.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleDataAcquirer implements DataAcquirer {
    public List<Integer> getNumbers() {
        List<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        while (list.size() < 4) {
            list.add(scanner.nextInt());
        }
        return list;
    }
}
