/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionsInJava.Set;

import java.util.LinkedHashSet;

/**
 *
 * @author buina
 */
public class MyLinkedHashSet {
    public static void main(String[] args) {
        // Khởi tạo một LinkedHashSet kiểu String
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        
        // Thêm các phần tử vào LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Mango");
        
        // In ra LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);
        
        // Kiểm tra xem phần tử "Banana" có tồn tại trong LinkedHashSet không
        boolean containsBanana = linkedHashSet.contains("Banana");
        System.out.println("LinkedHashSet contains 'Banana': " + containsBanana);
        
        // Xóa một phần tử khỏi LinkedHashSet
        linkedHashSet.remove("Orange");
        System.out.println("LinkedHashSet after removing 'Orange': " + linkedHashSet);
        
        // Lấy kích thước của LinkedHashSet
        int size = linkedHashSet.size();
        System.out.println("Size of LinkedHashSet: " + size);
        
        // Duyệt qua các phần tử của LinkedHashSet
        System.out.println("Elements of LinkedHashSet:");
        for (String element : linkedHashSet) {
            System.out.println(element);
        }
    }
}
