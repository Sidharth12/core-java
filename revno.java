package binsear;
import java.io.*;
import java.util.*;

public class revno {

	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		System.out.print("enter the no :");
		int a = st.nextInt();
		int rev=0;
		 while(a>0)
		 {
			 rev=(rev*10)+(a%10);
		a=(a/10);
		}
		System.out.print(" reversed  no :"+rev);
		
	}

}
