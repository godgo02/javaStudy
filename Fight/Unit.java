package Fight;

public class Unit {
    private String name;
    private int attack;
    private int hp;
    private int MaxHP;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getMaxHP() {
        return MaxHP;
    }
    public void setMaxHP(int maxHP) {
        MaxHP = maxHP;
    }
}
