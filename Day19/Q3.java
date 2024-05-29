package Day19;

import java.util.Random;

//부스터 - 인터페이스 아무것도 X
interface Booster{}
//탈것 - 이동거리, 게이지, 이동 함수
abstract class Vehicle {
    Random r = new Random();
    int distance;
    int gauge;
    abstract void move(int stop,int turn);
}
// 이동 오버라이딩, 주행거리 출력 기능, 게이지 출력 기능
//자동차
class Car extends Vehicle implements Booster{
    //게이지 출력 함수
    void gaugePrint(int turn){
        gauge = turn % 4;
        System.out.print("자동차 게이지 : "+gauge+",");
    }
    //이동거리 출력함수
    void distancePrint(){
        System.out.println("자동차의 주행거리 : "+distance);
    }
    void move(int stop,int turn){
        int move = r.nextInt(21);
        if(stop != 1){
            distance += move;
        }
        gaugePrint(turn);
        distancePrint();
    }
}
//자전거
class Bicyle extends Vehicle implements Booster{
    void gaugePrint(int turn){
        gauge = turn % 2;
        System.out.print("자전거 게이지 : "+gauge+",");
    }
    //이동거리 출력함수
    void distancePrint(){
        System.out.println("자전거의 주행거리 : "+distance);
    }
    void move(int stop,int turn){
        int move = r.nextInt(11);
        if(stop != 2){
            distance += move;
        }
        gaugePrint(turn);
        distancePrint();
    }
}
//오토바이
class Motocycle extends Vehicle implements Booster{
    void gaugePrint(int turn){
        gauge = turn % 3;
        System.out.print("오토바이 게이지 : "+gauge+",");
    }
    //이동거리 출력함수
    void distancePrint(){
        System.out.println("오토바이 주행거리 : "+distance);
    }
    void move(int stop,int turn){
        int move = r.nextInt(16);
        if(stop != 3){
            distance += move;
        }
        gaugePrint(turn);
        distancePrint();
    }
}



public class Q3 {
    static void boosterRun(int stop, Booster b){
        if(b instanceof Car){
            if(stop != 1 && ((Car) b).gauge == 3){
                ((Car) b).distance += 2;
            }
        }
        if(b instanceof Bicyle){
            if(stop !=2 && ((Bicyle) b).gauge == 1){
                ((Bicyle) b).distance += 5;
            }
        }
        if(b instanceof Motocycle){
            if(stop != 3 && ((Motocycle) b).gauge == 2){
                ((Motocycle) b).distance += 3;
            }
        }
    }


    public static void main(String[] args) {
        Random r = new Random();
        Car c = new Car();
        Bicyle b = new Bicyle();
        Motocycle m = new Motocycle();

//        Vehicle[] v = new Vehicle[3];
//        v[0] = new Car();
//        v[1] = new Bicyle();
//        v[2] = new Motocycle();

        int turn = 0;
        int stop;

        while(true){
            stop = r.nextInt(3)+1; //1~3

            /*
            for(int i = 0;i<v.length;i++){
                v[i].move(stop,turn);
            }
            */
            //부수터가 추가적으로 이동하는게 있습니다.
            boosterRun(stop,c);
            boosterRun(stop,b);
            boosterRun(stop,m);

            //본인이 이동하는게 있고
            c.move(stop,turn);
            b.move(stop,turn);
            m.move(stop,turn);

            //반복문 종료 조건 누구든 거리가 500 이상이면 break;
            if(c.distance >= 500 || b.distance >= 500 || m.distance >= 500){
                break;
            }
            turn++; //턴증가
        }

        if(c.distance > b.distance && c.distance > m.distance){
            System.out.println("자동차 우승입니다.");
        }
        else if(b.distance > c.distance && b.distance > m.distance){
            System.out.println("자전거 우승입니다.");
        }
        else{
            System.out.println("오토바이 우승입니다.");
        }
    }
}
