package edu.fsu.cs.cen4021.armory;

/**
 * @author Javier
 */
class Sword extends BasicWeapon implements Weapon {

    Sword() { super(50); }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        int damage = DAMAGE - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }

}
