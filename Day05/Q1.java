package Day05;

import java.util.Random;
import java.util.Scanner;

/*
무한반복 2번 입력시 종료가 됩니다.
게임시작 1번을 입력하면 게임이 시작됩니다.
1.가위 2.바위 3.보 입력을 합니다.
랜덤으로 Com수를 추출하면 비교해서 승패여부를 알려줍니다.
다시 1.게임시작 2.종료로 이동합니다.
이 이외의 숫자가 입력시 잘못된 입력을 합니다.
 */
public class Q1 {
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
                //1.가위
                if(user == 1){
                    //com == 1
                    if(com == 1){
                        System.out.println("무승부");
                    }
                    //com == 2
                    else if(com == 2){
                        System.out.println("Com 승");
                    }
                    //com == 3
                    else{
                        System.out.println("User 승");
                    }
                }
                //2.바위
                else if(user == 2){
                    if(com == 1){
                        System.out.println("User 승");
                    }
                    //com == 2
                    else if(com == 2){
                        System.out.println("무승부");
                    }
                    //com == 3
                    else{
                        System.out.println("Com 승");
                    }
                }
                //3.보
                else if(user == 3){
                    if(com == 1){
                        System.out.println("Com 승");
                    }
                    //com == 2
                    else if(com == 2){
                        System.out.println("User 승");
                    }
                    //com == 3
                    else{
                        System.out.println("무승부");
                    }
                }
                //그 이외
                else{
                    System.out.println("올바로 가위바위보 내세요.");
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
