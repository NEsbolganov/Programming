package FileWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class File {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner((System.in));
        String a ="",b="Hello world!!!";
        try (FileInputStream fin = new FileInputStream("C:\\Users\\esbol\\Documents\\abc.txt");
             FileOutputStream f = new FileOutputStream("C:\\Users\\esbol\\Documents\\world.txt"))
        {
            byte[] buffer = new byte[b.length()];
            f.write(b.getBytes(),0, b.length());
            int i=-1;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
                a+=(char)i;
            }

        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(a);
        int cnt=0;
        for(int i=0;i<a.length();i++)if(Character.isUpperCase(a.charAt(i)))cnt++;
        System.out.println(cnt);
    }
}