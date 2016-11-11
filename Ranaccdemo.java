package ranaccdemo;

import java.io.*;

public class Ranaccdemo {

    public static void writefromfile(String file, int position, String record) {

        try {
            RandomAccessFile filestore = new RandomAccessFile(file, "rw");
            filestore.seek(position);
            filestore.writeUTF(record);
            filestore.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static String readfromfile(String d, int position) {
String record=null;
        try {
            RandomAccessFile filestore = new RandomAccessFile(d, "rw");
            filestore.seek(position);
            record = filestore.readUTF();
            filestore.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
        return record;
    }

    public static void main(String[] args) {
        String str = ("this is my java prog");
        Ranaccdemo.writefromfile("C:\\Users\\mruser\\Documents\\mytext.txt", 23, str);
        String datafromfile = Ranaccdemo.readfromfile("C:\\Users\\mruser\\Documents\\mytext.txt", 23);
        System.out.println("data read from file :" + datafromfile);
    }

}
