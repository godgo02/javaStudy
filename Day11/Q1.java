package Day11;

import java.util.Random;

//주사위 클래스
//1.속성
// 색깔, 정수 1~6변수, 랜덤
//2.기능
// 메소드 호출시 랜덤 값 전달 -> 주고 안받고 주사위 던지기 기능
class Dice{
    String color;
    int num;
    Random r = new Random();

    Dice(String color){
        this.color = color;
    }
    int throwDice(){
        num = r.nextInt(6)+1;//1~6
        return num;
    }
}


public class Q1 {
    public static void main(String[] args) {
        //1. 주사위 2개(빨간, 파란)
        Dice red = new Dice("빨간색");
        Dice blue = new Dice("파란색");
        //2. 주사위 결과를 담을 수 있는 정수 변수 2개
        int redResult = 0;
        int blueResult = 0;
        int turn = 1;


        //주사위중에 50이 누가 빨리 되는지 동작
        while(redResult < 50 && blueResult <50){
            System.out.println("========"+(turn++)+"==========");
            redResult += red.throwDice();
            blueResult += blue.throwDice();

            System.out.println(red.color+"주사위 : "+redResult);
            System.out.println(blue.color+"주사위 : "+blueResult);
        }

        if(redResult > blueResult){
            System.out.println(red.color +"주사위 승리");
        }
        else if(redResult == blueResult){
            System.out.println("무승부 입니다.");
        }
        else{
            System.out.println(blue.color +"주사위 승리");
        }
    }
}
