package binsear;

import java.util.ArrayList;
import java.util.Scanner;

public class magicdemo {

	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		System.out.print("enter the no :");
		int a = st.nextInt();
		int d=0,s=0,s1=0,s2=0;
		while(a>0){
		int c=a%10;
		s=s+c;
		a=a/10;
		}
		while(s>0){
			int c=s%10;
			s1=s1+c;
			s=s/10;
			}

		while(s1>0){
			int c=s1%10;
			s2=s2+c;
			s1=s1/10;
			}
		if((s1==1||(s2==1))){
			System.out.println("it is a magic number");	
		}
		else{
			System.out.println("it is not a magic number");
		}
	}

}
