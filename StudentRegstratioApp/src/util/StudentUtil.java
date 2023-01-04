/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import bean.Student;
import main.Config;

/**
 *
 * @author Lenovo
 */
public class StudentUtil {

    public static Student fillStudent() {
        String name = MenuUtil.requireName();
        String surname = MenuUtil.requireSurname();
        String className = MenuUtil.requireClassname();
        int age = MenuUtil.requireAge();

        Student st = new Student(name, surname, age, className);
        return st;
    }

    public static void printallRegisteredStudents() {
        if (Config.students == null) {
            return;
        }
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            System.out.println((i+1)+"."+st.getFullInfo());

        }

    }
    public static void uptadeStudents(){
         StudentUtil.printallRegisteredStudents();
            
           int i= InputUtil.requireNumber("Which person you want to change?");
           
           System.out.println("Add new information");
            Student s = StudentUtil.fillStudent();
            
            Config.students[i-1] = s;
    }

    public static void registerStudents() {
        int count = InputUtil.requireNumber("How many students will be register?");
        Config.students = new Student[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ".Register");
            Config.students[i] = StudentUtil.fillStudent();
        }
        MenuUtil.showSuccessOpMessage(); 
        StudentUtil.printallRegisteredStudents();
    }

    public static void findStudentsAndPrint() {
        String text = InputUtil.requireText("Type name,surname or class name");
        Student[] result = findStudents(text);
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                System.out.println(st.getFullInfo());
            }
        }

    }

    public static Student[] findStudents(String text) {
        int count = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                count++;
            }
        }
        Student[] result = new Student[count];
        int found = 0;
        for (int i = 0; i < Config.students.length; i++) {
            Student st = Config.students[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassName().contains(text)) {
                result[found++] = st;
            }
        }
        return result;
    }

}
