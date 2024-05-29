package Day07;

public class MultiArrayTest2 {
    public static void main(String[] args) {
        int[][] a = new int[5][];
        a[3] = new int[5]; //에러 발생 X
        System.out.println(a[3][2]); // 출력 ? 0

        int[][][][][] c = new int[4][4][4][][];

        //c[0][0][0][0][0] = 101; // 가능 할까요?

        c[0][0][0] = new int[5][5];

        c[1][1][1] = a;


        int[][][] x = new int[3][3][3];

    }
}
