package Day04;

/*
chapter 1
1.원하는 구구단
2.전체 구구단
3.종료
3번 종료가 있을 때 까지 계속 반복
1, 2, 3, 이외의 값이 입력이 되면 잘못된 입력 출력

chapter 2
원하는 구구단 전체구구단 출력 기능 추가
 */


import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        //1. 입력
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1.원하는 구구단 출력");
            System.out.println("2.전체 구구단 출력");
            System.out.println("3.종료");
            int num = sc.nextInt();
            if(num == 1){
                System.out.print("원하는 구구단 : ");
                int wDan = sc.nextInt();
                if(wDan >= 2 && wDan <=9){
                    for(int times = 1; times<= 9;times++){
                        System.out.println(wDan + "X" + times + "=" + wDan * times);
                    }
                }
                else{
                    System.out.println("잘못된 입력입니다.");
                }
            }
            else if(num == 2){
                int dan;
                int times;
                /*
                for(dan = 2; dan<=5;dan++){
                    System.out.println(dan+"단!!!");
                    for(times = 1; times<= 9;times++){
                        System.out.println(dan + "X" + times + "=" + dan * times);
                    }
                    System.out.println();
                }
                 */
                for(times = 1 ; times<= 9;times++){
                    for(dan = 2;dan<=5;dan++){
                        System.out.printf("%d * %d = %d\t",dan,times,dan*times);
                    }
                    System.out.println();
                }
                System.out.println();
                for(times = 1 ; times<= 9;times++){
                    for(dan = 6;dan<=9;dan++){
                        System.out.printf("%d * %d = %d\t",dan,times,dan*times);
                    }
                    System.out.println();
                }
            }
            else if(num == 3){
                System.out.println("프로그램 종료합니다.");
                break;
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
