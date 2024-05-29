package Day07;

import java.util.Scanner;
// 메소드 생성 X
public class Q1 {
    //1. 주고 받고(더하기 연산)
    static int add(int a, int b){
        return a + b;
    }
    //2. 주고 안받고(곱하기 연산)
    static int mul(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2 입력 : ");
        int num2 = sc.nextInt();

        return  num1 * num2;
    }
    //3. 안주고 받고(빼기 연산)
    static void minus(int a, int b){
        System.out.printf("결과 값 : %d입니다.", a - b);
    }
    //4. 안주고 안받고(나누기 연산)
    static void div(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2 입력 : ");
        int num2 = sc.nextInt();
        System.out.printf("결과 값 : %.1f입니다.", (double) num1 / num2);
    }


    public static void main(String[] args) {
        //1.입력
        Scanner sc = new Scanner(System.in);
        System.out.print("연산자 입력 : ");
        String op = sc.next();

        int num1;
        int num2;

        switch (op) {
            case "+":
                System.out.print("숫자 1 입력 : ");
                num1 = sc.nextInt();
                System.out.print("숫자 2 입력 : ");
                num2 = sc.nextInt();
                /*
                int result = add(num1, num2);
                System.out.printf("결과 값 : %d입니다.", result);
                 */
                System.out.printf("결과 값 : %d입니다.", add(num1,num2));
                break;
            case "-":
                System.out.print("숫자 1 입력 : ");
                num1 = sc.nextInt();
                System.out.print("숫자 2 입력 : ");
                num2 = sc.nextInt();
                minus(num1,num2);
                break;
            case "*":
                System.out.printf("결과 값 : %d입니다.", mul());
                break;
            case "/":
                div();
                break;
            default:
                System.out.println("잘못된 연산자 입니다.");
                break;
        }
    }
}
