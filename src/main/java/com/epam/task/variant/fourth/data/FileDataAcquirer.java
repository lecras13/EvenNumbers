package com.epam.task.variant.fourth.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
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
            for (String number: str){
                list.add(Integer.parseInt(number));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
        return list;
    }
}
