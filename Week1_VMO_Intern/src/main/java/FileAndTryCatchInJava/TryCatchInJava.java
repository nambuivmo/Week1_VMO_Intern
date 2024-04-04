/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileAndTryCatchInJava;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author buina
 */
public class TryCatchInJava {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you ?");
        try {
            int age = sc.nextInt();
            System.out.println("Your age is: " + age);
            int error = age / 0;
        } catch(InputMismatchException i){
            System.out.println("please enter true format number");
        } catch (ArithmeticException ae) {
            System.out.println("can not divide 0");
        } catch (Exception e){
            System.out.println("All exception");
        }finally{
            System.out.println("You are in finally block");
        }

    }

}
