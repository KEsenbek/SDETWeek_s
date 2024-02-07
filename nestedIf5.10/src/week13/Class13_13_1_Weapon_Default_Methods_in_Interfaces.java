package week13;

public class Class13_13_1_Weapon_Default_Methods_in_Interfaces {
    public static void main(String[] args) {

        Weapon sword = new Weapon("Sword", 80);
        System.out.println("Weapon Type: " + sword.getWeaponType()); // Weapon Type: Sword
        System.out.println("Durability: " + sword.getDurability()); // Durability: 80

        sword.setWeaponType("Axe");
        sword.setDurability(150); // Setting durability above the maximum value
        System.out.println("Weapon Type: " + sword.getWeaponType()); // Weapon Type: Axe
        System.out.println("Durability: " + sword.getDurability()); // Durability: 100

        sword.setDurability(-20); // Setting durability below the minimum value
        System.out.println("Weapon Type: " + sword.getWeaponType()); // Weapon Type: Axe
        System.out.println("Durability: " + sword.getDurability()); // Durability: 100
        sword.setDurability(30); // Durability: 30
        System.out.println("Durability: " + sword.getDurability()); // Durability: 30

        sword.resetWeaponType();
        sword.repair();
        System.out.println("Weapon Type: " + sword.getWeaponType()); // Weapon Type: Default
        System.out.println("Durability: " + sword.getDurability()); // Durability: 100
    }
}

interface WeaponType{
    String getWeaponType();
    void setWeaponType(String weaponType);
    default void resetWeaponType() {
        setWeaponType("Default");
    }
}

interface Damageable{
    int getDurability();
    void setDurability(int durability);

    default void repair(){
        setDurability(100);
    }
}

class Weapon implements WeaponType,Damageable {
    String weaponType;
    int durability;

    public Weapon(String weaponType, int durability) {
        this.weaponType = weaponType;
        this.durability = durability;
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }

    @Override
    public void setWeaponType(String weaponType) {
        this.weaponType=weaponType;
    }

    @Override
    public void resetWeaponType() {
        WeaponType.super.resetWeaponType();
    }

    @Override
    public int getDurability() {
        if (this.durability<0 || this.durability>=100) {
            return 100;
        }else {
            return this.durability;
        }

    }

    @Override
    public void setDurability(int durability) {
        this.durability=durability;
    }

    @Override
    public void repair() {
        Damageable.super.repair();
    }
}