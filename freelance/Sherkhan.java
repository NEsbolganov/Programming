package freelance;

public class Sherkhan {
    public static void main(String[] args) {
        // Задача с generic и stringbuffer
        Camry dvuhsotka = new Camry(123,17000000,87000);
        Camry amp = new Camry(124,18000000, 58000);
        Camry jetpis = new Camry(125,16700000,101000);

        System.out.println(Camry.cnt);
        System.out.printf("Average Price is: %.1f",Math.abs(Camry.getAvgP()));
        System.out.println();
        dvuhsotka.AMP();
        dvuhsotka.getPrice();
    }
}
