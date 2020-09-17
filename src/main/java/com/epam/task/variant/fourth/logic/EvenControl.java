package com.epam.task.variant.fourth.logic;

import java.util.List;

public class EvenControl {
    public boolean moreThanTwoEven(List<Integer> numbers) {
        int count = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                count++;
                if(count == 2){
                    return true;
                }
            }
        }
        return false;
    }
}
