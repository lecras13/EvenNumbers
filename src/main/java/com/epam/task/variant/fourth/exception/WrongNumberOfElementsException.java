package com.epam.task.variant.fourth.exception;

public class WrongNumberOfElementsException extends Exception {
    @Override
    public void printStackTrace() {
        System.err.print("Number of elements less than 4");
    }
}
