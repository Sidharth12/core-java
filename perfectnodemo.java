package binsear;

import java.util.ArrayList;
import java.util.Scanner;

public class perfectnodemo {

	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		System.out.print("enter the no :");
		int a = st.nextInt();
		ArrayList<Integer> b=new ArrayList<Integer>();
		int d;
		for(d=1;d<a;d++){
			if(a%d==0){
			b.add(d); }
		}
		System.out.println("divisors are :"+b);
		int sum=0;
		for(int i=0;i<b.size();i++){
			sum+=b.get(i);
		}
		System.out.println("sum is "+sum);
		if(sum==a){
			System.out.println("it is a perfect no");
		}
		else{
			System.out.println("it is not a perfect no");
		}
	}

}


