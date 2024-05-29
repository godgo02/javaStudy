package Day16;
//3. 테란, 저그
/*
테란 -> 마린 3마리
공격하는 기능 / 공격 당하는 기능 /에너지 체크를 통한 null변경 기능/ 게임 종료 기능
저그 -> 저글링, 히드라
공격하는 기능 / 공격 당하는 기능 /에너지 체크를 통한 null변경 기능/ 게임 종료 기능
 */
class Terran{
    //1. 마린 배열 객체
    Marine[] m = new Marine[4];
    //2. 테란 진영에서 turn관리를 위한 변수
    int turn = 0;

    Terran(){
        for(int i = 0;i<m.length;i++){
            m[i] = new Marine(); //객체 생성
            m[i].print(); // 출력
        }
    }
    //1.공격하는 기능
    Marine attackZerg(){
        // 0 1 2 0 1 2단 순 -> null
        if(m[0] != null || m[1] != null || m[2] != null || m[3] != null){
            //죽은애가 있으면 null 체크에 의해서 뒤로 넘어가야합니다.
            while(m[turn % 4] == null){
                turn++;
            }
            //죽은애가 없으면
            System.out.println("마린의 "+turn % 4 +"번째가 공격을 합니다.");
            return m[turn++ % 4];
        }
        else{
            return null;
        }
    }
    //2.공격 당하는 기능
    void beAttacked(Unit u){
        for(int i =0;i< m.length;i++){
            if(m[i] != null){
                System.out.println("마린"+i+"번째가 공격을 당합니다.");
                m[i].hp -= u.attack;
                break;
            }
        }
    }
    //3.에너지 체크 후 null 값 변경
    void energyCheck(){
        for(int i =0;i< m.length;i++){
            if(m[i] != null && m[i].hp <= 0){
                System.out.println("마린"+i+"번째가 사망했습니다.");
                m[i] = null;
            }
        }
    }
    //4. 게임 종료를 알려주는 기능
    boolean gameOverCheck(){
        for(int i = 0;i<m.length;i++){
            if(m[i] != null){
                return  true;
            }
        }
        return false;
    }

}
class Zerg{
    //1.저글링 히드라 객체를 담을 변수 생성
    Unit[] z = new Unit[2];
    //2. 턴 변수 선언
    int turn = 0; // 저그 턴
    //생성자
    Zerg(){
        z[0] = new Juggling();
        z[1] = new Hydra();
        for(int i = 0;i<z.length;i++){
            z[i].print();
        }
    }
    //1. 공격 하는 기능
    Unit attackZerg(){
        if(z[0] != null || z[1] != null){
            while(z[turn % 2] == null){
                turn++;
            }
            if(turn % 2 == 0){
                System.out.println("저글링이 공격합니다.");
            }
            else{
                System.out.println("히드라가 공격합니다.");
            }
            return z[turn++ % 2];
        }
        else{
            return null;
        }
    }

    //2. 공격 당하는 기능
    void beAttacted(Marine m){
        for(int i =0;i< z.length;i++){
            if(z[i]!=null){
                if(i == 0){
                    System.out.println("저글링이 공격을 당합니다.");
                }
                else{
                    System.out.println("히드라가 공격을 당합니다.");
                }
                z[i].hp -= m.attack;
                break;
            }
        }
    }
    //3.에너지 체크
    void energyCheck(){
        for(int i = 0;i<z.length;i++){
            if(z[i] != null && z[i].hp <= 0){
                if(i == 0){
                    System.out.println("저글링이 사망했습니다,");
                }
                else{
                    System.out.println("히드라가 사망했습니다.");
                }
                z[i] = null;
            }
        }
    }

    //4. 게임 진행여부 체크
    boolean gameOverCheck(){
        for(int i = 0;i<z.length;i++){
            if(z[i] != null){
                return true;
            }
        }
        return false;
    }

}

public class Q1_1 {
    public static void main(String[] args) {
        Terran t = new Terran();
        Zerg z = new Zerg();
        int count = 1;//게임의 턴
        while(t.gameOverCheck() && z.gameOverCheck()){
            //1.테란 공격
            System.out.println((count++) +"턴 테란 공격");
            z.beAttacted(t.attackZerg());
            z.energyCheck();
            if(!z.gameOverCheck()){
                System.out.println("테란이 승리했습니다.");
                continue;
            }
            //2.저그 공격
            System.out.println((count++) +"턴 저그 공격");
            t.beAttacked(z.attackZerg());
            t.energyCheck();
            if(!t.gameOverCheck()){
                System.out.println("저그가 승리했습니다.");
            }
        }
    }
}
