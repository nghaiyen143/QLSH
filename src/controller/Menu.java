package controller;

import services.ClassManage;
import services.StudentManage;

import java.util.Scanner;

public class Menu {
    ClassManage classManage = new ClassManage();
    StudentManage studentManage = new StudentManage();
    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        System.out.println("----- Main Menu -----");
        int choice;
        do{
            System.out.println("1. Class Manage");
            System.out.println("2. Student Manage");
            System.out.println("Input your choice:");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    classMenu();
                    break;
                case 2:
                    studentMenu();
                    break;
                case 0:
                    System.out.println("End program!");
                    break;
                default:
                    System.out.println("Please try again!");
            }
        }while (choice != 0);
    }

    public void classMenu(){
        int choice;
        do{
            System.out.println("----- Class Manage -----");
            System.out.println("1. Add new class");
            System.out.println("2. Edit class");
            System.out.println("3. Delete class");
            System.out.println("4. View all classes");
            System.out.println("Input your choice:");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    classManage.addClass();
                    break;
                case 2:
                    classManage.editClass();
                    break;
                case 3:
                    classManage.deleteClass();
                    break;
                case 4:
                    classManage.showClass();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please try again!");
            }
        }while (choice != 0);
    }

    public void studentMenu(){
        int choice;
        do{
            System.out.println("----- Student Manage -----");
            System.out.println("1. Add new student");
            System.out.println("2. Edit student");
            System.out.println("3. Delete student");
            System.out.println("4. View all students");
            System.out.println("Input your choice:");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    studentManage.addStudent();
                    break;
                case 2:
                    studentManage.editStudent();
                    break;
                case 3:
                    studentManage.deleteStudent();
                    break;
                case 4:
                    studentManage.showStudent();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Please try again!");
            }
        }while (choice != 0);
    }
}
