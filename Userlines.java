/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userlines;

import java.io.*;
import java.util.StringTokenizer;

public class Userlines {

    public static void main(String[] args) {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String a[] = new String[10];
        try {
            for (int i = 0; i < 10; i++) {
                a[i] = br.readLine();
              
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        // System.out.println("Line 1");
        File fo = new File("C:\\Users\\mruser\\Documents\\sample.txt");
        try {
            FileOutputStream fi = new FileOutputStream(fo);
            for (int i = 0; i < 10; i++) {
                fi.write(a[i].getBytes());
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
       // System.out.println("Line 2");
        try {
            br = new BufferedReader(new FileReader(fo));
            String d = br.readLine();
            int count = 0;
            System.out.println(d);
           
            StringTokenizer sto = new StringTokenizer(d, "\\.");
            while(sto.hasMoreTokens()){
                count++;
                if (count == 3 || count == 4) {
                System.out.println(sto.nextElement());
            }
                else{
                    sto.nextElement();
                }
        } 
    }
        catch (Exception ex) {
            System.out.println(ex.toString());
        }
}
}
