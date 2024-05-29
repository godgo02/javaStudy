package Fight;

public class Burf {
    //힐
    void heal(Unit u){
        //Math.random() : 0~1까지 난수를
        //소숫점 0.8882 0.99942
        int heal = (int)(Math.random()*200)+100;
        u.setHp(u.getHp() + heal);
        if(u.getHp() > u.getMaxHP()){
            u.setHp(u.getMaxHP());
        }
        System.out.println("버프 : "+u.getName()+"의 체력이 "+heal+"만큼 증가하였습니다.");
    }
    //공격력 증가
    int attackUp(Unit u){
        int atkup = (int)(Math.random()*100)+50;
        u.setAttack(u.getAttack()+atkup);
        System.out.println("버프 : "+u.getName()+"의 공격력이 "+atkup+"만큼 증가하였습니다.");
        return atkup;
    }
    //디버프
    void downHP(Unit u){
        int downheal = (int)(Math.random()*200)+100;
        u.setHp(u.getHp() - downheal);
        System.out.println("디버프 : "+u.getName()+"의 체력이 "+downheal+"만큼 감소하였습니다.");
    }
}
