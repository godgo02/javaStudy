package Fight;

public class Battle {
    Burf burf = new Burf();
    int atkup = 0;
    //1. 랜덤을 통해서 에너지 증가, 공격력 업, 에너지 감소 선택
    void randBurf(Unit u){
        int randburf = (int)(Math.random()*3)+1;
        switch (randburf){
            case 1:
                //1. 공격력 증가
                atkup=burf.attackUp(u);
                break;
            case 2:
                //2. 힐
                burf.heal(u);
                break;
            case 3:
                //디버프
                burf.downHP(u);
                break;
            default:
                System.out.println("잘못된 랜덤 값입니다.");
                break;
        }
    }
    //2. A -> B 공격하는 기능 구현
    void attack(Unit a, Unit b){
        b.setHp(b.getHp() - a.getAttack());
        System.out.println(a.getName()+"의 공격!!!");
        System.out.println(b.getName()+"의 체력이 "+b.getHp()+"남았습니다.");
        a.setAttack(a.getAttack() - atkup);
        atkup = 0;
    }
}
