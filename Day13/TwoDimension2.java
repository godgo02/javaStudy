package Day13;

public class TwoDimension2 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]); //0
            }
            System.out.println();
        }
        System.out.println(arr.length); //2
        System.out.println(arr[0].length); //3
    }
}
