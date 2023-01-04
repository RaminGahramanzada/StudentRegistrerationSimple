/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import util.InputUtil;
import util.MenuUtil;

/**
 *
 * @author Lenovo
 */
public class Main {

    public static void main(String[] args) {
        int menu = 0;
        while (true) {
            menu = InputUtil.requireNumber("""
                                           What do you want to do?
                                           1. Register Student
                                           2. Show all Students
                                           3. Find Students
                                           4. Uptade Students
                                           5. Exit""");
            MenuUtil.processMenu(menu);
        }

    }
}
