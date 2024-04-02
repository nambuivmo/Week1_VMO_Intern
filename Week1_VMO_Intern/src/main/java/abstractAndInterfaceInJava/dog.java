package abstractAndInterfaceInJava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author buina
 */
public class dog extends animal implements vehicle {

    @Override
    public void makeSound() {
        System.out.println("Gau Gau Gau");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerating...");
    }
    
}
