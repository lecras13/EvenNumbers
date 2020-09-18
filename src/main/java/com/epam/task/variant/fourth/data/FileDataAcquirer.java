package com.epam.task.variant.fourth.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDataAcquirer implements DataAcquirer {
    @Override
    public List<Integer> getNumbers() {
        System.out.println("Numbers from file");
        List<Integer> list = new ArrayList<Integer>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("E:\\EvenNumbers\\src\\main\\resources\\FileDataAcquirer.txt"));
            String[] str = (reader.readLine()).split(" ");
            for (String number : str) {
                list.add(Integer.valueOf(number));
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return list;
    }
}
