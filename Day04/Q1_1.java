package Day04;

import java.util.Scanner;

public class Q1_1 {
    public static void main(String[] args) {
        //1.입력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();

        String jakk = "";
        String hol = "";

        for(int i = 1;i<num;i++){
            if(i % 2 == 0){ //짝수
                jakk += i + " ";
            }
            else{ //홀수
                hol += i +" ";
            }
        }
        System.out.println("짝수 : "+jakk);
        System.out.println("홀수 : "+hol);
    }
}
