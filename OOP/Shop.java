package OOP;

public class Shop {
    public static void main(String[] args) {
        int a[][] = new int[10][12];
        for(int i=0;i<10;i++){
            for(int j=0;j<12;j++){
                a[i][j]=getRandomNumber(100000,350000);
            }
        }
        double sum=0;
        for(int i=0;i<10;i++){
            sum=0;
            for(int j=0;j<12;j++){
                sum+=a[i][j];
            }
            System.out.println((i+1)+" магазин в среднем зарабаиывает "+ (sum/12));
        }
    }
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
