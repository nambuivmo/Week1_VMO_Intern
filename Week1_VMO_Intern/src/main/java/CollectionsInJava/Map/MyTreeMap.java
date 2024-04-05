/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionsInJava.Map;

import java.util.TreeMap;

/**
 *
 * @author buina
 */
public class MyTreeMap {
    public static void main(String[] args) {
        // Khởi tạo một TreeMap kiểu String và Integer
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        
        // Thêm các cặp key-value vào TreeMap
        treeMap.put("Three", 3);
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        
        // In ra TreeMap
        System.out.println("TreeMap: " + treeMap);
        
        // Lấy giá trị tương ứng với key là "Two"
        int value = treeMap.get("Two");
        System.out.println("Value corresponding to key 'Two': " + value);
        
        // Xóa một cặp key-value khỏi TreeMap
        treeMap.remove("One");
        System.out.println("TreeMap after removing key 'One': " + treeMap);
        
        // Kiểm tra xem key "Three" có tồn tại trong TreeMap không
        boolean containsKey = treeMap.containsKey("Three");
        System.out.println("TreeMap contains key 'Three': " + containsKey);
        
        // Lặp qua các cặp key-value của TreeMap
        System.out.println("Iterating through TreeMap:");
        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}
