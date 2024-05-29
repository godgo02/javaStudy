package Day03;

import java.util.Scanner;

public class Q1_1 {
    public static void main(String[] args) {
        //1.입력
        Scanner sc = new Scanner(System.in);
        System.out.print("월 입력 : ");
        int month = sc.nextInt();
        System.out.print("온도 입력 : ");
        int temp = sc.nextInt();
        //2. 출력

        //2-3 잘못된 입력
        if(month<1 || month >12 || temp <-15 || temp > 37){ // 1월보다 작거나 12월보다 크거나 / -15보다 작거나 37도보다 크거나
            System.out.println("잘못된 입력입니다.");
        }
        //2-1, 2-2 올바른 입력 범위 안 잘못된 입력
        else{
            if(month >2 && month <6 && temp >=3 && temp <=15){ //봄
                System.out.println("계절을 봄입니다. 온도는 "+temp+"도 입니다.");
            }
            else if(month >5 && month <9 && temp >=18 && temp <=37){ //여름
                System.out.println("계절을 여름입니다. 온도는 "+temp+"도 입니다.");
            }
            else if(month >8 && month <12 && temp >=3 && temp <=15){ //여름
                System.out.println("계절을 가을입니다. 온도는 "+temp+"도 입니다.");
            }
            else if(month == 1 || month == 2 || month == 12 && temp >=-15 && temp <=2) {
                System.out.println("계절을 겨울입니다. 온도는 "+temp+"도 입니다.");
            }
            else{
                System.out.println("계절과 온도가 맞지 않습니다.");
            }
        }
    }
}
