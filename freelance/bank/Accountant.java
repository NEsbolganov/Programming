package freelance.bank;

import java.util.Vector;

//бухгалтер
public class Accountant {
    String name;
    int cntDocs;
    Vector<String>docs = new Vector<String>(cntDocs);
    Accountant(String name,int cntDocs){
        this.cntDocs = cntDocs;
        this.name = name;
    }
}
