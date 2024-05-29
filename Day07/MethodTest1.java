package Day07;

import java.util.Random;
import java.util.Scanner;

// public 접근제한자 추후
// class 추후 배웁니다.
public class MethodTest1 {
    // static 바로 사용가능
    // main은 스페셜 -> 프로그램을 실행하면 무조건 main부터 실행합니다.

    public static void main(String[] args) {
        // void main(String[] args) //안주고 받고 3번
        // 이름이 main인 메소드는
        // 리턴이 없고 매개변수로 String 1차원 배열을 받습니다.

        System.out.println("헬로우"); // 안주고 받고 3번

        Scanner sc = new Scanner(System.in);// 객체생성 class 공부

        int num = sc.nextInt(); // 주고 안받고 2번

        Random r = new Random();

        int ran =r.nextInt(10);//주고 받고 1번

    }
}
