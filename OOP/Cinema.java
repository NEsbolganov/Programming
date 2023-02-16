package OOP;

public class Cinema {
    public static void main(String[] args) {
        int a[][] = new int [25][36];
        for(int i=0;i<25;i++){
            for(int j=0;j<=35;j++){
                a[i][j] = getRandomNumber(0,2);
            }
        }
        int cnt=0;
        for(int j=0;j<36;j++){
            if(a[11][j]==1)cnt++;
            System.out.print(a[11][j]+" ");
        }
        System.out.println();
        System.out.println(cnt+" Билет 11 рядтан сатылды");
    }
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
