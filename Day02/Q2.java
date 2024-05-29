package Day02;

import java.util.Scanner;

/*
문제 1
숫자를 2개 입력 받습니다.
2개 입력 받은 숫자를 더하기, 빼기, 곱하기 나누기, 나머지 연산자(%
)로 연산한 결과 값을 출력해 주세요.
예)
숫자1 : 10(엔터)
숫자2 : 5(엔터)
10 + 5 = 15
10 – 5 = 5
10 * 5 = 50
10 / 5 = 2
10 % 5 = 0
 */
public class Q2 {
    public static void main(String[] args) {
        //1. 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2 : ");
        int num2 = sc.nextInt();
        //2. 연산 후 출력
        // 10(num1) +(문자열) 5(num2) =(문자열) 15(num1 + num2)
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }
}
