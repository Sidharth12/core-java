package javaapplication52;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class swapal {
    public static void main(String args[]){
    ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(12);
        al.add(19);
        al.add(9);
        al.add(21);
        Iterator it = al.iterator();
        System.out.println("elements :"+al);
        /*while (it.hasNext()) {
            System.out.println(it.next());
        }*/
        Collections.swap(al, 2, 4);
    System.out.println("elements after swap :"+al);
    if(al.contains(21)){
    System.out.println("Element exist");
    }
    else{
          System.out.println("Element does not exist");
    }
    }
}

