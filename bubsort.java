package binsear;

import java.util.*;

public class bubsort {
	public static void main(String args[]){
Scanner st=new Scanner(System.in);
System.out.println("enter the no of elements");
int b=st.nextInt();
int a[]=new int[b];
for(int i=0;i<b;i++){
	a[i]=st.nextInt();
}
int swap;
	for(int i=0;i<b;i++){
		for(int z=0;z<(b-1);z++){
			if(a[z]>a[z+1]){
				swap=a[z];
				a[z]=a[z+1];
				a[z+1]=swap;
			}
		}
	}
	System.out.println("the sorted nos are");
	for(int i=0;i<b;i++){
		System.out.print(a[i]+" ");

	}
	
}
}
