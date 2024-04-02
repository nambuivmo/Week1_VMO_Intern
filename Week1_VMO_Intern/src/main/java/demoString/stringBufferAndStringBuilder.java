/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoString;

/**
 *
 * @author buina
 */
public class stringBufferAndStringBuilder {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" World");
        System.out.println(buffer); // In ra "Hello World"

        StringBuilder builder = new StringBuilder("Java");
        builder.append(" is awesome");
        System.out.println(builder); // In ra "Java is awesome"
    }
}
