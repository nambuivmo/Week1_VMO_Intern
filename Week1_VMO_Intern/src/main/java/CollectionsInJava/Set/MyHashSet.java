/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionsInJava.Set;

import java.util.HashSet;

/**
 *
 * @author buina
 */
public class MyHashSet {
     public static void main(String[] args) {
        // Khởi tạo một HashSet kiểu String
        HashSet<String> hashSet = new HashSet<>();
        
        // Thêm các phần tử vào HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Mango");
        
        // In ra HashSet
        System.out.println("HashSet: " + hashSet);
        
        // Kiểm tra xem phần tử "Banana" có tồn tại trong HashSet không
        boolean containsBanana = hashSet.contains("Banana");
        System.out.println("HashSet contains 'Banana': " + containsBanana);
        
        // Xóa một phần tử khỏi HashSet
        hashSet.remove("Orange");
        System.out.println("HashSet after removing 'Orange': " + hashSet);
        
        // Lấy kích thước của HashSet
        int size = hashSet.size();
        System.out.println("Size of HashSet: " + size);
        
        // Duyệt qua các phần tử của HashSet
        System.out.println("Elements of HashSet:");
        for (String element : hashSet) {
            System.out.println(element);
        }
    }
}
