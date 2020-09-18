package com.epam.task.variant.fourth.logic;

import com.epam.task.variant.fourth.exception.WrongNumberOfElementsException;
import java.util.List;

public class EvenControl {
    public boolean moreThanTwoEven(List<Integer> numbers) throws WrongNumberOfElementsException {
        if (numbers.size() < 4) {
            throw new WrongNumberOfElementsException();
        }else {
            int count = 0;
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    count++;
                    if (count == 2) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
