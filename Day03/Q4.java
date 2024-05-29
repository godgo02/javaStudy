package Day03;

import java.util.Scanner;

/*
1. 입력 -> 국어, 영어, 수학
2. 국어 영어 수학의 점수 입력이 올바른지 확인
    2-1 올바른 경우 -> 평균을 내서  학점을 부여
    2-2 올바르지 않은 경우 -> 과목마다 점수가 잘 못 입력 됐습니다. (출력)
 */
public class Q4 {
    public static void main(String[] args) {
        //1. 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 : ");
        int kor = sc.nextInt();
        System.out.print("영어 : ");
        int eng = sc.nextInt();
        System.out.print("수학 : ");
        int math = sc.nextInt();
        //2.올바른지 아닌지 확인
        //올란입력 올바르지 않은 것을 기준 선택 흑백
        //올바른 입력
        if(kor >=0 && kor<=100 && eng >=0 && eng <= 100 && math >=0 && math <=100){
            double avg = (kor + eng + math) / 3.0;
            // 97
            if(avg >= 95){
                System.out.printf("평균 %.1f이고 학점은 A+입니다.",avg);
            }
            else if(avg >= 90){
                System.out.printf("평균 %.1f이고 학점은 A입니다.",avg);
            }
            else if(avg >= 85){
                System.out.printf("평균 %.1f이고 학점은 B+입니다.",avg);
            }
            else if(avg >= 80){
                System.out.printf("평균 %.1f이고 학점은 B입니다.",avg);
            }
            else if(avg >= 75){
                System.out.printf("평균 %.1f이고 학점은 C+입니다.",avg);
            }
            else if(avg >= 70){
                System.out.printf("평균 %.1f이고 학점은 C입니다.",avg);
            }
            else if(avg >= 60){
                System.out.printf("평균 %.1f이고 학점은 D입니다.",avg);
            }
            else{
                System.out.printf("평균 %.1f이고 학점은 F입니다.",avg);
            }
        }
        //올바르지 않은 입력
        else{
            //국어 /국어 영어/ 국어 수학/ 수학 영어/ 국어 영어 수학/ 수학 / 영어
            /*
            if(kor <0 || kor >100 && eng >= 0 && eng <=100 && math >=0 && math <=100 ){
                System.out.println("국어 점수가 잘 못 입력됐습니다.");
            }
            else if(eng <0 || eng >100 && kor >= 0 && kor <=100 && math >=0 && math <=100 ){
                System.out.println("영어 점수가 잘 못 입력 됐습니다.");
            }
            else if(math <0 || math >100 && kor >= 0 && kor <=100 && eng >=0 && eng <=100 ){
                System.out.println("수학 점수가 잘 못 입력 됐습니다.");
            }
            */

            if(kor <0 || kor > 100){
                System.out.print("국어 ");
            }
            if(eng <0 || eng >100){
                System.out.print("영어 ");
            }
            if(math <0 || math >100){
                System.out.print("수학 ");
            }
            System.out.println("점수가 잘 못 입력 됐습니다.");
        }

    }
}
