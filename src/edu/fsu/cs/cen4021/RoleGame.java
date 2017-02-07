package edu.fsu.cs.cen4021;

import edu.fsu.cs.cen4021.armory.Weapon;
import edu.fsu.cs.cen4021.armory.WeaponFactory;

/**
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        Weapon sword = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 20;
        System.out.println("Swords was able to do " + sword.hit(armor) + " of damage due to an armor with " + armor + " points.");

        Weapon simpleArrow = WeaponFactory.getWeapon("simpleArrow");
        System.out.println("SimpleArrow has " + simpleArrow.hit() + " of damage.");
        System.out.println("SimpleArrow was able to do " + simpleArrow.hit(armor) + " of damage due to an armor with " + armor + " points.");

        Weapon simpleAxe = WeaponFactory.getWeapon("simpleAxe");
        System.out.println("SimpleAxe has " + simpleAxe.hit() + " of damage.");
        System.out.println("SimpleAxe was able to do " + simpleAxe.hit(armor) + " of damage due to an armor with " + armor + " points.");

        Weapon simpleMagicStaff = WeaponFactory.getWeapon("simpleMagicStaff");
        System.out.println("SimpleMagicStaff has " + simpleMagicStaff.hit() + " of damage.");
        System.out.println("SimpleMagicStaff was able to do " + simpleMagicStaff.hit(armor) + " of damage due to an armor with " + armor + " points.");

        Weapon theChosenOneAxe = WeaponFactory.getWeapon("TheChosenOneAxe");
        System.out.println("TheChosenOneAxe has " + theChosenOneAxe.hit() + " of damage.");
        System.out.println("TheChosenOneAxe was able to do " + theChosenOneAxe.hit(armor) + " of damage due to an armor with " + armor + " points.");

        Weapon ancientMagicStaff = WeaponFactory.getWeapon("AncientMagicStaff");
        System.out.println("AncientMagicStaff has " + ancientMagicStaff.hit() + " of damage.");
        System.out.println("AncientMagicStaff was able to do " + ancientMagicStaff.hit(armor) + " of damage due to an armor with " + armor + " points.");

        //TODO: Add the remaining weapons here

    }
}
