/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package main;

import util.InputUtil;
import util.menuutil;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        int menu = 0;
        while (true) {
            menu = InputUtil.requirenumber( "What do you want to do?"
                    + "\n1.Register Student"
                    + "\n2.Show all Student"
                    + "\n3.Find Student"
                    + "\n4.Update Student");
            menuutil.menuproces(menu);


        }
    }
}
