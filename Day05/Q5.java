package Day05;

import java.util.Random;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] com = new int[3];
        //중복제거 랜덤수 삽입
        for(int i = 0; i< 3; i++){
            com[i] = r.nextInt(9)+1;
            for(int j = 0;j<i;j++){
                if(com[i] == com[j]){
                    i--;
                    break;
                }
            }
        }
        for(int i = 0;i<6;i++){
            System.out.println(com[i]);
        }
        System.out.println(com[0] +","+com[1]+","+com[2]);


        int strike = 0;
        int ball = 0;
        int[] user = new int[3];
        while (true){
            for(int i = 0;i<3;i++){
                System.out.print(i+1+"자리 : ");
                user[i] = sc.nextInt();
                if(user[i] <1 || user[i] >9){
                    i--;
                    continue;
                }
                //중복체크
                for(int j = 0;j<i;j++){
                    if(user[i] == user[j]){
                        i--;
                        break;
                    }
                }
            }
            strike = 0;
            ball = 0;
            //올바른 숫자 입력 됐다는 보장 됐습니다.
            for(int i = 0;i<3;i++){
                for(int j = 0;j<3;j++){
                    if(user[i] == com[j]){
                        if(i == j){
                             strike++;
                        }
                        else{
                             ball++;
                        }
                    }
                }
            }
            if(strike == 0 && ball == 0){
                System.out.println("Out 입니다.");
            }
            else if(strike == 3){
                System.out.println("홈런입니다. 축하합니다.");
                break;
            }
            else{
                System.out.println("strike : "+strike+", ball : "+ball);
            }

        }
    }
}
