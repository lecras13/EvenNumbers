package com.epam.task.variant.fourth;

import com.epam.task.variant.fourth.data.DataAcquirer;
import com.epam.task.variant.fourth.data.DataFactory;
import com.epam.task.variant.fourth.data.DataType;
import com.epam.task.variant.fourth.exception.WrongNumberOfElementsException;
import com.epam.task.variant.fourth.logic.EvenControl;
import com.epam.task.variant.fourth.view.ConsoleResultPrinter;
import com.epam.task.variant.fourth.view.ResultPrinter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataFactory factory = new DataFactory();

        DataAcquirer console = factory.getDateAcquirer(DataType.CONSOLE);

        List<Integer> numbersFromConsole = console.getNumbers();

        EvenControl control = new EvenControl();
        boolean resultFromConsole= Boolean.parseBoolean(null);

        try{
            resultFromConsole = control.moreThanTwoEven(numbersFromConsole);
        }catch (WrongNumberOfElementsException e){
            e.printStackTrace();
        }

        ResultPrinter printer = new ConsoleResultPrinter();
        printer.print(resultFromConsole);




        DataAcquirer file = factory.getDateAcquirer(DataType.FILE);
        List<Integer> numbersFromFile = file.getNumbers();
        boolean resultFromFile= Boolean.parseBoolean(null);
        try{
            resultFromFile = control.moreThanTwoEven(numbersFromFile);
        }catch (WrongNumberOfElementsException e){
            e.printStackTrace();
        }
        printer.print(resultFromFile);

    }
}
