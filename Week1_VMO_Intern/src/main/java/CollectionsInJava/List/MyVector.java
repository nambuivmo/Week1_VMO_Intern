/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionsInJava.List;

import java.util.Vector;

/**
 *
 * @author buina
 */
public class MyVector {
    public static void main(String[] args) {
        // Khởi tạo một Vector kiểu String
        Vector<String> vector = new Vector<>();
        
        // Thêm các phần tử vào Vector
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");
        vector.add("Mango");
        
        // In ra Vector ban đầu
        System.out.println("Vector ban đầu: " + vector);
        
        // Truy cập phần tử trong Vector bằng chỉ mục
        String fruit = vector.get(1);
        System.out.println("Phần tử thứ hai trong Vector: " + fruit);

        // Thêm một phần tử vào đầu danh sách
        vector.add(0, "Grapes");
        System.out.println("Vector sau khi thêm 'Grapes' vào đầu: " + vector);
        
        // Thêm một phần tử vào cuối danh sách
        vector.add("Watermelon");
        System.out.println("Vector sau khi thêm 'Watermelon' vào cuối: " + vector);
        
        // Xóa một phần tử khỏi Vector
        vector.remove("Orange");
        System.out.println("Vector sau khi xóa phần tử 'Orange': " + vector);
        
        // Lấy kích thước của Vector
        int size = vector.size();
        System.out.println("Kích thước của Vector: " + size);
        
        // Lặp qua các phần tử của Vector
        System.out.println("Các phần tử của Vector:");
        for (String element : vector) {
            System.out.println(element);
        }
    }
}
