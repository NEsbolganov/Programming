package freelance.bank;

import java.util.Scanner;
import java.util.Vector;

public class Push {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opCnt=0;//created to count operations
        System.out.println("How many banks will there be?:");
        int n = in.nextInt();
        Bank[] banks = new Bank[n];
        Vector<Accountant>operations = new Vector<Accountant>();
        Vector<Double>cash = new Vector<Double>();
        for(int i=0;i<n;i++){
            System.out.println("Input bank's name, quantity of Accountants and Cashiers");
            String name = in.next();
            int cntAcc = in.nextInt();
            int cntCash = in.nextInt();
            banks[i] = new Bank(name,cntCash,cntAcc,i);
            System.out.println("Input cashiers' names and whether they paid for cass");
            for(int j=0;j<cntCash;j++){
                String cashName = in.next();
                boolean paying = in.nextBoolean();
                Cashier e = new Cashier(cashName,paying);
                banks[i].cashiers.add(e);
                int a = getRandomNumber(100,90000);
                banks[i].cashiers.elementAt(i).Transfer(a);
                cash.add(a*0.15);
            }
            System.out.println("Input accountants names, numbers of documents they have");
            for(int j=0;j<cntAcc;j++){
                String accName = in.next();
                int cntDocs = in.nextInt();
                Accountant e = new Accountant(accName,cntDocs);
                banks[i].accountants.add(e);
                operations.add(e);
                System.out.println("Input "+ banks[i].accountants.elementAt(j).name+" documents' names");
                for(int z=0;z<cntDocs;z++){
                    String operation = in.next();
                    banks[i].accountants.elementAt(j).docs.add(operation);

                }
                System.out.println("Input next Accountant's name and count of Docs");
            }
        }
        System.out.println("Input which operation you need:");
        int c = in.nextInt()-1;
        for(int i=0;i<operations.elementAt(c).docs.size();i++){
            System.out.print(operations.elementAt(c).docs.elementAt(i)+" ");
        }
        System.out.println();
        System.out.println("Input which cass's income you need");
        int c1 = in.nextInt()-1;
        System.out.println(cash.elementAt(c1));
        System.out.println("Cashiers that paid to cass:");
        for(int i=0;i<n;i++){
            for(int j=0;j<banks[i].cntCashiers;j++){
                if(banks[i].cashiers.elementAt(j).Paid==true) System.out.println(banks[i].cashiers.elementAt(j).name);
            }
        }
        System.out.println("Which bank's documents you want:");
        int c2 = in.nextInt()-1;
        for(int i=0;i<banks[c2].cntAccountants;i++){
            for(int j=0;j<banks[c2].accountants.elementAt(i).cntDocs;j++){
                System.out.println(banks[c2].accountants.elementAt(j).docs.elementAt(j));
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<banks[i].cntCashiers;j++){
                System.out.println(banks[i].cashiers.elementAt(j).name+" "+(100000-banks[i].cashiers.elementAt(j).income));
            }
        }
    }
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
