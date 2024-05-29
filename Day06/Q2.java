package Day06;

import java.util.Scanner;

/*
1. 입력
2. 최대공약수 구하고
3. 최소공배수 구하고
4. 출력
 */
public class Q2 {
    public static void main(String[] args) {
        //1. 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 2 : ");
        int num2 = sc.nextInt();
        int a = num1;
        int b = num2;
        int r = 1;
        /*
           36 =  36 % 120
                 120 % 36
           r = a % b
           12 = 120 % 36
           0  = 36 % 12
           a = b;
           b = r;
         */
        /*
        while(true){ b가 최대 공약수
            r = a % b;
            if(r == 0){
                break;
            }
            a = b; // 36 12
            b = r; // 12 0
        }
         */
        while(r > 0){ //a가 최대공약수
            r = a % b;
            a = b; // 36 12
            b = r; // 12 0
            // a = 36 b = 12 = r = 12
            // r = 0 a = 12  b = 0
            /*
           12 = 120 % 36
           0  = 36 % 12
             */
        }
        System.out.println("최대 공약수 : " + a);
        System.out.println("최소 공배수 : "+num1*num2/a);
    }
}
