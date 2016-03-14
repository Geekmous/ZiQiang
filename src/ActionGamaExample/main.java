package ActionGamaExample;

public class main {
    public static void main(String[] args) {
        Character player = new King();
        player.setWeapon(new BowAndArrowBehavior());
        player.fight();
    }
}
