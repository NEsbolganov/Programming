package FileWork;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ClientBase{
    public static void main(String[] args) throws IOException, ParseException {
        Scanner in = new Scanner(System.in);
        StringBuffer clients = new StringBuffer();
        StringBuffer ages = new StringBuffer();
        try(FileInputStream file = new FileInputStream("C:\\Users\\esbol\\IdeaProjects\\homework\\src\\FileWork\\file.txt");
        FileInputStream text = new FileInputStream("C:\\Users\\esbol\\IdeaProjects\\homework\\src\\FileWork\\text.txt")){
            int i=-1;
            while((i=file.read())!=-1){
                //System.out.print((char)i);
                clients.append((char)i);
            }
            int j=-1;
            while((j=text.read())!=-1){
                //System.out.print((char)j);
                ages.append((char)j);
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        int cnt=0;
        for(int i=0;i< clients.length();i++){
            if(clients.charAt(i)==' ')cnt++;
        }
        String[] client = new String[cnt];
        int[] age = new int[cnt];
//        System.out.println(cnt);
//        System.out.println("--------------");
//        System.out.println(clients);
        for(int i=0;i<cnt-1;i++){
            client[i] = Client(clients);
            clients.delete(0,index(clients)-1);
        }
        client[cnt-1] = clients.substring(0);
        for(int i=0;i<cnt;i++){
            age[i] = getAge(ages);
            ages.delete(0,12);
        }
        //age[cnt-1]=getAge(ages);
        for(int i=0;i<cnt;i++){
            System.out.print(client[i]+age[i]);
        }
    }
    public static int getAge(StringBuffer ages) throws ParseException {
        int age = 0;
        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");
        String sDate1= ages.substring(0,10);
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
        Calendar dob = Calendar.getInstance();
        dob.setTime(date1);
        dob.add(Calendar.DAY_OF_MONTH, -1);
        Calendar today = Calendar.getInstance();
        age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) <= dob.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }
    public static String Client(StringBuffer clients){
        int cnt=0,i=0;
        String a="";
        while(cnt!=3){
            if(Character.isUpperCase(clients.charAt(i))==true){
                cnt++;
            }
            a+= clients.charAt(i);
            i++;
        }
        return a.substring(0,a.length()-1);
    }
    public static int index(StringBuffer clients){
        int cnt=0,i=0,index=0;
        while(cnt!=3){
            if(Character.isUpperCase(clients.charAt(i))==true){
                cnt++;
            }
            i++;
            index=i;
        }
        return index;
    }
}
