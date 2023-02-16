package OOP;

public class Salary {
    public static void main(String[] args) {
        int a[][] = new int[20][12];
        for(int i=0;i<20;i++){
            for(int j=0;j<12;j++){
                a[i][j]=getRandomNumber(100000,320000);
            }
        }
        double sum=0;
        for(int i=0;i<20;i++){
            sum=0;
            for(int j=0;j<12;j++){
                sum+=a[i][j];
                System.out.print(a[i][j]+" ");
            }
            System.out.println("Работник №"+(i+1)+" зарабатывает в среднем "+ (sum/12));
        }
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
