import java.util.Scanner;


public class strcon {

   
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        String a=st.nextLine();
        String b=st.nextLine();
        
        int x=0;
        int y=0;
        int i,j;
        for(char q: a.toCharArray()){
            x++;
        }
        for(char w: b.toCharArray()){
            y++;
        }
        System.out.println("length of a:"+x);
        System.out.println("length of b:"+y);
        char c[]=new char[x+y+1];
       
        for( i=0;i<x;i++) { 
            c[i] = a.charAt(i);
        }
            c[i] = ' ';
            i++;
         for(j=0;j<y;j++){
        c[i]=b.charAt(j);
        i++;
    }
           
        System.out.print(c);
    }
}
