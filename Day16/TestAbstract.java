package Day16;

interface Repairable{}
interface Heal{}

class Unit1{
    int attack;
    int hitPoint; // 에너지
    final int MAX_HP;//상수 최대 에너지
    Unit1(int hp, int attack){
        MAX_HP = hp;
        hitPoint = MAX_HP;
        this.attack = attack;
    }
}

class GroudUnit extends Unit1{
    GroudUnit(int hp, int attack){
        super(hp,attack);
    }
}
class AirUnit extends Unit1{
    AirUnit(int hp, int attack){
        super(hp,attack);
    }
}

class Tank extends GroudUnit implements Repairable{
    Tank(){
        super(150,10);
    }
    //Object class 메소드를 오버라이딩
    @Override
    public String toString() {
        return "Tank";
    }
}

class SCV extends GroudUnit implements Repairable,Heal{
    SCV(){
        super(60,5);
    }
    //SCV 수리
    void reapair(Repairable r){
        if(r instanceof Unit1){
            Unit1 u = (Unit1) r;// 참조자료형 변환
            if(u !=null && u.MAX_HP != u.hitPoint){
                System.out.println(u+"에너지 1증가");
                u.hitPoint++;
            }
        }
    }
}

class Marine1 extends GroudUnit implements Heal{
    Marine1(){
        super(40,6);
    }
}
class Madic extends GroudUnit implements Heal{
    Madic(){
        super(80,0);
    }
    //치료기능
    void Heal(Heal h){
        if(h instanceof Unit1){
            Unit1 u = (Unit1) h;
            if(u != null && u.MAX_HP != u.hitPoint){
                u.hitPoint += 2;
            }
        }
    }
}


public class TestAbstract {
    public static void main(String[] args) {
        Tank t = new Tank();
        Marine1 m = new Marine1();
        SCV scv = new SCV();
        t.hitPoint = 20;
        System.out.println(t);
        while(t.hitPoint != t.MAX_HP){
            scv.reapair(t);
        }
        //scv.reapair(m); 에러 발생 마린은 Repairable을 상속 받지 않음
    }
}
