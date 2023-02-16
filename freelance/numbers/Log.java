package freelance.numbers;

import java.io.*;

public class Log {
    public static void main(String[] args) throws IOException {
        int i=0,lineNum=0;
        try{
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\esbol\\IdeaProjects\\homework\\src\\freelance\\numbers\\number1.txt"));
            String line = reader.readLine();
            while(line!=null){
                lineNum++;
                line = reader.readLine();
            }
            reader.close();
        }catch (IOException ex){
            System.out.print("There's a problem caught!");
            ex.printStackTrace();
        }
        double numbers[] = new double[lineNum];
        try{
            BufferedReader read = new BufferedReader(new FileReader("C:\\Users\\esbol\\IdeaProjects\\homework\\src\\freelance\\numbers\\number1.txt"));
            String nums = read.readLine();
            while(nums!=null){
                numbers[i] = Double.parseDouble(nums);
                i++;
                nums= read.readLine();
            }
            read.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
        double log[] = new double[lineNum];
        int c=0;
        for(i=0;i<lineNum;i++){
            if(numbers[i]<0){
                //System.out.print(Math.log(numbers[i]*(-1))+" ");
                log[c] = Math.log(Math.abs(numbers[i]));
                c++;
            }
        }
        File fout = new File("C:\\Users\\esbol\\IdeaProjects\\homework\\src\\freelance\\numbers\\number3.txt");
        FileOutputStream fos = new FileOutputStream(fout);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        for (i = 0; i < c; i++) {
            bw.write(String.valueOf(log[i]));
            bw.newLine();
        }

        bw.close();
        File sout = new File("C:\\Users\\esbol\\IdeaProjects\\homework\\src\\freelance\\numbers\\number2.txt");
        FileOutputStream dos = new FileOutputStream(sout);
        BufferedWriter add = new BufferedWriter(new OutputStreamWriter(dos));
        add.write("Result="+String.valueOf(c));
        add.close();
    }
}
