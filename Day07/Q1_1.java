package Day07;

import java.util.Scanner;

public class Q1_1 {
    //1. 주고 받고(더하기 연산)
    static int add(int a, int b){
        return a + b;
    }
    //2. 주고 안받고(곱하기 연산)
    static int mul(){
        int[] a = input();
        return  a[0] * a[1];
    }
    //3. 안주고 받고(빼기 연산)
    static void minus(int a, int b){
        System.out.printf("결과 값 : %d입니다.", a - b);
    }
    //4. 안주고 안받고(나누기 연산)
    static void div(){
        int[] a = input();
        System.out.printf("결과 값 : %.1f입니다.", (double) a[0] / a[1]);
    }
    static int[] input(){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2];
        System.out.print("숫자 1 입력 : ");
        a[0] = sc.nextInt();
        System.out.print("숫자 2 입력 : ");
        a[1] = sc.nextInt();

        return a;
    }

    public static void main(String[] args) {
        //1.입력
        Scanner sc = new Scanner(System.in);
        System.out.print("연산자 입력 : ");
        String op = sc.next();

        int[] a;

        switch (op) {
            case "+":
                a=input();
                /*
                int result = add(num1, num2);
                System.out.printf("결과 값 : %d입니다.", result);
                 */
                System.out.printf("결과 값 : %d입니다.", add(a[0],a[1]));
                break;
            case "-":
                a = input();
                minus(a[0],a[1]);
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
