package edu.fsu.cs.cen4021.armory;

/**
 * Created by kclem_000 on 2/6/2017.
 */
class SimpleArrow extends BasicWeapon implements Weapon {

    SimpleArrow() { super(70); }

    @Override
    public int hit() {return DAMAGE;}

    @Override
    public int hit(int armor){
        int damage;
        int rarmor;
        if(armor >= 5)
            rarmor = armor - 5;
        else
            rarmor = 0;

        damage = DAMAGE - rarmor;

        if(damage < 0)
            return 0;

        return damage;
    }
}
