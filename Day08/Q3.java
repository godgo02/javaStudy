package Day08;

/*
1. 사각형, 삼각형 종료 이외의 입력
2. 사각형, 삼각형 입력시 -> 가로(정수) 세로(정수) 입력
   연산 사각형 -> 가로 X 세로 삼각형 -> 가로 X 세로 / 2
 3. 종료 입력시 프로그램 종료
 4. 1~3사이 입력이 아닐시 잘못된 입력 출력
 */

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //1.입력
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("1.사각형넓이 2.삼각형넓이 3.종료 : ");
            int num = sc.nextInt();
            if(num == 1 || num == 2){
                System.out.print("1.가로 : ");
                int w = sc.nextInt();
                System.out.print("2.세로 : ");
                int h = sc.nextInt();
                if(num == 1){
                    System.out.println("사각형 넓이 : "+w*h);
                }
                else{
                    System.out.println("삼각형 넓이 : "+w*h/2);
                }
            }
            else if(num == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
