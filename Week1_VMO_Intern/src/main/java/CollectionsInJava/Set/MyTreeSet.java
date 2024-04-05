/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionsInJava.Set;

import java.util.TreeSet;

/**
 *
 * @author buina
 */
public class MyTreeSet {
    public static void main(String[] args) {
        // Khởi tạo một TreeSet kiểu Integer
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        // Thêm các phần tử vào TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(7);
        
        // In ra TreeSet
        System.out.println("TreeSet: " + treeSet);
        
        // Kiểm tra xem phần tử 5 có tồn tại trong TreeSet không
        boolean containsFive = treeSet.contains(5);
        System.out.println("TreeSet contains 5: " + containsFive);
        
        // Xóa một phần tử khỏi TreeSet
        treeSet.remove(2);
        System.out.println("TreeSet after removing 2: " + treeSet);
        
        // Lấy phần tử nhỏ nhất từ TreeSet
        int minElement = treeSet.first();
        System.out.println("Min element in TreeSet: " + minElement);
        
        // Lấy phần tử lớn nhất từ TreeSet
        int maxElement = treeSet.last();
        System.out.println("Max element in TreeSet: " + maxElement);
        
        // Lấy kích thước của TreeSet
        int size = treeSet.size();
        System.out.println("Size of TreeSet: " + size);
    }
}
