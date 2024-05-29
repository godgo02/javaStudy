package Day04;

import java.util.Scanner;

public class Q2_1 {
    public static void main(String[] args) {
        //1. 입력
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while(check){
            System.out.println("1.원하는 구구단 출력");
            System.out.println("2.전체 구구단 출력");
            System.out.println("3.종료");
            int num = sc.nextInt();

            switch (num){
                case 1:
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
                    break;
                case 2:
                    int dan;
                    int times;
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
                    break;
                case 3:
                    System.out.println("프로그램 종료합니다.");
                    check = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}
