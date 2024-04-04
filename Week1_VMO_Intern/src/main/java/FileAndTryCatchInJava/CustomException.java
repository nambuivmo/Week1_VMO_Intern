/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileAndTryCatchInJava;

/**
 *
 * @author buina
 */
class MyCustomException extends Exception {

    public MyCustomException(String message) {
        super(message);
    }
}

public class CustomException {

    public static void main(String[] args) {
        try {
            processInput(10);
            processInput(-5); // This will throw MyCustomException
        } catch (MyCustomException e) {
            System.out.println("Custom exception occurred: " + e.getMessage());
        }
    }

    public static void processInput(int value) throws MyCustomException {
        if (value < 0) {
            throw new MyCustomException("Input value cannot be negative");
        } else {
            System.out.println("Input value: " + value);
        }
    }
}
