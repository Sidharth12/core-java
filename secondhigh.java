package binsear;

import java.util.Scanner;

public class secondhigh {

	public static void main(String[] args) {
		Scanner st = new Scanner(System.in);
		System.out.print("enter the no of elements :");
		int a = st.nextInt();
		int b[] = new int[a];
		System.out.println("enter the no :");
		for (int i = 0; i < a; i++) {
			b[i] = st.nextInt();
		}
		int max = 0;
		int secondmax=0;
				for(int i:b){
					if(i>max){
						secondmax=max;
						max=i;
					}
					else if(i>secondmax){
							secondmax=i;
						}
					
					}
				
				System.out.println("highest :"+max);
							System.out.println("second highest :"+secondmax);
					
	}

}
