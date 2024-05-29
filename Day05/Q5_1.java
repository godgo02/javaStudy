package Day05;

import java.util.Random;
import java.util.Scanner;

public class Q5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        //int ran1, ran2, ran3;
        int[] ran = new int[3];
        ran[0] = r.nextInt(9)+1;
        ran[1] = r.nextInt(9)+1;
        ran[2] = r.nextInt(9)+1;

        while(ran[0] == ran[1] || ran[1] == ran[2] || ran[0] == ran[2]) {
            ran[0] = r.nextInt(9) + 1;
            ran[1] = r.nextInt(9) + 1;
            ran[2] = r.nextInt(9) + 1;
        }
        System.out.println(ran[0]+","+ran[1]+","+ran[2]);

        /////////////////////////////////////////////////////

        int strike = 0;
        int ball = 0;
        while(strike < 3){
            int[] user = new int[3];
            System.out.print("첫째자리 : ");
            user[0] = sc.nextInt();
            System.out.print("둘째자리 : ");
            user[1] = sc.nextInt();
            System.out.print("셋째자리 : ");
            user[2] = sc.nextInt();

            //잘못된 입력
            //1. 같은수 입력
            //2. 1~9이외의 숫자를 입력

            if(user[0] == user[1] || user[1] == user[2] || user[0] == user[2]
                    || user[0] < 1 || user[0] >9 || user[1] < 1 || user[1] >9
                    || user[2] < 1 || user[2] >9
            ){//잘못된 입력
                System.out.println("잘못된 입력 입니다. 올바르게 입력하세요.");
            }
            else{//올바른 입력
                strike = 0;
                ball = 0;
                if(user[0] == ran[0]){
                    strike++;
                }
                if(user[1] == ran[1]){
                    strike++;
                }
                if(user[2] == ran[2]){
                    strike++;
                }

                if(user[0] == ran[1] || user[0] == ran[2]){
                    ball++;
                }
                if(user[1] == ran[0] || user[1] == ran[2]){
                    ball++;
                }
                if(user[2] == ran[0] || user[2] == ran[1]){
                    ball++;
                }
                if(strike == 0 && ball == 0){
                    System.out.println("Out 입니다.");
                }
                else if(strike == 3){
                    System.out.println("홈런입니다. 축하합니다.");
                }
                else{
                    System.out.println("strike : "+strike+", ball : "+ball);
                }
            }
        }
    }
}
