package com.epam.task.variant.fourth.data;

import static com.epam.task.variant.fourth.data.DataType.CONSOLE;

public class DataFactory {
    public DataAcquirer getDateAcquirer(DataType type){
        DataAcquirer toReturn = null;
        switch(type){
            case CONSOLE:
                toReturn = new ConsoleDataAcquirer();
                break;
            case FILE:
                toReturn = new FileDataAcquirer();
                break;
            default:
                throw new IllegalArgumentException("Wrong type" + type);
        }
        return toReturn;
    }
}
