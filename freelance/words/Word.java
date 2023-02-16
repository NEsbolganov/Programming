package freelance.words;

import java.io.*;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\esbol\\IdeaProjects\\homework\\src\\freelance\\words\\text1.txt"));
        int lines=0;
        try{
            String line = reader.readLine();
            while(line!=null){
                lines++;
                line = reader.readLine();

            }
            reader.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        String words[] = new String[lines];
        int c=0;
        BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\esbol\\IdeaProjects\\homework\\src\\freelance\\words\\text1.txt"));

        try{
            String line = read.readLine();
            while(line!=null){
                words[c] = line;
                c++;
                line = read.readLine();
            }
            read.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String checked[] = new String[lines];
        int w=0;
        for(int i=0;i<lines;i++){
            if(words[i].charAt(words[i].length()-1)==a.charAt(0)){
                checked[w] = words[i];
                w++;
            }
        }
        File fout = new File("C:\\Users\\esbol\\IdeaProjects\\homework\\src\\freelance\\words\\text2.txt");
        FileOutputStream fos = new FileOutputStream(fout);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        for (int i = 0; i < w; i++) {
            bw.write(checked[i]);
            bw.newLine();
        }

        bw.close();
    }
}
