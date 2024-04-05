/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionsInJava.Map;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author buina
 */
public class MyLinkedHashMap {
    public static void main(String[] args) {
        // Khởi tạo một LinkedHashMap kiểu Integer và String
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        
        // Thêm các cặp key-value vào LinkedHashMap
        linkedHashMap.put(1, "One");
        linkedHashMap.put(2, "Two");
        linkedHashMap.put(3, "Three");
        
        // In ra LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedHashMap);
        
        // Lấy giá trị tương ứng với key là 2
        String value = linkedHashMap.get(2);
        System.out.println("Value corresponding to key 2: " + value);
        
        // Xóa một cặp key-value khỏi LinkedHashMap
        linkedHashMap.remove(3);
        System.out.println("LinkedHashMap after removing key 3: " + linkedHashMap);
        
        // Kiểm tra xem key 1 có tồn tại trong LinkedHashMap không
        boolean containsKey = linkedHashMap.containsKey(1);
        System.out.println("LinkedHashMap contains key 1: " + containsKey);
        
        // Lặp qua các cặp key-value của LinkedHashMap
        System.out.println("Iterating through LinkedHashMap:");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
