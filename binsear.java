package binsear;
import java.util.*;
public class binsear {

	public static void main(String[] args) {
		Scanner st=new Scanner(System.in);
		System.out.println("enter the no of elements");
		int b=st.nextInt();
		int a[]=new int[b];
		for(int i=0;i<b;i++){
			a[i]=st.nextInt();
		}
		int first=0;
		int last =b-1;
		int middle=(first+last)/2;
		System.out.println("enter the elements to find");
		int c=st.nextInt();
		while( first <= last )
	    {
	      if ( a[middle] < c ){
	        first = middle + 1; 
	        }
	      else if ( a[middle] == c ) 
	      {
	        System.out.println(" found at location " + (middle+1 ));
	        break;
	      }
	      else
	         last = middle - 1;
	      middle = (first + last)/2;
	   }
		}

		}
	


