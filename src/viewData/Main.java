package viewData;

import controller.Manager;
import model.Student;
import storage.FileManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Student> studentList = new ArrayList<>();

        try {
            studentList = FileManager.readFile();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


        Manager hai = new Manager("Hai", studentList);

        while (true){
            System.out.println("moi lua chon :");
            System.out.println("1: them moi :");
            System.out.println("2: sua :");
            System.out.println("3: xoa :");
            System.out.println("4: hien thi");
            System.out.println("5: ket thuc.");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    Scanner scanner4 = new Scanner(System.in);
                    System.out.print("Moi ban nhap Id");
                    int id = scanner4.nextInt();
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("Moi ban nhap name");
                    String name = scanner1.nextLine();
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.print("Moi ban nhap Add");
                    String add = scanner2.nextLine();
                    Student s = new Student(id, name, add);
                    hai.addStudent(s);
                    break;
                case 2:
                    Scanner s1 = new Scanner(System.in);
                    System.out.println("nhap id can sua: ");
                    int index = s1.nextInt();
//                    hai.editStudent(index, )
                    break;
                case 3:
                    Scanner s2 = new Scanner(System.in);
                    System.out.println("nhap id can xoa: ");
                    int id1 = s2.nextInt();
                    hai.deleteStudent(id1);
                    break;
                case 4:
                    hai.showStudent();
                    break;
                case 5:
                    return;
            }
        }



    }
}
