package freelance.words;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) throws IOException {
        String str,root = "test7.txt";
        Scanner sc = new Scanner(System.in);
        FileWriter fout = new FileWriter(root);
        fout.write("Testing scanner 10 11 12,2 15,6 onr true false False");
        FileReader fin = new FileReader(root);
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                int i=sc.nextInt();
                System.out.println("int" + i);
            }
        }
    }
}