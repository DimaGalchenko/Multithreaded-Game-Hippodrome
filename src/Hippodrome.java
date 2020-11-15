import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    public static Hippodrome game;
    private List<Horse> horses;


    public Hippodrome(List<Horse> horses){
        this.horses = horses;

    }
    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome(new ArrayList<>());
        Horse horse1 = new Horse("Jenya",3,0);
        Horse horse2 = new Horse("Polina",3,0);
        Horse horse3 = new Horse("Andrey",3,0);

        game.horses = new ArrayList<>();
        game.horses.add(horse1);
        game.horses.add(horse2);
        game.horses.add(horse3);

        game.run();
        game.printWinner();
    }

    public List<Horse> getHorses(){
        return horses;
    }

    public void run() throws InterruptedException {
        for(int i = 1;i<101;i++){
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move(){
        for(Horse iter: horses){
            iter.move();
        }
    }
    public void print(){
        for(Horse iter: horses){
            iter.print();
        }
        for(int i=0;i<11;i++){
            System.out.println("");
        }
    }
    public Horse getWinner(){
        double max=0;
        Horse winner = null;
        for(Horse iter: horses){
            if(iter.getDistance()>max){
                max=iter.getDistance();
                winner = iter;
            }
        }
        return winner;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName()+"!");
    }
}
