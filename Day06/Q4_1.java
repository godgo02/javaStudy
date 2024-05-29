package Day06;

public class Q4_1 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int count = 1;
        int sw = 1; //스위치
        for(int i = 0;i<a.length;i++) { // 행
            for(int j = 0;j<a[i].length;j++){
                if(sw == 1){
                    a[i][j] = count++;
                }
                else{
                    a[i][a[i].length-j-1] = count++;
                }
            }
            sw = sw * -1;
        }
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                System.out.print(a[i][j] +"\t");
            }
            System.out.println();
        }
    }
}
