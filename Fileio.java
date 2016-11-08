/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileio;

import java.io.*;

public class Fileio {

    public static void main(String[] args) {
        String custname;
        int custsal;
        int custage;
        char grade;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bt = new BufferedReader(isr);
        FileOutputStream fr = null;

        try {
            fr = new FileOutputStream("E:\\demo.txt");
            System.out.println("enter the name");
            custname = bt.readLine();
            System.out.println("enter the salary");
            custsal = Integer.parseInt(bt.readLine());
            System.out.println("enter the age");
            custage = Integer.parseInt(bt.readLine());
            System.out.println("enter the grade");
            grade = (char) (bt.read());
            System.out.println("name is :" + custname);
            System.out.println("salary is :" + custsal);
            System.out.println("age  is :" + custage);
            System.out.println("grade is :" + grade);
            fr.write(custname.getBytes());
            fr.write(custage);
            fr.write(custsal);
            fr.write(grade);
        } catch (Exception ex) {
            System.out.print(ex.toString());
        }
    }
}
