package ActionGamaExample;

public class main {
	//this is a demo to test
	//ok,the name of this class I created is an unconscious mistake....
	public static void main(String[] args) {
		Character player = new King();
		player.setWeapon(new BowAndArrowBehavior());
		player.fight();
	}
}
