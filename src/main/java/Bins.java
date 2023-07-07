
public class Bins {

    private int[][] bin;

    public Bins(int start, int end) {
        int size = end - start + 1;
        this.bin = new int[2][size];
        for (int i = 0; i < bin[0].length; i++) {
            bin[0][i] = start;
            bin[1][i] = 0;
            start++;
        }
    }

    public int getBin(int check) {
        for (int i = 0; i < bin[0].length; i++) {
            if (bin[0][i] == check) {
                return bin[1][i];
            }
        }
        return 0;
    }

    public void incrementBin(int check) {
        for (int i = 0; i < bin[0].length; i++) {
            if (bin[0][i] == check) {
                bin[1][i]++;
            }
        }


    }
}

//        public static void (String[] args){
//            Bins test = new Bins(2,12);





