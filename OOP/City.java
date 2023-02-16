package OOP;

public class City {
    String name;
    int countFlat;
    int [] flats;
    public City(String name,int size){
        this.name = name;
        this.countFlat = size;
        this.flats = new int[size];
    }
    public City(){

    }
    public void addFlat(Flat a,int i){
        this.flats[i]=a.price;
    }
    public int getMax(){
        int max=-1;
        for(int i=0;i<flats.length;i++){
            if(max<flats[i])max=flats[i];
        }
        return max;
    }
    public int getMin(){
        int max=1555555;
        for(int i=0;i<flats.length;i++){
            if(max>flats[i])max=flats[i];
        }
        return max;
    }
    public int getDif(){
        return getMax()-getMin();
    }
}
