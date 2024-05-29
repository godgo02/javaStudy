package Day10;

import java.util.Random;

class Player{
    int line; //레인
    String country; //나라
    int go; //이동거리

    Player(int line, String country){
        this.line =line;
        this.country = country;
    }

    void unExpected(int num){
        Random r = new Random();
        if(line != num){
            //이동 가능
            go += r.nextInt(10)+1;
        }
        else{
            System.out.println("돌발상황 발생! : "+this.country);
        }
    }
}
public class Q3 {
    public static void main(String[] args) {
        Player korea = new Player(1,"한국");
        Player china = new Player(2,"중국");
        Player america = new Player(3,"미국");
        Player russia = new Player(4,"러시아");
        int count = 1;
        Random r = new Random(); //돌발상황을 주기위한 랜덤
        while (true){
            int ran = r.nextInt(4)+1;
            korea.unExpected(ran);
            china.unExpected(ran);
            america.unExpected(ran);
            russia.unExpected(ran);
            System.out.println("======"+(count++)+"턴=========");
            System.out.println(korea.country+"는 "+korea.go+"M 입니다.");
            System.out.println(china.country+"는 "+china.go+"M 입니다.");
            System.out.println(america.country+"는 "+america.go+"M 입니다.");
            System.out.println(russia.country+"는 "+russia.go+"M 입니다.");

            if(korea.go >99 || china.go >99 || america.go > 99 || russia.go > 99){
                break;
            }
        }
        if(korea.go > china.go && korea.go > america.go && korea.go > russia.go){
            System.out.println("우승국은 한국입니다.");
        }
        if(china.go > korea.go && china.go > america.go && china.go > russia.go){
            System.out.println("우승국은 중국입니다.");
        }
        if(america.go > korea.go && america.go > china.go && america.go > russia.go){
            System.out.println("우승국은 미국입니다.");
        }
        if(russia.go > korea.go && russia.go > china.go && russia.go > america.go){
            System.out.println("우승국은 러시아입니다.");
        }
    }
}
