package binsear;
import java.io.*;
import java.util.*;
public class sumofeach {

	public static void main(String[] args) {
		Scanner st=new Scanner (System.in);
		System.out.println("enter the no to find sum :");
		int a=st.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		while(a>0){
			//System.out.println("a :"+a);
			int d=(a%10);
			a=a/10;
			al.add(d);
		}
		//System.out.println("al : " +al);
		int s;
		int tot=0;
			for(s=0;s<al.size();s++){
				 tot+=al.get(s);
			}
			System.out.println("totoal is : "+tot);
	}

}
