
import java.io.Serializable;
import java.io.*;
import java.util.*;

class person implements Serializable{
String fname;
String lname;
int age;

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(fname);
        sb.append("\\n");
        sb.append(lname);
        sb.append("\\n");
        sb.append(age);
        sb.append("\\n"); 
        return(sb.toString());
    }
}
public class objectiodemo {
    public void WriteObject(String filename){
    ObjectOutputStream obj=null;
    Scanner st=new Scanner(System.in);
    System.out.println("enter first name :");
    String fname=st.nextLine();
    System.out.println("enter last name :");
    String lname=st.nextLine();
    System.out.println("enter age :");
    int age=st.nextInt();
    person p=new person();
    p.setFname(fname);
    p.setLname(lname);
    p.setAge(age);
    try{
    obj=new ObjectOutputStream(new FileOutputStream(filename));
    obj.writeObject(p);
    }
    catch(IOException ex){
    System.out.println(ex.toString());
    }
    }
    public static void main(String args[]){
    objectiodemo ot=new objectiodemo();
    ot.WriteObject("C:\\Users\\vas_student\\Documents\\person.txt");
    }
}
