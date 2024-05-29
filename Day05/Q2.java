package Day05;

import java.util.Random;
import java.util.Scanner;

/*
랜덤, 입력
맞출때까지 계속 반복
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int com = r.nextInt(100)+1; // 1~100
        System.out.println("com : "+com);

        while(true){
            System.out.print("숫자 입력 : ");
            int user = sc.nextInt();
            if(user >0 && user <101){
                //1.업
                if(user < com){
                    System.out.println("업");
                }
                //2.다운
                else if(user > com){
                    System.out.println("다운");
                }
                //3.맞추는경우
                else {
                    System.out.println("맞췄습니다. 축하합니다.");
                    break;
                }
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }

        }
    }
}
