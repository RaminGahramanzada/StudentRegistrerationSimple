/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Lenovo
 */
public class MenuUtil {
    public static void processMenu(int selectedMenu){
        switch (selectedMenu) {
                case 1:
                    StudentUtil.registerStudents();
                    break;
                case 2:
                    StudentUtil.printallRegisteredStudents();
                    break;
                case 3:
                    StudentUtil.findStudentsAndPrint();
                    break;
                case 4:
                    StudentUtil.uptadeStudents();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    break;
            }
    }
    public static String requireName(){
        return InputUtil.requireText("Enter name");
    }
    public static String requireSurname(){
        return InputUtil.requireText("Enter surname");
    }
    public static String requireClassname(){
        return InputUtil.requireText("Enter class name");
    }
    public static int requireAge(){
        return InputUtil.requireNumber("Enter age");
    }
    public static void showSuccessOpMessage(){
        System.out.println("Operation completed succesfully!");
    }
}
