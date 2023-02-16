package freelance.SheraEndka;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Questionaire {
    public static void main(String[] args) throws IOException {
        System.out.println("Input your name and number of questions that you have:");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        int n = in.nextInt();
        File fout = new File("C:\\Users\\esbol\\IdeaProjects\\homework\\src\\freelance\\SheraEndka\\Test");
        Vector<String>questions = new Vector<String>();
        Vector<String>answers = new Vector<String>();
        in.nextLine();
        Vector<FileOutputStream>output = new Vector<FileOutputStream>();
        Vector<BufferedWriter>writers = new Vector<BufferedWriter>();
        for(int i=0;i<n;i++){
            output.add(new FileOutputStream(fout));
            BufferedWriter f = new BufferedWriter(new OutputStreamWriter(output.get(i)));
            writers.add(new BufferedWriter(f));
            String q1 = in.nextLine();
            questions.add(q1);
            String v1 = in.next();
            String v2 = in.next();
            String v3 = in.next();
            String correct = in.next();
            answers.add(correct);
            toWrite(writers.elementAt(i),q1,v1,v2,v3);
        }
    }
    public static void toWrite(BufferedWriter bw,String q1,String v1,String v2,String v3) throws IOException {
        bw.newLine();
        bw.write(q1);
        bw.write(v1+" "+v2+" "+v3+" ");
        bw.close();
    }
}
