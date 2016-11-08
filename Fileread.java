/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileread;

import java.io.*;



public class Fileread {
  
    
    public static void main(String[] args) {
        try{
       FileReader fr=new FileReader("E:\\demo.txt");
       BufferedReader bt =new BufferedReader(fr);
       String str=bt.readLine();
       {
           if(str!=null){
           System.out.print(str);
       }
        }
        }
    catch(Exception ex){
        System.out.println(ex.toString());
}
       /* finally{
            if(fr!=null){
                fr=null;
            }
            if(bt!=null){
                bt=null;
            }
        }
    }*/
}
}
