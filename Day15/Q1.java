package Day15;

import java.util.Random;
import java.util.Scanner;

class Box{
}
class Monkey{

    private String color;
    private Box box;

    Monkey(String color){
        this.color = color;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    void print() {
        if(box != null) {
            System.out.println(color + " 원숭이가 상자를 가지고 있습니다.");
        }
        else {
            System.out.println(color + " 원숭이가 상자를 가지고 있지 않습니다.");
        }
    }

}

class Move {
  Monkey[] monkeys = new Monkey[5];


    Move() {
        String[] color = {"빨간","노란","파란","초록","검정"};
        for(int i = 0;i<monkeys.length;i++) {
            monkeys[i] = new Monkey(color[i]);
        }
        monkeys[0].setBox(new Box());
    }

    void allMonkeyPrint() {
        for(int j =0;j<monkeys.length;j++) {
            monkeys[j].print();
        }
        System.out.println("--------------------------------------------");
    }


    void changeBox(int a, int b){
        monkeys[a].setBox(monkeys[b].getBox());
        monkeys[b].setBox(null);
    }

    void change(int ch, int count) {
        if(ch == 1) {//오른쪽
            for(int i = 0;i<count;i++) {
                if(i == 4) {
                    changeBox(0,i);
                }
                else {
                    changeBox(i+1,i);
                }

                allMonkeyPrint();
            }
        }
        else {//왼쪽
            int num = 4;
            changeBox(num,0);
            allMonkeyPrint();

            for(int i = 1;i<count;i++) {
                changeBox(num-1,num);
                allMonkeyPrint();
                num --;
            }
        }
    }

}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        Move m = new Move();
        int ch = r.nextInt(2);
        int count = r.nextInt(5)+1;

        System.out.println("게임을 시작합니다.");


        System.out.println("좌로이동은 0 , 우로 이동은 1 랜덤수는 :" +ch);

        System.out.println("랜덤 이동횟수는 : "+count);
        System.out.println();

        m.allMonkeyPrint();

        m.change(ch, count);

        System.out.println();
        System.out.println("프로그램을 종료합니다.");
    }
}
