/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionsInJava.Queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author buina
 */
public class MyQueue {
    public static void main(String[] args) {
        // Khởi tạo một Queue kiểu Integer bằng LinkedList
        Queue<Integer> queue = new LinkedList<>();
        
        // Thêm các phần tử vào Queue
        queue.offer(5);
        queue.offer(10);
        queue.offer(15);
        
        // In ra Queue
        System.out.println("Queue: " + queue);
        
        // Loại bỏ và in ra phần tử đầu tiên của Queue
        int removedElement = queue.poll();
        System.out.println("Removed element from Queue: " + removedElement);
        
        // In ra phần tử đầu tiên của Queue sau khi loại bỏ
        System.out.println("Queue after removal: " + queue);
        
        // Lấy phần tử đầu tiên của Queue mà không loại bỏ nó
        int peekedElement = queue.peek();
        System.out.println("Peeked element from Queue: " + peekedElement);
        
        // In ra phần tử đầu tiên của Queue
        System.out.println("Queue after peek: " + queue);
    }
}