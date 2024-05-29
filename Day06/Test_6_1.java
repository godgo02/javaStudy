package Day06;

import java.util.Scanner;

public class Test_6_1 {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            // 좌석은 총 18 / 9행 2열
            // 비행기 좌석 배열 생성
            int[][] seat = new int[9][2];
            // 입력 객체생성
            Scanner sc = new Scanner(System.in);
            int count = 18; // int count = 0;
            // 예약이 끝날때까지 반복 -> 남은좌석 0개 또는 예약좌석 18개
            while(count > 0) {
                // 입력
                System.out.println("예약하실 좌석을 입력해주세요(총"+count+"석) : ");
                System.out.print("행 : ");
                int h = sc.nextInt();
                System.out.print("열 : ");
                int y = sc.nextInt();
                // 1. 잘못된 입력 행 9보다크거나 1보다 작은경우 열 2보다 크거나 1보다 작은경우
                if(h > 9 || h < 1 || y > 2|| y < 1) {
                    System.out.println("잘못된 입력입니다.");
                }
                // 2. 올바른 입력
                else {
                    // 2-1 예약이 안되어 있는경우 -> 예약이 됐습니다. 출력 / 좌석에 값에 세팅 / 좌석에 대한 데이터 변경
                    if(seat[h-1][y-1] == 0) {
                        System.out.println("예약이 완료 됐습니다.");
                        seat[h-1][y-1] = 1;
                        count--;
                    }
                    // 2-2 예약이 되어 있는경우 -> 비어있는 좌석 출력
                    else {
                        System.out.println("비어있는 좌석 ");
                        for(int i =0;i<seat.length;i++) {
                            for(int j = 0;j<seat[i].length;j++) {
                                if(seat[i][j] == 0) {
                                    System.out.println("행 : "+(i+1)+"열 : "+(j+1));
                                }
                            }
                        }
                    }
                }
            }
            System.out.println("모든 자리가 예약 됐습니다.");
        }

    }


