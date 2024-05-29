package Day07;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        int[][] arr = new int[num][num];
        // ----->
        //     |
        //     |
        //     |
        //     |
        // 열 5 K-- 행 4 +
        // 열 4 K-- 행 3 -
        // 열 3 K-- 행 2 +
        // 열 2 K-- 행 1 -
        // 열 1 K-- =>0
        int R = 0; //행
        int C = -1; //열
        int K = num; // 반복횟수
        int SW = 1; // 증가 감소를 위한 스위치
        int N = 1; //값


        while(true){
            //열
            for(int i = 0;i<K;i++){
                C = C + SW; // 0 1 2 3 4 || 3 2 1 0
                arr[R][C] = N++; // [0][0] [0][1] [0][2] [0][3] [0][4]
                                 // [4][3] [4][2] [4][1] [4][0]
            }
            K--;
            //----- break
            if(K == 0){
                break;
            }
            //행
            for(int i = 0;i<K;i++){
                R = R + SW; // 1 2 3 4
                arr[R][C] = N++; // [1][4] [2][4] [3][4] [4][4]
            }
            SW *= -1;
        }

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
