/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionsInJava.Map;

import java.util.HashMap;

/**
 *
 * @author buina
 */
public class MyHashMap {
    public static void main(String[] args) {
        // Khởi tạo một HashMap kiểu Integer và String
        HashMap<Integer, String> hashMap = new HashMap<>();
        
        // Thêm các cặp key-value vào HashMap
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        
        // In ra HashMap
        System.out.println("HashMap: " + hashMap);
        
        // Lấy giá trị tương ứng với key là 2
        String value = hashMap.get(2);
        System.out.println("Value corresponding to key 2: " + value);
        
        // Xóa một cặp key-value khỏi HashMap
        hashMap.remove(3);
        System.out.println("HashMap after removing key 3: " + hashMap);
        
        // Kiểm tra xem key 1 có tồn tại trong HashMap không
        boolean containsKey = hashMap.containsKey(1);
        System.out.println("HashMap contains key 1: " + containsKey);
        
        // Lấy kích thước của HashMap
        int size = hashMap.size();
        System.out.println("Size of HashMap: " + size);
    }
}
