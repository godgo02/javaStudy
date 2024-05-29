package Day13;

import java.util.Scanner;

class Controller{
    int add(int a, int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int minus(int a, int b){
        return a-b;
    }
    double minus(double a, double b){
        return a-b;
    }
    int mul(int a, int b){
        return a*b;
    }
    double mul(double a, double b){
        return a*b;
    }
    int div(int a, int b){
        return a/b;
    }
    double div(double a, double b){
        return a/b;
    }
    int inputSelect1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("1.정수연산 2.실수연산 3.종료 :");
        return sc.nextInt();
    }
    int inputSelect2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("1.더하기 2.빼기 3.곱하기 4.나누기 : ");
        return sc.nextInt();
    }
    int[] inputInt(){
        int[] input = new int[2];
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 : ");
        input[0] = sc.nextInt();
        System.out.print("숫자 2 : ");
        input[1] = sc.nextInt();
        return input;
    }
    double[] inputDouble(){
        double[] input = new double[2];
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 1 : ");
        input[0] = sc.nextDouble();
        System.out.print("숫자 2 : ");
        input[1] = sc.nextDouble();
        return input;
    }
    void print(int result){
        System.out.println("결과 값 : "+result);
    }
    void print(double result){
        System.out.println("결과 값 : "+result);
    }

}
public class Q2 {
    public static void main(String[] args) {
        Controller c = new Controller();

        while (true){
            int s1 =c.inputSelect1();
            if(s1 == 1){
                int s2 = c.inputSelect2();
                if(s2 == 1){
                    int[] input = c.inputInt();
                    int result = c.add(input[0],input[1]);
                    c.print(result);
                }
                else if(s2 == 2){
                    int[] input = c.inputInt();
                    int result = c.minus(input[0],input[1]);
                    c.print(result);
                }
                else if(s2 == 3){
                    int[] input = c.inputInt();
                    int result = c.mul(input[0],input[1]);
                    c.print(result);
                }
                else if(s2 == 4){
                    int[] input = c.inputInt();
                    int result = c.div(input[0],input[1]);
                    c.print(result);
                }
                else{
                    System.out.println("잘못된 입력입니다.");
                }
            }
            else if(s1 == 2){
                int s2 = c.inputSelect2();
                if(s2 == 1){
                    double[] input = c.inputDouble();
                    double result = c.add(input[0],input[1]);
                    c.print(result);
                }
                else if(s2 == 2){
                    double[] input = c.inputDouble();
                    double result = c.minus(input[0],input[1]);
                    c.print(result);
                }
                else if(s2 == 3){
                    double[] input = c.inputDouble();
                    double result = c.mul(input[0],input[1]);
                    c.print(result);
                }
                else if(s2 == 4){
                    double[] input = c.inputDouble();
                    double result = c.div(input[0],input[1]);
                    c.print(result);
                }
                else{
                    System.out.println("잘못된 입력입니다.");
                }
            }
            else if(s1 == 3){
                System.out.println("종료합니다.");
                break;
            }
            else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
