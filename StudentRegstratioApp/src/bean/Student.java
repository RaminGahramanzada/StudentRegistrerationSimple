/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Lenovo
 */
public class Student {
    private String name;
    private String surname;
    private int age;
    private String className;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Student(String name, String surname, int age, String className) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.className = className;
    }

    public Student() {
    }
    
    public String getFullInfo(){
        return this.getName() + " " + this.getSurname() + " " + this.getAge() +" "+ this.getClassName();
    }
}
