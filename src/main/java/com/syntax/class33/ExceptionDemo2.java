package com.syntax.class33;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        System.out.println("0");
        try {
            //System.out.println(10 / 0);
            String str ="aaa";
            str.charAt(10);
            String name = null;
            name.length();
            int[] arr = new int[-5];
            String[] strArr = new String[2];
            strArr[5] = "Issues";
            throw  new RuntimeException();

        } catch (ArithmeticException are) {
            System.out.println("1");
        } catch (NullPointerException npe) {
            System.out.println("2");
        } catch (NegativeArraySizeException nese) {
            System.out.println("3");
        } catch (IndexOutOfBoundsException iobe) {
            System.out.println("4");
        } catch (Exception e) {
            System.out.println("Something went wrong"); // catch all types of exceptions
        }
        System.out.println("6");
    }
}
