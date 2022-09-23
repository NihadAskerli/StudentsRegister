/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import beans.Student;
import main.config;

/**
 *
 * @author ASUS
 */
public class StudentUtil {

    public static Student fillStudent() {

        String name = menuutil.requirename();
        String surname = menuutil.requiresurname();
        String classname = menuutil.requireclassname();
        int age = menuutil.requireage();

        Student st = new Student(name, surname, age, classname);
        return st;
    }

    public static void printAllRegistredStudents() {
        if (config.studentns == null) {
            return;
        }
        for (int i = 0; i < config.studentns.length; i++) {
            Student st = config.studentns[i];
            System.out.println((i + 1) + " " + st.getfullinfo());
        }

    }

    public static void registerStudent() {
        int count = InputUtil.requirenumber("how many will Students be ? ");
        config.studentns = new Student[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "Register");
            config.studentns[i] = StudentUtil.fillStudent();
        }

        System.out.println("registration completed succesfully");
        StudentUtil.printAllRegistredStudents();
    }

    public static void findstudentandprint() {
        String text = InputUtil.requiretext("type name,surname or class name");
        Student[] result = findstudent(text);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getfullinfo());
        }
    }

    public static Student[] findstudent(String text) {
        int count = 0;
        for (int i = 0; i < config.studentns.length; i++) {
            Student st = config.studentns[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassname().contains(text)) {
                count++;
            }
        }
        Student[] result = new Student[count];
        int found = 0;
        for (int i = 0; i < config.studentns.length; i++) {
            Student st = config.studentns[i];
            if (st.getName().contains(text) || st.getSurname().contains(text) || st.getClassname().contains(text)) {
                result[found] = st;
                found++;
            }
        }
        return result;
    }

    public static void updatestudentwitnewhobyekt() {
        StudentUtil.printAllRegistredStudents();
        int i = InputUtil.requirenumber("nececi adamda deyisiklik etmek isteyirsiz");
        System.out.println("melumatlari daxil edin:");
        Student s = StudentUtil.fillStudent();
        config.studentns[i - 1] = s;//burada varaq deyisdirili veriler silinib yerine tezesi yazilmir
    }

    public static void updatestudentsameobyekt() {
        StudentUtil.printAllRegistredStudents();
        int i = InputUtil.requirenumber("nececi adamda deyisiklik etmek isteyirsiz");
        System.out.println("melumatlari daxil edin:");

        Student selectedstudent = config.studentns[i - 1];
        String changeparams = InputUtil.requiretext("neleri deyisdirmek isteyirsiz:mes 'name','surname'");
        
        if (changeparams.contains("'name'")) {
            selectedstudent.setName(menuutil.requirename());
        }
        if (changeparams.contains("'surname")) {
            selectedstudent.setSurname(menuutil.requiresurname());
        }
        if (changeparams.contains("'age'")) {
            selectedstudent.setAge(menuutil.requireage());
        }
        if (changeparams.contains("'classname'")) {
            selectedstudent.setClassname(menuutil.requireclassname());
        }
    }
public static void updatestudentwitrhsplit(){
                    StudentUtil.printAllRegistredStudents();
                int index = InputUtil.requirenumber("nececi adamda deyisiklik etmek isteyirsiz");
                System.out.println("melumatlari daxil edin:");

                Student selectedstudent = config.studentns[index - 1];
                String changeparams = InputUtil.requiretext("neleri deyisdirmek isteyirsiz:mes 'name','surname'");
                String[] parametrs = changeparams.split(",");
                for (int i = 0; i < parametrs.length; i++) {
                    String params = parametrs[i];
                    if (params.equalsIgnoreCase("name")) {
                        selectedstudent.setName(menuutil.requirename());
                    }else if (params.equalsIgnoreCase("surname")) {
                        selectedstudent.setSurname(menuutil.requiresurname());
                    }else if (params.equalsIgnoreCase("age")) {
                        selectedstudent.setAge(menuutil.requireage());
                    } else if (params.equalsIgnoreCase("classname")) {
                        selectedstudent.setClassname(menuutil.requireclassname());
                    }
                }
}
}
