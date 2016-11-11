/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invalidage;


public class Invalidage {
    public static void main(String[] args) {
        testuser obj=new testuser();
      try{
         obj.votingelg(10);
    }
      catch(invalidageexception ex){
     System.out.println(ex);
}
    }
}
class testuser{
public void votingelg(int age)throws invalidageexception{
    if(age<18){
        throw new invalidageexception("not valid age");
    }
        else{
                System.out.println("eligible for voting");
                }
    }
}
class invalidageexception extends Exception{
    invalidageexception(String s){
        super(s);
    }
            
}
