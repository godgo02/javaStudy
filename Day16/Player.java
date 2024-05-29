package Day16;

public class Player {
    private PlayerLevel level;

    public Player(){
        level = new BeginnerLevel();
        level.showLevleMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }
    public void upgradeLevel(PlayerLevel level){
        this.level = level;
        level.showLevleMessage();
    }
    public void play(int count){
        level.go(count);
    }
}
