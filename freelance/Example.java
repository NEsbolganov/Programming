package freelance;

import java.io.*;

public class Example {
    public static void main(String[] args) throws IOException {
        int i=0,linenum=0;
        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\esbol\\IdeaProjects\\homework\\src\\freelance\\f.txt"));
            String line = reader.readLine();
            while(line!=null){
                linenum++;
                line= reader.readLine();
            }
            reader.close();

        }catch(IOException ex){
            ex.printStackTrace();
        }
        String words[] = new String[linenum];
        int c=0;
        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\esbol\\IdeaProjects\\homework\\src\\freelance\\f.txt"));
            String line = reader.readLine();
            while(line!=null){
                words[c] = line;
                c++;
                line= reader.readLine();
            }
            reader.close();

        }catch(IOException ex){
            ex.printStackTrace();
        }
        String longest="";
        for(i=0;i<linenum;i++){
            if(words[i].length()>longest.length())longest=words[i];
        }
        File sout = new File("C:\\Users\\esbol\\IdeaProjects\\homework\\src\\freelance\\g.txt");
        FileOutputStream dos = new FileOutputStream(sout);
        BufferedWriter add = new BufferedWriter(new OutputStreamWriter(dos));
        add.write("The longest word is="+longest);
        add.close();
    }
}
