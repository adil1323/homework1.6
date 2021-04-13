package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(15);
        boss.setWeapon(new Weapon(" cold ", " Hammer "));
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.weapon.getWeaponType() + boss.weapon.getNameWeapon());
        System.out.println(boss.printInfo());

        Skeleton sceleton = new Skeleton();
        sceleton.setHealth(50);
        sceleton.setDamage(20);
        sceleton.setWeapon(new Weapon(" rifle ", " bow "));
        System.out.println(sceleton.getHealth() + " " + sceleton.getDamage() + " " + sceleton.weapon.getWeaponType() + sceleton.weapon.getNameWeapon());

        Skeleton sceleton2 = new Skeleton();
        sceleton.setHealth(50);
        sceleton.setDamage(20);
        sceleton.setWeapon(new Weapon(" rifle ", " bow "));
        System.out.println(sceleton.getHealth() + " " + sceleton.getDamage() + " " + sceleton.weapon.getWeaponType() + sceleton.weapon.getNameWeapon());


    }
}
