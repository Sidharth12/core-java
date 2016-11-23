
import java.util.*;
import java.io.*;

public class onfiletoother {

    public static void main(String args[]) {
        String person="C:\\Users\\vas_student\\Documents\\person.txt";
        String person2="C:\\Users\\vas_student\\Documents\\person2.txt";
        byte b[]=new byte[100];
        int read;
        try( FileInputStream fis=new FileInputStream(person); FileOutputStream fos= new FileOutputStream(person2))
        {
            while((read=fis.read(b))!=-1){
            if(read<b.length){
            fos.write(b,0,read);
            }
            else{
            fos.write(b);
            }
            }
        }
        catch(IOException ex){
                System.out.println(ex.toString());
                }
    }
}
