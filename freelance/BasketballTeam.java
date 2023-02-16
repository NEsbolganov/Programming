package freelance;

public class BasketballTeam {
    public static void main(String[] args){
     int []students = new int[30];
     int cnt = 0;
     for(int i=0;i<30;i++){
         students[i] = getRandomNumber(140,200);
         System.out.print(students[i]+" ");
         if(students[i]>170){
             cnt++;
         }
     }
        System.out.println("The number of students higher than 170 "+cnt);
        if(cnt>=5) System.out.println("Yes, we can make a team");
        else System.out.println("It's impossible to make a team");
    }
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
}
