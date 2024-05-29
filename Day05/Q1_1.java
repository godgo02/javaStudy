package Day05;

import java.util.Random;
import java.util.Scanner;

public class Q1_1 {
    public static void main(String[] args) {
        //1.입력, 랜덤 객체 생성
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        //무한루프 2입력 전까지
        while(true){
            System.out.print("1.게임시작 2.종료 : ");
            int num = sc.nextInt();
            //1입력
            if(num == 1){
                //게임 집중
                System.out.print("1.가위, 2.바위, 3.보 : ");
                int user = sc.nextInt();
                int com = r.nextInt(3)+1;//1~3
                System.out.println("com : "+com);
                //user 1(가위) - com 3(보) = -2
                //user 2(바위) - com 1(가위) = 1
                //user 3(보)   - com 2(바위) = 1
                //user - com = 0 무승부

                if(user >0 && user <4){ //1~3
                    int result = user - com;
                    if(result == -2 || result == 1){
                        System.out.println("User 승");
                    }
                    else if (result == 0) {
                        System.out.println("무승부");
                    }
                    else{
                        System.out.println("Com 승");
                    }
                }
                else{
                    System.out.println("가위바위보를 올바르게 내세요!");
                }

            }
            //2입력
            else if(num == 2){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            //그 나머지 입력
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
