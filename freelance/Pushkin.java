package freelance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Pushkin {
    public static void main(String[] args) {
        ArrayList<String>stih = new ArrayList<String>();
        String s="Скажи-ка, дядя, ведь недаром\n" +
                "Москва, спаленная пожаром,\n" +
                "Французу отдана?\n" +
                "Ведь были ж схватки боевые,\n" +
                "Да, говорят, еще какие!\n" +
                "Недаром помнит вся Россия\n" +
                "Про день Бородина!";
        String temp="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='\n')temp+=s.charAt(i);
            else{
                stih.add(temp);
                temp="";
            }
        }
        stih.add(temp);
        System.out.println("------------------------");
        for(int i=0;i<stih.size();i++){
            System.out.println(stih.get(i));
        }
        Collections.sort(stih, new Comparator<String>(){
            public int compare(String s1, String s2){
                return s1.length() - s2.length();
            }
        });

        System.out.println("------------------------");
        for(int i=0;i<stih.size();i++){
            System.out.println(stih.get(i));
        }
    }
}
