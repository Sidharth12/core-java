package javaapplication52;

import java.util.*;

public class hashtotree {

    public static void main(String args[]) {
        HashSet<Integer> al = new HashSet<Integer>();
        al.add(13);
        al.add(21);
        al.add(45);
        al.add(9);
        al.add(6);
        System.out.println("hashset is :"+al);
        TreeSet ts=new TreeSet(al);
        System.out.println("treeset is :"+ts);
    }
}
