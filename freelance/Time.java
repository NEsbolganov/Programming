package freelance;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class Time {
    public static void main(String[] args) throws IOException {
        long m = System.currentTimeMillis();
        File file = new File("C:\\Users\\esbol\\IdeaProjects\\homework\\src\\freelance\\Time.java") ;
        Path filePath = file.toPath();
        BasicFileAttributes attributes = null;
        try {
            attributes = Files.readAttributes(filePath, BasicFileAttributes.class);
        }
        catch (IOException exception) {
            System.out.println("Exception handled when trying to get file " + "attributes: " + exception.getMessage());
        }
        long milliseconds = attributes.creationTime().to(TimeUnit.MILLISECONDS);
        if((milliseconds > Long.MIN_VALUE) && (milliseconds < Long.MAX_VALUE)) {
            Date creationDate = new Date(attributes.creationTime().to(TimeUnit.MILLISECONDS));
        }
        Scanner in = new Scanner(System.in);
        DateFormat obj = new SimpleDateFormat("dd MMM yyyy HH:mm:ss:SSS Z");
        final Date res = new Date(milliseconds);
        long update = attributes.lastModifiedTime().to(TimeUnit.MILLISECONDS);
        System.out.println("Дата создания файла: "+obj.format(res));
        Date up = new Date(update);
        System.out.println("Дата изменения файла: " + obj.format(up));
        System.out.println((double) (System.currentTimeMillis() - m)+" milliseconds");
        String cCode = Locale.getDefault().getCountry();
        List<String>timezone = GetZones(cCode);
        for(int i=0;i<timezone.size();i++) System.out.print(timezone.get(i)+" ");
        System.out.println(cCode);
    }
    public static List<String> GetZones(String country) {
        List<String> zones = new ArrayList<>();
        for (String i : TimeZone.getAvailableIDs()) {
            if (i.startsWith(country)) {
                zones.add(i);
            }
        }
        return zones;
    }
}
