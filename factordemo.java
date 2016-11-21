package binsear;
import java.util.*;
public class factordemo {
	public static void main(String[] args) {
	       int i;
	       Scanner st=new Scanner(System.in);
	       System.out.println("enter the no to find factor :");
	       int a=st.nextInt();
	       int fact=1;
	       for(i=1;i<=a;i++){
	           fact=fact*i;
	       }
	       System.out.println("factorial is "+fact);
	    }
	    
}
