
import java.util.Scanner;

public class Custproduct {
    public void name() {
        Scanner st = new Scanner(System.in);
        System.out.print(" Enter the name :");
        String name = st.nextLine();
    }

    public int noofproductpurch() {
        Scanner st = new Scanner(System.in);
        System.out.print(" Enter the no of products purchased :");
        int a = st.nextInt();
        return (a);
    }

    public int price(int noofpro) {
        Scanner st = new Scanner(System.in);
        int b[]=new int[noofpro];
         int[] c = new int[noofpro];
         for(int i=0;i<noofpro;i++){
        System.out.print(" Enter the price of product :");
         b[i] = st.nextInt();
         System.out.print(" Enter the quantity :");
         c[i] = st.nextInt();
         }
         int d[]=new int[noofpro];
		 for(int j=0;j<noofpro;j++){
		 d[j]=b[j]*c[j];
		 }
		 int sum=0;
		 for(int i : d){
		 sum+=i;
		 }
		 return(sum);
    } 
    
 public void totcost(int s){
float a= (s/10000.0f)*100;
System.out.print("the % of salary spent :"+a);
 }
 
    public static void main(String[] args) {
       Custproduct obj=new Custproduct();
	   obj.name();
        int noofpro=obj.noofproductpurch();
        int s=obj.price(noofpro);
		obj.totcost(s);
		
    }

}
