/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication52;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author VAS_student
 */
public class removefnlelement {
    public static void main(String args[]) {
LinkedList<Integer> al = new LinkedList<Integer>();
        al.add(10);
        al.add(12);
        al.add(19);
        al.add(9);
        al.add(21);
        System.out.println("elements :"+al);
        System.out.println("first element of list :"+al.pollFirst());
         System.out.println("last element of list :"+al.pollLast());
         System.out.println("elements :"+al);
    }
}
                                                                                                                