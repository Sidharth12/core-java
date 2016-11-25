
package javaapplication52;


import java.util.*;
public class hashmapsal{
public static void main(String args[]){
Scanner st=new Scanner(System.in);
HashMap<String,Integer> hobj=new HashMap<String,Integer>();
System.out.print("enter the no of cust : ");
int a=st.nextInt();
System.out.println("enter the details of cust  : ");
for(int i=0;i<a;i++){
System.out.println("enter the name of cust  : ");
String name=st.next();
System.out.print("enter the salary of cust : ");
int sal=st.nextInt();
hobj.put(name,sal);
}

Map<String,Integer> trmap=new TreeMap<String,Integer>(hobj);
//System.out.println("the employees are :"+trmap);
System.out.println("enter the numeric value of salary to search :");
int w=st.nextInt();
if(trmap.containsValue(w)){
System.out.println("the salary exists ");
}
else{
System.out.println("the salary does not exists ");
}
Iterator e=trmap.entrySet().iterator();{
while(e.hasNext()){
Map.Entry<String,Integer> emap=(Map.Entry)e.next();
System.out.println("key is :"+emap.getKey()+"        value is: "+emap.getValue());
}
}
}
}