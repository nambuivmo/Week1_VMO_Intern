/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphismInJava;

/**
 *
 * @author buina
 */
public class main {
    public static void main(String[] args) {
        caculator calc = new caculator();
        int sum1 = calc.add(3, 4); // Gọi phương thức add(int, int)
        double sum2 = calc.add(3.5, 4.5); // Gọi phương thức add(double, double)
        System.out.println("sum1" + sum1);
        System.out.println("sum2" + sum2);
    }
    
    
}
