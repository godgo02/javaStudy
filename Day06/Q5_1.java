package Day06;

import java.util.Scanner;

public class Q5_1 {
    public static void main(String[] args) {
        //입력 객체 생성
        Scanner sc = new Scanner(System.in);
        // 비행기 좌석 배열 생성
        boolean[][] seat = new boolean[9][2];// 초기값이 false
        // 예약 가능 좌석 변수 선언
        int count = 18;
        // 예약 할 수 없을 때까지 반복
        while(count > 0){
            // 예약 행열 입력
            System.out.println("예약하실 좌석을 입력해주세요.("+count+"석) :");
            System.out.print("행 : ");
            int h = sc.nextInt();
            System.out.print("열 : ");
            int y = sc.nextInt();
            // 잘못된 입력 확인 h 1~9 y 1~2
            if(h > 9 || h < 1 || y > 2 || y < 1){
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            // 올바른 입력
                // 올바른 입력 - 예약 O
                // true, false
                if(seat[h-1][y-1]){
                    System.out.println("비어 있는 좌석 ");
                    for(int i = 0;i<seat.length;i++){
                        for(int j = 0;j<seat[i].length;j++){
                            //false 출력
                            if(!seat[i][j]){
                                System.out.println("행 : "+(i+1)+"열 : "+(j+1));
                            }
                        }
                    }
                }
                // 올바른 입력 - 예약 X
                else{
                    System.out.println("예약이 완료 됐습니다.");
                    seat[h-1][y-1] = true; //1 1 => 0 0 [9][2] => [8][1]
                    count--;
                }
        }
        System.out.println("모든 자리가 예약 됐습니다.");
    }
}
