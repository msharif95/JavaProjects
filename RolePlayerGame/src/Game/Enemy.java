package Game;

/**
 * Created by Mustafa Sharif.
 */
public class Enemy extends Property{
    //class objects


    //enemy fields
    private  String[] enemies = {"Bear","Zombie", "Wolf", "Dragon", "Anaconda", "Assasin", "Serial killer"};
    String enemy = enemies[random.nextInt(enemies.length)];

    //int enemyHealth = random.nextInt(this.getHealth());

    public Enemy(int health, int damage) {
        super(health, damage);
    }

    public void attack(Player player){

        // when the user wants to fight with the enemy
        int damageDealt = random.nextInt(player.getDamage());
        int damageTaken = random.nextInt(this.getDamage());

        this.setHealth(getHealth() - damageDealt);
        player.setHealth(player.getHealth()- damageTaken);

        System.out.println("\tYou have attacked " + enemy + "\tfor " + damageDealt  +"\tdamage" );
        System.out.println("\tYou have recieved " + damageTaken  +"\tdamage from the enemy" );

        if(player.getHealth() < 1){
            System.out.println("\tYou have taken too much damage, you can not carry on!");
        }
    }

    public void increaseHealthPotion(Player player){
        // if the user chooses to drink health potion
        if(player.getNumHealthPotions() > 0){

            player.setHealth(getHealth() + getHealthPotionHealAmmount());
            player.setNumHealthPotions(player.getNumHealthPotions()-1);

            System.out.println("\tYou drink a health potion, healing yourself for " + player.getHealthPotionHealAmmount()+"."
                    +"\n\tYou now have " + player.getHealth() + "\tHP"
                    + "\n\tYou have " + player.getNumHealthPotions() + "\t health Potion left");
        }else{
            System.out.println("You have no HP left, defeat the enemy to get more!");
        }
    }

    public String getEnemy() {
        return enemy;
    }

}
