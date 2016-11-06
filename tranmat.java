import java.util.Scanner;
public class tranmat{
public static void main(String args[]){
Scanner st=new Scanner(System.in);
System.out.print("enter no of rows :");
int a=st.nextInt();
System.out.print("enter no of cols :");
int b=st.nextInt();
int q[][]=new int[a][b];
for(int i=0;i<a;i++){
for(int j=0;j<b;j++){
q[i][j]=st.nextInt();
}
}
System.out.println("the matrix is :");
for(int i=0;i<a;i++){
for(int j=0;j<b;j++){
System.out.print(q[i][j]);
}System.out.println();
}

int w[][]=new int[a][b];
for(int i=0;i<a;i++){
for(int j=0;j<b;j++){
w[j][i]=q[i][j];
}
}
System.out.println("the transposed matrix is :");
for(int i=0;i<a;i++){
for(int j=0;j<b;j++){
System.out.print(w[i][j]);
}System.out.println();
}
}
}