package services;

import model.Classes;
import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManage {
    private ArrayList<Student> students;
    Scanner sc;

    public StudentManage(){
        students = new ArrayList<Student>();
        sc = new Scanner(System.in);
    }

    public void showStudent(){
        for(Student student:students){
            System.out.println(student);
        }
    }

    public void addStudent(){
        System.out.print("Input name: ");
        String name = sc.nextLine();
        System.out.print("Input age: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("Input gender: ");
        String gender = sc.nextLine();
        System.out.print("Input address: ");
        String address = sc.nextLine();
        System.out.print("Input avg point: ");
        double avgPoint = Double.parseDouble(sc.nextLine());

        students.add(new Student(name,age,gender,address,avgPoint));
        System.out.println("Add student success!");
    }

    public Student findStudentByID(int id){
        for (int i = 0; i < students.size() ; i++) {
            if(id == students.get(i).getId()){
                return students.get(i);
            }
        }
        return null;
    }

    public void editStudent(){
        System.out.println("Input student id:");
        int id = Integer.parseInt(sc.nextLine());
        Student findStudent = this.findStudentByID(id);
        if(findStudent!=null){
            System.out.print("Input new name: ");
            String newName = sc.nextLine();
            System.out.print("Input new age: ");
            int newAge = Integer.parseInt(sc.nextLine());
            System.out.print("Input new gender: ");
            String newGender = sc.nextLine();
            System.out.print("Input new address: ");
            String newAddress = sc.nextLine();
            System.out.print("Input new avg point: ");
            double newAvgPoint = Double.parseDouble(sc.nextLine());

            findStudent.setName(newName);
            findStudent.setAge(newAge);
            findStudent.setGender(newGender);
            findStudent.setAddress(newAddress);
            findStudent.setAvgPoint(newAvgPoint);

            System.out.println("Edit student name success!");
        }else System.out.println("ID not found");
    }

    public void deleteStudent(){
        System.out.println("Input student id:");
        int id = Integer.parseInt(sc.nextLine());
        Student findStudent = this.findStudentByID(id);
        if(findStudent!=null){
            students.remove(findStudent);
            System.out.println("Delete student success!");
        }else System.out.println("ID not found");
    }

//    public static void main(String[] args) {
//        // write your code here
//        StudentManage studentManage = new StudentManage();
//        studentManage.addStudent();
//        studentManage.addStudent();
//        studentManage.showStudent();
//        studentManage.editStudent();
//        studentManage.showStudent();
//        studentManage.deleteStudent();
//        studentManage.showStudent();
//    }


}
