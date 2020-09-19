package com.epam.task.variant.fourth.data;

import com.epam.task.variant.fourth.data.enums.DataType;

public class DataFactory {
    private static final String FILEPATH = "E:\\EvenNumbers\\src\\main\\resources\\FileDataAcquirer.txt";

    public DataAcquirer getDateAcquirer(DataType type) {
        DataAcquirer toReturn = null;
        switch (type) {
            case CONSOLE:
                toReturn = new ConsoleDataAcquirer();
                break;
            case FILE:
                toReturn = new FileDataAcquirer(FILEPATH);
                break;
            default:
                throw new IllegalArgumentException("Wrong type" + type);
        }
        return toReturn;
    }
}
