package Day14;

import java.util.Random;

//상자 아무것도 필요 X
class Box{}
//원숭이
// 색깔, 박스
// 박스 객체 여부로 출력하는 기능
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
    void print(){
        if(box != null){
            System.out.println(color+" 원숭이가 상자를 가지고 있습니다.");
        }
        else{
            System.out.println(color+" 원숭이가 상자를 가지고 있지 않습니다.");
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        //랜덤 객체
        Random r = new Random();
        //원숭이 5마리
        Monkey[] monkeys = new Monkey[5];
        //색깔 문자열배열 생성
        String[] colors = {"빨간","노란","파란","초록","검정"};
        //원숭이 5마리 객체 생성 + 빨간원숭이 상자 객체 넣어주기
        for(int i = 0;i<monkeys.length;i++){
            monkeys[i] = new Monkey(colors[i]);
        }
        monkeys[0].setBox(new Box());
        //랜덤을 2개 좌,우 횟수
        int ch = r.nextInt(2);
        int count = r.nextInt(5)+1;

        System.out.println("게임을 시작합니다.");
        System.out.println("좌로 이동은 0, 우로 이동은 1 랜덤수는 : "+ch);
        System.out.println("랜덤 이동횟수는 : "+count);

        //반복문을 돌면서 원숭이 print를 호출 -> 반복문 돌때마다 상자 이동을 해야 합니다.
        for(int j = 0;j<monkeys.length;j++){
            monkeys[j].print();
        }
        if(ch == 1){
            //빨간[0] -> 노란[1] -> 파란[2] -> 초록[3] -> 검정[4]
            for(int i = 0;i<count;i++) {
                if(i == 4){ //검정 -> 빨간
                    monkeys[0].setBox(monkeys[i].getBox());
                    monkeys[i].setBox(null);
                }
                else{ // 그 이외의 움직임
                    monkeys[i+1].setBox(monkeys[i].getBox());
                    monkeys[i].setBox(null);
                }
                for(int j = 0;j<monkeys.length;j++){
                    monkeys[j].print();
                }
            }
        }
        else{
            int num = 4;
            monkeys[num].setBox(monkeys[0].getBox()); //빨간 -> 검정
            monkeys[0].setBox(null); // 빨간 -> null
            for(int i = 0;i<monkeys.length;i++){
                monkeys[i].print();
            }
            for(int i = 1;i<count;i++){
                monkeys[num-1].setBox(monkeys[num].getBox()); //검정 -> 초록 // 초록 -> 파란 // 파란 -> 노란 // 노란 - 빨간
                monkeys[num].setBox(null);
                for(int j = 0;j<monkeys.length;j++){
                    monkeys[j].print();
                }
                num--;
            }
        }
        System.out.println();
        System.out.println("프로그램을 종료합니다.");
    }
}
