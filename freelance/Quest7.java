package freelance;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quest7 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(1*)0");
        Matcher m =  p.matcher("111110");
        System.out.println(m.group(1));
        double var2=356f;
    }
}
