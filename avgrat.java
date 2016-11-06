import java.util.Scanner;
public class avgrat{
    public int name() {
        Scanner st = new Scanner(System.in);
		System.out.print(" Enter the no of cust :");
		int a=st.nextInt();
	String d[]=new String[a];
		for(int i=0;i<a;i++){
		System.out.print(" Enter the name :");
        d[i] = st.next();
		}return (a);
		}
    
public void rating(int d){
int x=d;
Scanner st = new Scanner(System.in);
int f[]=new int[x];
for(int i=0;i<x;i++){
        System.out.print(" Enter the rating :");
        f[i] = st.nextInt();
    }
	float sum=0f;
	for(int j: f){
		sum+=j;
		}
		System.out.println("sum :"+sum);
		float avg = (sum/x);
		System.out.println("avg :"+avg);
}
public static void main(String args[]){
avgrat obj=new avgrat();
int d=obj.name();
obj.rating(d);
}
}