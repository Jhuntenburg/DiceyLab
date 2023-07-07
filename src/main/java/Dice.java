import java.util.Random;

public class Dice {

    private int numOfDiceThrown;
    public Dice(){
       this.numOfDiceThrown = 0;
    }
    public Dice(int numOfDiceThrown){
        this.numOfDiceThrown = numOfDiceThrown;
    }
    public int tossAndSum(){
        int sum = 0;
        Random diceToss = new Random();
        for (int i = 0; i < numOfDiceThrown; i++){
            sum += (diceToss.nextInt(6)+1);
        }
        return sum;
    }
    public int getNumOfDiceThrown(){
        return numOfDiceThrown;
    }

    public void setNumOfDiceThrown(int numOfDiceThrown) {
        this.numOfDiceThrown = numOfDiceThrown;
    }
}
