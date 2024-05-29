package Day14;

import java.util.Random;
import java.util.Scanner;

//포켓몬스터
/*
타입, 색깔, 사이즈
기능 - 자기가 뭔지 말해주는 기능
포켓몬이 태어나면서 자기가 뭔지선택
생성자 -> 포켓몬 세팅이 되어야 한다.
 */
//포켓볼
/*
포켓몬 담으면 됩니다.
※ 포켓몬 객체를 만들면 X
 */
//지우
/*
포켓볼
상황상 오박사에게 받기로 했기때문에 객체 X
변수 O 그래야 받을 수 있다.
 */
//오박사
/*
포켓볼 3개 -> 포켓볼 객체 있습니다.
 */
/*
Main에서 직접 생성된 포켓몬을 오박사 포켓볼에 담아줍니다.
그리고 지우가 1,2,3을 선택하면 오박사가
그에 맞는 포켓볼을 전달합니다.
지우는 포켓볼을 객체를 본인의 변수에 담습니다.
지우가 포켓볼을 이용해서 포켓몬을 부르고 포켓몬이 말을 합니다.
 */
class PM{
    String type;
    String color;
    String size;

    PM(){
        Random r= new Random();
        String[] m = {"피카츄","파이리","꼬부기","이상해씨"};
        String[] c = {"노란색","빨간색","파란색","초록색"};
        String[] s= {"대","중","소","미니"};

        this.type = m[r.nextInt(m.length)];
        this.color = c[r.nextInt(c.length)];
        this.size = s[r.nextInt(s.length)];

        talk();
    }

    void talk(){
        System.out.println(this.color+" "+this.type+
                "이(며)고, 크기는 "+this.size+" 입니다.");
    }
}

class PB{
    PM pm;
}

class JW{
    PB ball;
}

class Oh{
    PB[] bl = new PB[3];
    Oh(){
        for(int i = 0;i<bl.length;i++){
            bl[i] = new PB();
        }
    }
}
public class Q1 {
    public static void main(String[] args) {
        //1.지우
        JW j = new JW();
        //2.오박사
        Oh o = new Oh();
        //3.입력 객체
        Scanner sc = new Scanner(System.in);
        //오박사 포켓볼 3개에 포켓몬 객체 생성과 동시에 대입
        for(int i = 0;i<o.bl.length;i++){
            o.bl[i].pm = new PM();
        }
        while(true){
            System.out.print("1,2,3,중에 고르세요 : ");
            int num = sc.nextInt();
            if(num == 1 || num == 2 || num == 3){
                j.ball = o.bl[num-1];
                o.bl[num-1] = null;
                break;
            }
            else{
                System.out.println("잘못된 입력입니다.");
            }
        }
        j.ball.pm.talk();
    }
}
