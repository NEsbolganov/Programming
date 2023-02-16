package freelance;

public class Mass {
    public static void main(String[] args) {
        double []people = new double[25];
        double sum1=0,sum2=0,cnt1=0,cnt2=0;
        for(int i=0;i<25;i++){
            people[i] = getRandomNumber(50,180);
            System.out.print(people[i]+" ");
            if(people[i]>100){
                sum1+=people[i];
                cnt1++;
            }else{
                sum2+=people[i];
                cnt2++;
            }
        }
        double avg1 = sum1/cnt1, avg2 = sum2/cnt2;
        System.out.println();
        System.out.println("Fat people average mass: "+avg1);
        System.out.println("Others average mass: "+avg2);
    }
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
