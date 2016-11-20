package binsear;

import java.io.*;
import java.util.*;

public class dupdemo {
	public static void main(String args[]) {
		Scanner st = new Scanner(System.in);
		System.out.print("enter the no of elements :");
		int a = st.nextInt();
		int b[] = new int[a];
		System.out.println("enter the no :");
		for (int i = 0; i < a; i++) {
			b[i] = st.nextInt();
		}
		for (int i = 0; i < a-1; i++) {
			for (int j = i+1; j < a; j++){
			if (b[i] == b[j]) {
				System.out.println("duplicate no :"+b[i]);
			}
		}
	}
}
}