package services;

import model.Classes;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassManage {
    //tạo nơi lưu trữ lớp: arrayList
    //crud: creat-read-update-delete
    private ArrayList<Classes> classes;
    Scanner sc;

    public ClassManage(){
        classes = new ArrayList<Classes>();
        sc = new Scanner(System.in);
    }

    public void showClass(){
        //for(KDL bien : mảng){}
        for(Classes classes:classes){
            System.out.println(classes);
        }
    }
    public void addClass(){
        //b1: hứng dữ liệu từ người dùng
        System.out.print("Input class name: ");
        String nameClass = sc.nextLine();
        //b2: tạo mới 1 đối tượng class với constructor Classes(String name)
        //b3: gắn giá trị nameClass vào name trong constructor
        classes.add(new Classes(nameClass));
        System.out.println("Add class success!");
    }
    public Classes findClassByID(int id){
        for (int i = 0; i < classes.size() ; i++) {
            if(id == classes.get(i).getId()){
                return classes.get(i);
            }
        }
        return null;
    }
    public void editClass(){
        System.out.print("Input class ID: ");
        int idClass = Integer.parseInt(sc.nextLine());
        Classes findClass = this.findClassByID(idClass);
        if(findClass!=null){
            System.out.print("Input new class name: ");
            String newName = sc.nextLine();
            findClass.setName(newName);
            System.out.println("Edit class name success!");
        }else System.out.println("ID not found");
    }

    public void deleteClass(){
        System.out.print("Input class ID: ");
        int idClass = Integer.parseInt(sc.nextLine());
        Classes findClass = this.findClassByID(idClass);
        if(findClass!=null){
            classes.remove(findClass);
            System.out.println("Delete class success!");
        }else System.out.println("ID not found");
    }

//    public static void main(String[] args) {
//        // write your code here
//        ClassManage classManage = new ClassManage();
//        classManage.addClass();
//        classManage.addClass();
//        classManage.showClass();
//        classManage.editClass();
//        classManage.showClass();
//        classManage.deleteClass();
//    }
}
