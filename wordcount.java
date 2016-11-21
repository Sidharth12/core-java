package binsear;
import java.util.*;
public class wordcount {

    public static void main(String[] args) {
    Scanner st=new Scanner(System.in);
       System.out.println("enter the String :");
       String a=st.nextLine();
       String w[]=a.split(" ");
       int count=0;
       for(String s:w){
       count++;
       }
       System.out.println(" the no of words are "+count);
    }
}
