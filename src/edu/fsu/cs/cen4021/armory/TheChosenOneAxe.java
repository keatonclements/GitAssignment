package edu.fsu.cs.cen4021.armory;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Created by kclem_000 on 2/6/2017.
 */
class TheChosenOneAxe extends BasicWeapon implements Weapon {

    TheChosenOneAxe() {super(0);}

    @Override
    public int hit() {
        int damage = DAMAGE;
        try{
            damage = dmg();
        }catch (FileNotFoundException e){
            System.out.println("Could not open file thechosenone.txt");
        }
        return damage;
    }

    @Override
    public int hit(int armor){

        int damage = DAMAGE;
        try{
            damage = dmg();
        }catch (FileNotFoundException e){
            System.out.println("Could not open file thechosenone.txt");
        }
        if(armor > 0 && armor < 20)
            armor = 0;
        damage = damage - armor;


        return damage;
    }

    private int dmg() throws FileNotFoundException{
        String a;
        int counter = 1;        //Starts on Line 1
        Scanner input = new Scanner(new File ("conf/thechosenone.txt"));
        a = input.nextLine();
        while(input.nextLine().equals(a)){
            ++counter;
        }
        if(counter != 1)            //accounts for if the first line contains b
            counter++;

        return counter;
    }
}
