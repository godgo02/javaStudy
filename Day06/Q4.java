package Day06;

public class Q4 {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int count = 1;

        for(int i = 0;i<a.length;i++){ // 행
            if(i % 2 == 0){
                for(int j = 0;j<a[i].length;j++){ //열
                    a[i][j] = count++;
                }
            }
            else{
                for(int j = a[i].length-1;j>=0;j--){ //열
                    a[i][j] = count++;
                }
            }
        }

        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[i].length;j++){
                System.out.print(a[i][j] +"\t");
            }
            System.out.println();
        }
    }
}
