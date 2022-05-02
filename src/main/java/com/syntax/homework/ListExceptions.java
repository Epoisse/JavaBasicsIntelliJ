package com.syntax.homework;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListExceptions {
    static List<Exception> exceptionList() {
        try {

        } catch (IndexOutOfBoundsException iobe) {
            iobe.getClass();
            iobe.getMessage();
        }

        try {

        } catch (NullPointerException npe) {
            npe.getClass();
            npe.getMessage();
        }

        try {

        } catch (ArithmeticException ae) {
            ae.getClass();
            ae.getMessage();
        }

        try {

        } catch (NumberFormatException nfe) {
            nfe.getClass();
            nfe.getMessage();
        }
return new ArrayList<>();
    }
}
