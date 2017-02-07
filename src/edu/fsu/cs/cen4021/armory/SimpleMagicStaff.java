package edu.fsu.cs.cen4021.armory;

import sun.java2d.pipe.SpanShapeRenderer;

/**
 * Created by kclem_000 on 2/6/2017.
 */
class SimpleMagicStaff extends BasicWeapon implements Weapon {

    SimpleMagicStaff() {super(80);}

    @Override
    public int hit() {return DAMAGE;}

    @Override
    public int hit(int armor) {
        double dmg = DAMAGE - (armor*0.8);

        int damage = (int)dmg;

        if(damage < 0)
            return 0;

        return damage;
    }
}
