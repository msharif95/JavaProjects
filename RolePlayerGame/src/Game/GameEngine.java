package Game;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by Mustafa Sharif.
 */
public class GameEngine {
    private Hashtable<String, Room> roomHashtable;
    private Player player;
    private String aStartPosition;
    Scanner s = new Scanner(System.in);

    Enemy enemy = new Enemy(10,40);

    public GameEngine(Hashtable<String, Room> roomHashtable, String aStartPosition, Player p) {
        this.roomHashtable = roomHashtable;
        this.aStartPosition = aStartPosition;
        this.player = p;

    }

    public void run() {
        System.out.println("***************************************");
        System.out.println("*     Welcome to the RPG game        **");
        System.out.println("* *************************************");
        System.out.println(".......................................................................................");
        System.out.println("Enter 0 , 1 , 2 , 3 to move");
        player.printPosition();

        GAME:
        while(true) {
            System.out.println("your move ->");
            int input = s.nextInt();

            if(input == 1 || input == 2 || input == 3 || input == 4 ) {
                player.setCurrentRoom(player.getCurrentRoom().getExitRoom(input));
                s.nextLine();
                while (enemy.getHealth() > 0 && player.getHealth() > 0){
                    //System.out.println(enemy.getEnemy() + " Has appeared");

                    System.out.println("\tYour Health Status is " + player.getHealth());
                    System.out.println("\tEnemy's Health Status is " + enemy.getHealth());
                    System.out.println("What actions would you undertake?");
                    System.out.println("\t<attack>: Attack the enemy with a weapon");
                    System.out.println("\t<drink>: Drink a Health Potion");
                    System.out.println("your move ->");

                    String userInput = s.nextLine().toLowerCase();

                    switch (userInput){
                        case "attack":
                            //attack method
                            enemy.attack(player);
                            break;
                        case "drink":
                            //increasing health potion method
                            enemy.increaseHealthPotion(player);;
                            continue;
                        default:
                            // when the user enters the wrong commands
                            System.out.println("\tYou have typed invalid command. Try again!");
                            break;
                    }


                }
                if(player.getHealth() < 1){
                    System.out.println("You have gone out of the adventure, beaten in the battle");
                    break;
                }
                System.out.println("......................................................................................");
                System.out.println(enemy.getEnemy() + " was defeated!");
                System.out.println("\tYou have " + player.getHealth() + " HP left");
                if(enemy.random.nextInt(100) < player.getHealthPotionDropChance()){
                    int nhp = player.getNumHealthPotions();
                    nhp++;
                    System.out.println("The " + enemy.getEnemy() + "\thas dropped a health potion");
                    System.out.println("\tYou now have " + player.getHealth() + " health potion");
                }
                System.out.println("......................................................................................");
                System.out.println("What would you like to do now?");
                System.out.println("\t<A> Continue the adventure");
                System.out.println("\t<B>: Exit the Game");
                s.nextLine();
                String newGameInput = s.nextLine().toLowerCase();
                while(!newGameInput.equals("a") && !newGameInput.equals("b")){
                    System.out.println("\tYou have typed invalid command. Try again!");
//                    newGameInput = s.nextLine();
                }

                if(newGameInput.equals("a")){
                    System.out.println("You can continue on your adventure");
                    continue GAME;

                }else if(newGameInput.equals("b")){
                    System.out.println("You have exited the Game!");
                    break;

                }

            }else {
                System.out.println("Wrong commands. Try again");
            }

        }

        System.out.println("*************************************************");
        System.out.println("*** THANK YOU FOR PLAYING THE ROLE PLAYER GAME **");
        System.out.println("*************************************************");
    }
}
