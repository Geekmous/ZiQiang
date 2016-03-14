package ActionGamaExample;

public abstract class Character {
    WeaponBehavior weaponBehavior = null;  
	
    public abstract void fight();
	
    public void setWeapon(WeaponBehavior w) {
        this.weaponBehavior	= w;
    }
}
