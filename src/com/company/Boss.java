package com.company;

public class Boss extends GameEntity {
    Weapon weapon;


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;

    }
    public String printInfo(){
        return  " ЗДОРОВЬЕ "+ getHealth() + " УРОН " + getDamage() + " защита " + weapon.getNameWeapon()+ " "  + weapon.getWeaponType();

    }



}
