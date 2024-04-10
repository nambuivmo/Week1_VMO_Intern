/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionsInJava.List;

import java.util.LinkedList;

/**
 *
 * @author buina
 */
public class MyLinkedList {
    public static void main(String[] args) {
        // Khởi tạo một LinkedList kiểu String
        LinkedList<String> linkedList = new LinkedList<>();
        
        // Thêm các phần tử vào LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");
        
        // In ra LinkedList ban đầu
        System.out.println("LinkedList ban đầu: " + linkedList);
        
        // Truy cập phần tử trong LinkedList bằng chỉ mục
        String fruit = linkedList.get(1);
        System.out.println("Phần tử thứ hai trong LinkedList: " + fruit);
        // Thêm một phần tử vào đầu danh sách
        linkedList.addFirst("Grapes");
        System.out.println("LinkedList sau khi thêm 'Grapes' vào đầu: " + linkedList);

        // Thêm một phần tử vào cuối danh sách
        linkedList.addLast("Watermelon");
        System.out.println("LinkedList sau khi thêm 'Watermelon' vào cuối: " + linkedList);
        
        // Xóa một phần tử khỏi LinkedList
        linkedList.remove("Orange");
        System.out.println("LinkedList sau khi xóa phần tử 'Orange': " + linkedList);
        
        // Lấy kích thước của LinkedList
        int size = linkedList.size();
        System.out.println("Kích thước của LinkedList: " + size);
        
        // Lặp qua các phần tử của LinkedList
        System.out.println("Các phần tử của LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }
    }
}
