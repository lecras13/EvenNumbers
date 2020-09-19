package com.epam.task.variant.fourth.logic;

import com.epam.task.variant.fourth.exception.WrongNumberOfElementsException;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class EvenControlTest {
    @Test
    public void EvenControlTestWhenOneOfNumbersIsEven() throws WrongNumberOfElementsException {
        List<Integer> testList = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7));
        EvenControl evenControl = new EvenControl();
        boolean result = evenControl.moreThanTwoEven(testList);
        Assert.assertEquals(false, result);
    }

    @Test
    public void EvenControlTestWhenTwoOrMoreOfNumbersIsEven() throws WrongNumberOfElementsException {
        List<Integer> testList = new ArrayList<Integer>(Arrays.asList(2, 4, 5, 7));
        EvenControl evenControl = new EvenControl();
        boolean result = evenControl.moreThanTwoEven(testList);
        Assert.assertEquals(false, result);
    }

    @Test(expected = WrongNumberOfElementsException.class)
    public void EvenControlTestWhenNumbersLessForFourth() throws WrongNumberOfElementsException {
        List<Integer> testList = new ArrayList<Integer>(Arrays.asList(2, 6, 7));
        EvenControl evenControl = new EvenControl();
        boolean result = evenControl.moreThanTwoEven(testList);
    }
}
