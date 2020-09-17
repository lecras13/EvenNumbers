package com.epam.task.variant.fourth.logic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class EvenControlTest {
    @Test
    public void EvenControlTestWhenOneOfNumbersIsEven(){
        List<Integer> testList = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7));
        EvenControl evenControl = new EvenControl();
        Assert.assertEquals(false, evenControl.moreThanTwoEven(testList));
    }

    @Test
    public void EvenControlTestWhenTwoOfNumbersIsEven(){
        List<Integer> testList = new ArrayList<Integer>(Arrays.asList(2, 4, 5, 7));
        EvenControl evenControl = new EvenControl();
        Assert.assertEquals(true, evenControl.moreThanTwoEven(testList));
    }

    @Test
    public void EvenControlTestWhenThreeOfNumbersIsEven(){
        List<Integer> testList = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 7));
        EvenControl evenControl = new EvenControl();
        Assert.assertEquals(true, evenControl.moreThanTwoEven(testList));
    }

    @Test
    public void EvenControlTestWhenFourOfNumbersIsEven(){
        List<Integer> testList = new ArrayList<Integer>(Arrays.asList(2, 4, 6, 8));
        EvenControl evenControl = new EvenControl();
        Assert.assertEquals(true, evenControl.moreThanTwoEven(testList));
    }
}
