package freelance;

public class height {
    public static void main(String[] args) {
        double [] height = new double[22];
        double male=0,female=0,cntmale=0,cntfemale=0;
        for(int i=0;i<22;i++){
            height[i] =getRandomNumber(-200,200);
            System.out.print(height[i]+" ");
            if(height[i]<0){
                male+=Math.abs(height[i]);
                cntmale++;
            }else{
                female+=height[i];
                cntfemale++;
            }
        }
        double avg1=male/cntmale, avg2 = female/cntfemale;
        System.out.println("Average men's height is: "+avg1);
        System.out.println("Average women's height is: "+avg2);
    }
    public static int getRandomNumber(int min, int max) {
        int rand = (int) ((Math.random() * (max - min)) + min);
        if(Math.abs(rand)<150)rand=getRandomNumber(-200,200);
        return rand;
    }
}
