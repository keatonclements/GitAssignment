package edu.fsu.cs.cen4021.armory;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import java.io.IOException;

/**
 * Created by kclem_000 on 2/7/2017.
 */
class WebRitualArrow extends BasicWeapon implements Weapon {

    WebRitualArrow() {super(0);}

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor){
        int damage = 0;
        if(armor >= 10)
            armor = armor - 10;
        else
            armor = 0;

        try {
            Document doc = Jsoup.connect("http://ww2.cs.fsu.edu/~escobara/courses/cen4021.html").get();
            Elements text = doc.select("h1");
            Element num = text.first();
            damage = Integer.parseInt(num.text());
        }catch(IOException e){
            System.out.println("Could not connect to url");
        }

        damage = damage - armor;

        return damage;
    }
}
