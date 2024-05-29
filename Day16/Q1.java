package Day16;
//1. 유닛
/*
속성 - 가격,에너지,공격력,방어력,타겟,스피트,유닛특성
생성자 속성을 모두 받겠습니다.
출력하는 부분을 선언 또는 생성 -> 자식 class가 메소드 오버라이딩 하게 구현
 */
abstract class Unit{
    int price;// 가격
    int hp;//에너지
    int attack;//공격력
    int defence;//방어력
    String target; //타겟
    double speed;//스피드
    String characteristic; //유닛특성
    Unit(int price,int hp, int attack, int defence, String target,
         double speed, String characteristic){
        this.price = price;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.target = target;
        this.speed = speed;
        this.characteristic = characteristic;
    }
    abstract void print();
}
//2. 저글링, 히드라, 마린
//생성될 때 부모 class 유닛에 데이터를 전달
//부모의 출력 메소드를 오버라이딩
class Juggling extends Unit{
    Juggling(){
        super(50,35,5,0,"지상",
                2.612,"지상,소형,생체");
    }
    @Override
    void print() {
        System.out.println("저글링의 생산비용은 미네랄 : "+price+",체력: "+hp+
                ",공격력: "+attack+" 방어력: "+defence+
                ",공격 대상: "+target+", 이동속도 : "+speed+", 유닛특성:"+
                characteristic);
    }
}

class Hydra extends Unit{
    Hydra(){
        super(100,80,10,0,"지상,공중",
                1.741,"지상,중형,생체");
    }
    @Override
    void print() {
        System.out.println("히드라의 생산비용은 미네랄 : "+price+",체력: "+hp+
                ",공격력: "+attack+" 방어력: "+defence+
                ",공격 대상: "+target+", 이동속도 : "+speed+", 유닛특성:"+
                characteristic);
    }
}
class Marine extends Unit{
    Marine(){
        super(50,50,6,0,"지상,공중",
                1.875,"지상,소형,생체");
    }
    @Override
    void print() {
        System.out.println("마린의 생산비용은 미네랄 : "+price+",체력: "+hp+
                ",공격력: "+attack+" 방어력: "+defence+
                ",공격 대상: "+target+", 이동속도 : "+speed+", 유닛특성:"+
                characteristic);
    }
}


//3. 테란, 저그
/*
테란 -> 마린 3마리
공격하는 기능 / 공격 당하는 기능 /에너지 체크를 통한 null변경 기능/ 게임 종료 기능
저그 -> 저글링, 히드라
공격하는 기능 / 공격 당하는 기능 /에너지 체크를 통한 null변경 기능/ 게임 종료 기능
 */



public class Q1 {
    public static void main(String[] args) {
        Juggling j = new Juggling();
        Hydra h = new Hydra();
        Marine[] m = new Marine[3];
        for(int i = 0;i<m.length;i++){
            m[i] = new Marine();
        }
        j.print();
        h.print();
        for(int i =0;i<m.length;i++){
            m[i].print();
        }
    }
}
