import java.util.Scanner;
import java.util.ArrayList;
public class listdemo{

public static void main(String args[]){
ArrayList <String>a = new ArrayList<String>();
ArrayList <Integer>b= new ArrayList<Integer>();
Scanner st=new Scanner(System.in);
a.add(st.next());
b.add(st.nextInt());
Iterator itr=a.iterator();
Iterator itr1=b.iterator();
    while(itr.hasNext()&& itr1.hasNext())
    {
        System.out.println(itr.next());
        System.out.println(itr1.next());
    }
}
}
