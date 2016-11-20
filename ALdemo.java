package binsear;

import java.util.ArrayList;
import java.util.Scanner;

public class ALdemo {

	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		ArrayList al = new ArrayList();
		System.out.println("enter the contents :");
		
		al.add(st.nextInt());
		al.add(st.nextInt());
		al.add(st.nextInt());
		al.add(st.nextInt());
		System.out.println("contents of al are :" + al);
		System.out.println(" size of al is :" + al.size());
		al.remove(2);
		al.remove(1);
		System.out.println("contents of al after removing are :" + al);
		System.out.println("2nd content of al is :" + al.get(1));
		System.out.println("size  of al are :" + al.size());
	}

}
