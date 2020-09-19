package com.epam.task.variant.fourth;

import com.epam.task.variant.fourth.data.DataAcquirer;
import com.epam.task.variant.fourth.data.DataFactory;
import com.epam.task.variant.fourth.data.enums.DataType;
import com.epam.task.variant.fourth.exception.WrongNumberOfElementsException;
import com.epam.task.variant.fourth.logic.EvenControl;
import com.epam.task.variant.fourth.view.PrintFactory;
import com.epam.task.variant.fourth.view.ResultPrinter;
import com.epam.task.variant.fourth.view.enums.PrintType;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataFactory factory = new DataFactory();
        try {
            runFromConsole(factory);
            runFromFile(factory);
        } catch (WrongNumberOfElementsException e) {
            e.printStackTrace();
        }
    }

    private static void runFromConsole(DataFactory dataFactory) throws WrongNumberOfElementsException {
        DataAcquirer console = dataFactory.getDateAcquirer(DataType.CONSOLE);
        boolean result = findTheResult(console);
        print(PrintType.CONSOLEPRINTER, result);
    }

    private static void runFromFile(DataFactory dataFactory) throws WrongNumberOfElementsException {
        DataAcquirer file = dataFactory.getDateAcquirer(DataType.FILE);
        boolean result = findTheResult(file);
        print(PrintType.FILEPRINTER, result);
    }

    private static boolean findTheResult(DataAcquirer dataAcquirer) throws WrongNumberOfElementsException {
        List<Integer> numbersFromFile = dataAcquirer.getNumbers();
        EvenControl control = new EvenControl();
        boolean resultFromFile = Boolean.parseBoolean(null);
        resultFromFile = control.moreThanTwoEven(numbersFromFile);
        return resultFromFile;
    }

    private static void print(PrintType type, boolean result) {
        PrintFactory printFactory = new PrintFactory();
        ResultPrinter resultPrinter = printFactory.getResultPrinter(type);
        resultPrinter.print(result);
    }
}
