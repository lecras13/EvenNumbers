package com.epam.task.variant.fourth.data;

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
