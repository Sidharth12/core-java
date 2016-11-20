package binsear;

public class fibodemo {

	public static void main(String[] args) {
		int a1=0,a2=1,a3,count=15,i=0;
		for(i=0;i<count;i++){
			a3=a1+a2;
			System.out.println(a3);
			a1=a2;
			a2=a3;
		}
		
		}
	}


