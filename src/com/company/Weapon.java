package com.company;

public class Weapon {
private String weaponType;
private String nameWeapon;

    public Weapon(String weaponType, String nameWeapon) {
        this.weaponType = weaponType;
        this.nameWeapon = nameWeapon;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public String getNameWeapon() {
        return nameWeapon;
    }

    public void setNameWeapon(String nameWeapon) {
        this.nameWeapon = nameWeapon;
    }
}
