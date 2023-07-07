public class Simulation {
      private   Bins runBins;

    private int numOfDice;
    private int numOfRolls;
    public Simulation(int numOfDice, int numOfRolls){
        this.numOfDice = numOfDice;
        this.numOfRolls = numOfRolls;
    }


    public void runSimulation(){
        int total = 0;
        Dice runDice = new Dice(numOfDice);
        runBins = new Bins(numOfDice, 6 * numOfDice);
        for (int i = 0; i < numOfRolls; i++){
            total = runDice.tossAndSum();

            runBins.incrementBin(total);
        }


    }

    public void printResults(){
        System.out.println("Simulation of " + numOfDice+ " dice tossed for "+ numOfRolls +" times.");
        for (int i = numOfDice; i <= (6* numOfDice); i++){
            System.out.println(i + " : " + runBins.getBin(i) + "           :" + ((double)(runBins.getBin(i))/ numOfRolls));
        }


    }



}
