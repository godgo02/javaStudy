package Day04;

import java.util.Scanner;

/*
1.입력 -> 1. 입력 객체생성 2. 자료형에 맞게 입력 받기 변수에 대입
2.출력
입력 받은 값을 가지고 짝수 홀수를 구분해서 출력을 해줘야 합니다.
짝수 : 2 4 6 8
홀수 : 1 3 5 7 9
짝수 -> 1 ~ 입력 값 % 2 == 0
홀수 -> 1 ~ 입력 값 % 2 == 1
 */
public class Q1 {
    public static void main(String[] args) {
        //1.입력
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        //2.출력
        //2-1 짝수
        System.out.print("짝수 : ");
        for(int i =1;i<num;i++){
            if(i % 2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.print("홀수 : ");
        //2-2 홀수
        //1 % 2 -> 1 앞수가 작으면 그대로 나머지 값으로 출력
        for(int i =1;i<num;i++){
            if(i % 2 == 1){
                System.out.print(i+" ");
            }
        }
    }
}
