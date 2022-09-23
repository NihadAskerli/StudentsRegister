/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author ASUS
 */
public class menuutil {

    public static void menuproces(int selectedmenu) {
        if (selectedmenu == 1) {
            StudentUtil.registerStudent();
        } else if (selectedmenu == 2) {
            StudentUtil.printAllRegistredStudents();
        } else if (selectedmenu == 3) {
            StudentUtil.findstudentandprint();
        } else if (selectedmenu == 4) {
            StudentUtil.updatestudentwitrhsplit();
        }
    }

    public static String requirename() {
        return InputUtil.requiretext("enter name");
    }

    public static String requiresurname() {
        return InputUtil.requiretext("enter surname");
    }

    public static String requireclassname() {
        return InputUtil.requiretext("enter class name");
    }

    public static int requireage() {
        return InputUtil.requirenumber("enter age");
    }

}
