package binsear;
import java.util.*;
public class charoccur {
	  public static void main(String[] args) {
	      Scanner st =new Scanner(System.in);
	      int count=0;
	       System.out.println("enter the string");
	       String str=st.nextLine();
	       char ch[]=str.toCharArray();
	       for(int i=0;i<ch.length;i++){
	           char r=ch[i];
	           if(r=='h')
	       {
	          // System.out.println("count :"+count);
	           count++;
	       }
	       }System.out.println("count :"+count);
	    }   

}
