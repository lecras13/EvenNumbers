package com.epam.task.variant.fourth.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDataAcquirer implements DataAcquirer {
    private String fileName;

    public FileDataAcquirer(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<Integer> getNumbers() {
        List<Integer> list = new ArrayList<Integer>();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String[] str = (reader.readLine()).split(" ");
            for (String number : str) {
                list.add(Integer.valueOf(number));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
