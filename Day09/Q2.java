package Day09;

import java.util.Scanner;

public class Q2 {
    // 입력 메소드
    static int[] input(Scanner sc, int count){
        int[] hy = new int[2];
        while(true) {
            System.out.println("예약하실 좌석을 입력해주세요.(" + count + "석) :");
            System.out.print("행 : ");
            hy[0]= sc.nextInt();
            System.out.print("열 : ");
            hy[1] = sc.nextInt();
            // 잘못된 입력 확인 h 1~9 y 1~2
            if (hy[0] > 9 || hy[0] < 1 || hy[1] > 2 || hy[1] < 1) {
                System.out.println("잘못된 입력입니다.");
            } else {
                break;
            }
        }
        return hy;
    }

    static int resultPrint2(boolean[][] seat, int[] hy, int count){ // 배열 받아서 쪼개기
        if(seat[hy[0]-1][hy[1]-1]){
            seatPrint(seat);
        }
        // 올바른 입력 - 예약 X
        else{
            count=reserve(seat,hy[0],hy[1],count);
        }
        return count;
    }
    //출력 메소드
    static int resultPrint(boolean[][] seat,int h, int y, int count){ //쪼갠 배열 받아서 사용
        if(seat[h-1][y-1]){
            seatPrint(seat);
        }
        // 올바른 입력 - 예약 X
        else{
            count=reserve(seat,h,y,count);
        }
        return count;
    }

    static void seatPrint(boolean[][] seat){
        System.out.println("비어 있는 좌석 ");
        for(int i = 0;i<seat.length;i++){
            for(int j = 0;j<seat[i].length;j++){
                //false 출력
                if(!seat[i][j]){
                    System.out.println("행 : "+(i+1)+"열 : "+(j+1));
                    //return ; 준다 -> 메소드 종료 return
                    //반복문 돌고 있는 와중에 return; -> 종료
                }
            }
        }
    }

    static int reserve(boolean[][] seat, int h, int y, int count){
        System.out.println("예약이 완료 됐습니다.");
        seat[h-1][y-1] = true; //1 1 => 0 0 [9][2] => [8][1]
        count--;
        return count;
    }

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
           int[] hy = input(sc,count);
           count=resultPrint(seat,hy[0],hy[1],count);
            // 올바른 입력
            // 올바른 입력 - 예약 O
            // true, false
        }
        System.out.println("모든 자리가 예약 됐습니다.");
    }

}
