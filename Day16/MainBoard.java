package Day16;

public class MainBoard {
    public static void main(String[] args) {
        Player player = new Player();
        player.play(5);

        AdvancedLevel aLevel = new AdvancedLevel();
        player.upgradeLevel(aLevel);
        player.play(2);

        SuperLevel sLevel = new SuperLevel();
        player.upgradeLevel(sLevel);
        player.play(3);
    }
}
