package javaapplication52;

import java.util.*;

public class secondmaxal {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(12);
        al.add(19);
        al.add(9);
        al.add(21);
        Iterator it = al.iterator();
        System.out.println("elements before reverse");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        /* Collections.reverse(al);
         System.out.println("elements after reverse");*/
         System.out.println("al :"+al);
         
        int max = 0, secondmax = 0;
        for (int i : al) {
            if (i > max) {
                secondmax = max;
                max = i;
            } else if (i > secondmax) {
                secondmax = i;
            }
        }
        System.out.println("max is :"+max);
        System.out.println("secondmax is :"+secondmax);
    }

}
