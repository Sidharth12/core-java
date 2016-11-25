
import java.lang.Math;
import java.util.*;
public class hashmapdemo
{
  public static void main(String[] args)
  {
    HashMap<Integer,String> hobj=new HashMap<Integer,String>();
    Scanner st=new Scanner(System.in);
    hobj.put(1,"TEA");
    hobj.put(2,"COFFEE");
    hobj.put(3,"WATER");
    hobj.put(4,"JUICE");
    Set<Integer> so =hobj.keySet();
    for(Integer ko:so){
    String data=hobj.get(ko);
      System.out.println(ko+"   "+data);
    }
    System.out.println("Enter the choice of drink :");
    int choice=st.nextInt();
    System.out.println(hobj.get(choice));
  }
}

