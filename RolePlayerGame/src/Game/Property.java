package Game;

import java.util.Random;

/**
 * Created by Mustafa Sharif.
 */
public class Property {

    public static Random random = new Random();

    private    int health = random.nextInt();
    private    int damage;
    private    int numHealthPotions;
    private    int healthPotionHealAmmount;
    private    int healthPotionDropChance;

    //player constructor
    public Property(int health, int damage, int numHealthPotions, int healthPotionHealAmmount, int healthPotionDropChance) {
        this.health = health;
        this.damage = damage;
        this.numHealthPotions = numHealthPotions;
        this.healthPotionHealAmmount = healthPotionHealAmmount;
        this.healthPotionDropChance = healthPotionDropChance;
    }
    //Enemy constructor
    public Property(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getNumHealthPotions() {
        return numHealthPotions;
    }

    public void setNumHealthPotions(int numHealthPotions) {
        this.numHealthPotions = numHealthPotions;
    }

    public int getHealthPotionHealAmmount() {
        return healthPotionHealAmmount;
    }

    public void setHealthPotionHealAmmount(int healthPotionHealAmmount) {
        this.healthPotionHealAmmount = healthPotionHealAmmount;
    }

    public int getHealthPotionDropChance() {
        return healthPotionDropChance;
    }

    public void setHealthPotionDropChance(int healthPotionDropChance) {
        this.healthPotionDropChance = healthPotionDropChance;
    }
}
