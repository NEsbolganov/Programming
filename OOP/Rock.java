package OOP;
public class Rock extends Piece{
    int initial;
    int fin;
    char st;
    char end;
    boolean move;
    Rock(int in, char st , int fin, char end){
        this.initial = in;
        this.st = st;
        this.fin=fin;
        this.end=end;
    }
    public void display(){
        System.out.println("Starting position"+this.initial+this.st);
    }

    @Override
    public void isLegalMove() {
        move=true;
        if(Math.abs(initial-fin)!=0 && Math.abs((int)st-(int)end)!=0)move=false;
        if(Math.abs(initial-fin)>7 || Math.abs((int)st-(int)end)>7)move=false;
        System.out.println(move);
    }
}
