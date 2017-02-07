package edu.fsu.cs.cen4021.armory;
import java.io.*;
import java.util.*;

/**
 * Created by kclem_000 on 2/7/2017.
 */
class AncientMagicStaff extends BasicWeapon implements Weapon {

    AncientMagicStaff() {super(0);}

    public int hit() {
        int damage = read();
        return damage;
    }

    public int hit(int armor) {
        int damage = read();
        double dmg = damage - (armor*0.75);     //ignores 25% of armor
        damage = (int)dmg;

        return DAMAGE;
    }

    private int read() {
        int total = 0;
        FileInputStream f = null;
        ObjectInputStream o = null;
        List<Integer> result;

        try {
            f = new FileInputStream("conf/ancientstaff.obj");
            o = new ObjectInputStream(f);
            result = (List<Integer>) o.readObject();
            List<Integer> r = new ArrayList<Integer>();


            for(int i = 0; i < result.size(); i++){
                int j = (result.get(i))*(result.get(i));
                r.add(j);
            }                              //double all elements
            r.remove(1);            //remove 2nd element
            r.remove(4);            //remove 5th element
            List<Integer> s = new ArrayList<Integer>();
            for(int i = 0; i < r.size(); i++){
                int k = r.size();
                s.add(r.get(k));
                k--;
            }

            total = s.get(0) + s.get(2) + s.get(6);

        } catch (Exception ex) {
            System.out.println("Could not read ancientstaff.obj");
        }

        return total;
    }

}
