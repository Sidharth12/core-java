/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stugrade;

import java.util.Scanner;

public class Stugrade {

    public void name(){ 
         Scanner st = new Scanner(System.in);
    System.out.print(" Enter the name :");
        String name = st.nextLine();
}
    public int marks(){
    Scanner sc = new Scanner(System.in);
    System.out.print(" Enter the no of subjects :");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print(" Enter the marks :");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        int tot = 0;
        for (int j = 0; j < a.length; j++) {
            tot = tot + a[j];
        }
        System.out.println(tot);
        
        return(tot);
    }
    public void grade(int total){ 
        //int x = marks();
        int x = total;
        float marks1 = (x / 50) * 100;
    if (marks1> 85) {
            System.out.print(" grade : a+");
        } else if (75 < marks1 && marks1 < 85) {
            System.out.print(" grade : a");
        } else if (75 < marks1 ) {
            System.out.print(" grade : b");
        } else if (64 < marks1 && marks1 < 50) {
            System.out.print(" grade : b");
        } else if ( marks1 < 50) {
            System.out.print(" grade : fail");
        }
    
    }
    public static void main(String[] args) {
        Stugrade obj=new Stugrade();
        obj.name();
        int x =obj.marks();
        obj.grade(x);
    }
}
