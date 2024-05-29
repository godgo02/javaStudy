package Day07;

public class MultiArrayTest1 {
    public static void main(String[] args) {
        int[][] d = new int[3][];

        d[0] = new int[5];
        d[1] = new int[2];
        d[2] = new int[3];

        for(int i = 0;i<d.length;i++){
            System.out.println(d[i].length);
        }

        int[][][] k = new int[3][][];
        k[0] = new int[5][2];

    }
}
