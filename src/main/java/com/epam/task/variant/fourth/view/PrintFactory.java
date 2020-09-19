package com.epam.task.variant.fourth.view;

import com.epam.task.variant.fourth.view.enums.PrintType;

public class PrintFactory {
    private static final String FILEPATH = "E:\\EvenNumbers\\src\\main\\resources\\FileResultPrinter.txt";

    public ResultPrinter getResultPrinter(PrintType type) {
        ResultPrinter toReturn = null;
        switch (type) {
            case CONSOLEPRINTER:
                toReturn = new ConsoleResultPrinter();
                break;
            case FILEPRINTER:
                toReturn = new FileResultPrint(FILEPATH);
                break;
            default:
                throw new IllegalArgumentException("Wrong type" + type);
        }
        return toReturn;
    }
}


