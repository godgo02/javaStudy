package Day08;

import java.util.Scanner;

/*
1. 세과목 점수 입력 기능 - 주고 안받고(2) - 1
2. 평균 학점 연산 - 주고 받고(1) - 3
3. 평균 학점 결과 - 주고 받고(1) - 3
4. 잘못된 입력 값 확인 - 안주고 받고(3) - 2
5. 잘못된 입력 출력 - 안주고 안받고(4) -3
6. 평균 학점 출력 - 안주고 받고(3) -4
 */

public class Q2 {
    //            1. 세과목 점수 입력 기능 - 주고 안받고(2) - 1
    static int[] inputScore(){
        String[] subject = {"국어","영어","수학"};
        int[] score = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<score.length;i++){
            System.out.print(subject[i]+" : ");
            score[i] = sc.nextInt();
        }
        return score;
    }
    //            2. 평균 학점 연산 - 주고 받고(1) - 3
    static double totalAVG(int[] score) {
        int total = 0;
        for(int i = 0;i<score.length;i++) {
            total += score[i];
        }
        return total / 3.0;
    }
    //            3. 평균 학점 결과 - 주고 받고(1) - 3
    static String avgHakJum(double avg) {
        String hakjum = "";
        if(avg >= 95){
            hakjum = "A+";
        }
        else if(avg >= 90){
            hakjum = "A";
        }
        else if(avg >= 85){
            hakjum = "B+";
        }
        else if(avg >= 80){
            hakjum = "B";
        }
        else if(avg >= 75){
            hakjum = "C+";
        }
        else if(avg >= 70){
            hakjum = "C";
        }
        else if(avg >= 60){
            hakjum = "D";
        }
        else{
            hakjum = "F";
        }
        return hakjum;
    }
    //            4. 잘못된 입력 값 확인 - 안주고 받고(3) - 2
    static void wrongCheck(int[] score){
        //올바른 입력
        if(score[0] >=0 && score[0]<=100 && score[1] >=0 && score[1] <= 100
                && score[2] >=0 && score[2] <=100) {
            double avg = totalAVG(score);
            String hakJum=avgHakJum(avg);
            avgPrint(avg,hakJum);
        }
        else {//잘못된 입력
            wrongPrint();
        }
    }
    //            5. 잘못된 입력 출력 - 안주고 안받고(4) -3
    static void wrongPrint() {
        System.out.println("점수가 잘 못 입력 됐습니다.");
    }
    //            6. 평균 학점 출력 - 안주고 받고(3) -4
    static void avgPrint(double avg, String hakJum){
        System.out.printf("평균 %.1f이고 학점은 %s입니다.",avg,hakJum);
    }
    public static void main(String[] args) {
        /*
        int[] score = inputScore();
        wrongCheck(score);
         */
        wrongCheck(inputScore());
    }
}
