/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoString;

/**
 *
 * @author buina
 */
public class stringAndStringPool {
     public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        
        System.out.println(str1 == str2); // Kết quả: true
        System.out.println(str2 == str3); // Kết quả: false
    }
}
