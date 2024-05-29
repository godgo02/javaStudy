package Day12;

import java.util.Random;
import java.util.Scanner;

class Human{
    boolean check; // true 마피아 false 시민
    void print(){
        if(check){
            System.out.println("네 제가 마피아입니다.");
        }
        else{
            System.out.println("억울합니다. 저는 마피아가 아닙니다.");
        }
    }
}
class Police{
    Scanner sc = new Scanner(System.in);

    int input(){
        System.out.print("마피아는?");
        return sc.nextInt();
    }
}

public class Q1 {
    public static void main(String[] args) {
        Random r = new Random();
        Human[] hlist = new Human[5];
        Police p = new Police();
        int num = r.nextInt(5);//0~4
        //마피아 시민 세팅
        for(int i = 0;i<hlist.length;i++){
            hlist[i] = new Human();
            if(num == i){
                hlist[i].check = true;
            }
            else{
                hlist[i].check = false;
            }
        }
        //게임 시작
        while(true){
            int pNum = p.input();
            if(pNum >0 && pNum <6){ // 1~5 => 0~4
                hlist[pNum-1].print();
                if(hlist[pNum-1].check){
                    break;
                }
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }

    }
}
