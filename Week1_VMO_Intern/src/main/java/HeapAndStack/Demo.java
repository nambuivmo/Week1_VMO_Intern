/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HeapAndStack;

/**
 *
 * @author buina
 */
public class Demo {

    public static void main(String[] args) {
        int x = 10; // Biến tham trị
        System.out.println("Trước khi gọi phương thức: " + x);
        modifyPrimitive(x);
        System.out.println("Sau khi gọi phương thức: " + x);

        StringBuilder sb = new StringBuilder("Hello"); // Biến tham chiếu
        System.out.println("Trước khi gọi phương thức: " + sb);
        modifyReference(sb);
        System.out.println("Sau khi gọi phương thức: " + sb);
    }

    static void modifyPrimitive(int num) {
        num = num * 2;
        System.out.println("Trong phương thức (primitive): " + num);
    }

    static void modifyReference(StringBuilder strBuilder) {
        strBuilder.append(" World");
        System.out.println("Trong phương thức (reference): " + strBuilder);
    }
}
