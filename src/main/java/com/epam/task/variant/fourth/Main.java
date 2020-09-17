package com.epam.task.variant.fourth;

import com.epam.task.variant.fourth.data.ConsoleDataAcquirer;
import com.epam.task.variant.fourth.data.DataAcquirer;
import com.epam.task.variant.fourth.logic.EvenControl;
import com.epam.task.variant.fourth.view.ConsoleResultPrinter;
import com.epam.task.variant.fourth.view.ResultPrinter;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DataAcquirer acquirer = new ConsoleDataAcquirer();
        List<Integer> numbers = acquirer.getNumbers();

        EvenControl control = new EvenControl();
        boolean result = control.moreThanTwoEven(numbers);

        ResultPrinter printer = new ConsoleResultPrinter();
        printer.print(result);
    }
}
