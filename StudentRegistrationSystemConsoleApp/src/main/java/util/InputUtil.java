/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class InputUtil {
    public static String requiretext(String title){
                  Scanner sc = new Scanner(System.in);
                System.out.println( title );
                String answer = sc.nextLine();
                return answer;
    }
        public static int requirenumber(String title){
                  Scanner sc = new Scanner(System.in);
                System.out.println( title);
                int answer = sc.nextInt();
                return answer;
    }
    
}
