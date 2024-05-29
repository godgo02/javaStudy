package Day08;

import java.util.Scanner;

public class Q3_1 {
    static int rectangleArea(int w, int h){
        return w*h;
    }
    static void triangleArea(int w, int h){
        System.out.println("삼각형 넓이 : "+w*h/2);
    }

    static int[] input(){
        Scanner sc = new Scanner(System.in);
        int[] hy = new int[2];
        System.out.print("1.가로 : ");
        hy[0] = sc.nextInt();
        System.out.print("2.세로 : ");
        hy[1] = sc.nextInt();
        return hy;
    }

    public static void main(String[] args) {
        //1.입력
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("1.사각형넓이 2.삼각형넓이 3.종료 : ");
            int num = sc.nextInt();
            if(num == 1 || num == 2){
                int[] hy = input();
                if(num == 1){
                    System.out.println("사각형 넓이 : "+rectangleArea(hy[0],hy[1]));
                }
                else{
                    triangleArea(hy[0],hy[1]);
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
