/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FileAndTryCatchInJava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author buina
 */
public class Main {

    public static final String COMMA = ",";

    public static List<Student> inputDataStudent() {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();

        //Nhap input
        System.out.print("Input ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("");
        System.out.print("Enter name student: ");
        String nameStu = sc.nextLine();
        System.out.println("");
        System.out.print("Input date (yyyy-MM-dd): ");
        String dateInput = sc.nextLine();
        //Xu ly date
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dateStu = null;
        try {
            dateStu = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            System.out.println("Định dạng ngày không hợp lệ.");
        }
        Student student = new Student(id, nameStu, dateStu);
        studentList.add(student);

        return studentList;
    }

    public static void inputDataInfile() {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        System.out.print("Enter name file: ");
        String nameFile = sc.nextLine();
        studentList = inputDataStudent();
        String line = null;
        for (Student students : studentList) {
            line = students.getId() + COMMA + students.getName() + COMMA + students.getDob();
            FileUtils.writeFile(nameFile, line);
        }
    }

    public static void displayFile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name file: ");
        String nameFile = sc.nextLine();
        List<String> listLine = FileUtils.readFile(nameFile);
        System.out.println(listLine);
    }

    public static void createFile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name file: ");
        String nameFile = sc.nextLine();
        FileUtils.createFile(nameFile);
    }
    
    public static void deleteFile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name file: ");
        String nameFile = sc.nextLine();
        FileUtils.deleteFile(nameFile);
    }

    public static void menu() {
        System.out.println("--Menu--");
        System.out.println("1. Enter student and write in file");
        System.out.println("2. Display student from text file");
        System.out.println("3. Create file");
        System.out.println("0.Exit program");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String nameFile;
        do {
            menu();
            System.out.print("Enter number: ");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    // input data file
                    inputDataInfile();
                    break;
                case 2:
                    // out put data file
                    displayFile();
                    break;
                case 3:
                    // create new file
                    createFile();
                    break;
                case 4:
                    // delete file
                    deleteFile();
                    break;    
                  
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (num != 0);
    }
}
