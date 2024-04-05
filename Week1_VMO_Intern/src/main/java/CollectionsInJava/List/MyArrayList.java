/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CollectionsInJava.List;
import java.util.ArrayList;
/**
 *
 * @author buina
 */
public class MyArrayList {
    public static void main(String[] args) {
        // Khởi tạo một ArrayList kiểu String
        ArrayList<String> arrayList = new ArrayList<>();
        // Thêm các phần tử vào ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Mango");
        
        // In ra ArrayList ban đầu
        System.out.println("ArrayList ban đầu: " + arrayList);
        
        // Truy cập phần tử trong ArrayList bằng chỉ địa chỉ
        String fruit = arrayList.get(1);
        System.out.println("Phần tử thứ hai trong ArrayList: " + fruit);
        
        // Thêm một phần tử vào arraylist
        arrayList.add(2, "Watermelon");
         System.out.println("ArrayList sau khi thêm phần tử 'watermelone': " + arrayList);
         
        // Xóa một phần tử khỏi ArrayList
        arrayList.remove("Orange");
        System.out.println("ArrayList sau khi xóa phần tử 'Orange': " + arrayList);
        
        // Kiểm tra xem một phần tử có tồn tại trong ArrayList hay không
        boolean containsBanana = arrayList.contains("Banana");
        System.out.println("ArrayList có chứa phần tử 'Banana' không: " + containsBanana);
        
        // Lấy kích thước của ArrayList
        int size = arrayList.size();
        System.out.println("Kích thước của ArrayList: " + size);
        
        // Lặp qua các phần tử của ArrayList
        System.out.println("Các phần tử của ArrayList:");
        for (String element : arrayList) {
            System.out.print(element + " ");
        }
    }
}
