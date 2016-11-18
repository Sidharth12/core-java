package binsear;

import java.util.Stack;

public class stackdemo {
public void pushed(Stack st,int a){
	st.push(new Integer(a));
	System.out.println(("pushed element is ")+a);
}	
public void popped(Stack st){
	int b=(Integer)st.pop();
	System.out.println(("popped element is ")+b);
}	

public void peeked(Stack st){
	int c=(Integer)st.peek();
	System.out.println(("top element is ")+c);
}
public static void main(String args[]){
	Stack st=new Stack();
	stackdemo obj=new stackdemo();
	obj.pushed(st,12);
	obj.pushed(st,24);
	obj.pushed(st,36);
	obj.popped(st);
	obj.peeked(st);
}

}
