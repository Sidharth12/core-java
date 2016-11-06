import java.util.Scanner;


public class Matsum {

   
    public static void main(String[] args) {
       Scanner st=new Scanner(System.in);
       System.out.print("enter no of rows: ");
       int a=st.nextInt();
       System.out.print("enter no of col: ");
       int b=st.nextInt();
       int x[][]=new int[a][b];
       int y[][]=new int[a][b];
       int z[][]=new int[a][b];
       for(int i=0;i<a;i++){
           for(int j=0;j<b;j++){
               x[i][j]=st.nextInt();
           }
       }
	   System.out.println("first matrix is :");
        for(int i=0;i<a;i++){
           for(int j=0;j<b;j++){
              System.out.print (x[i][j]);
           } System.out.println();
       }
       for(int i=0;i<a;i++){
           for(int j=0;j<b;j++){
               y[i][j]=st.nextInt();
           }
       }
	   System.out.println("second matrix is :");
        for(int i=0;i<a;i++){
           for(int j=0;j<b;j++){
              System.out.print (y[i][j]);
           } System.out.println();
       }
	   System.out.println("the sum matrix is :");
        for(int i=0;i<a;i++){
           for(int j=0;j<b;j++){
               z[i][j]=x[i][j]+y[i][j];
               System.out.print (z[i][j]);
           }System.out.println();
    }
    
}
}