package com.skilldistillery.lordoftheobjects;

import java.util.Scanner;

public class GameConsole {

    protected PlayerCharacter player1;
    protected NPCharacter[] npcArray;
    Scanner kb = new Scanner(System.in);

    public GameConsole() {
        
    }

    public void run() {
        npcArray = new NPCharacter[3];
        npcArray[0] = new GoodGuy("Good Guy Gary", 15);
        npcArray[1] = new BadGuy("Bad Guy Barry", 15);
        npcArray[2] = new BadGuy("Boss Man Bogart", 50);

        System.out.println("Welcome to your demise");
        System.out.println("**********************");
        System.out.println("  Drew D. and Eli H.  \n\n\n");

        System.out.println("Please choose a character type: Bandit, Mage, or Knight");
        String type = kb.next();
        System.out.println("Please enter your name: ");
        String name = kb.next();
        
        if (type.equalsIgnoreCase("bandit")) {
            player1 = new Bandit(name, 15);
        } else if (type.equalsIgnoreCase("mage")) {
            player1 = new Mage(name, 15);
        } else if (type.equalsIgnoreCase("knight")) {
            player1 = new Knight(name, 15);
        } else {
            System.err.println("You suck at rules go play outside.");
        }

        // game plays for the length of the for loop
        for (int i = 0; i < npcArray.length; i++) {
            System.out.println("...\n...\n...\n...");
            System.out.println("WHOA! You have encountered " + npcArray[i].name);
            npcArray[i].promptPlayer();
            String response = kb.next();
            if (response.equalsIgnoreCase("y")) {
                npcArray[i].responseToPlayerYes();
                if (i == 0) {
                    player1.health += 5;
                    System.out.println("You have five more healths.");
                    System.out.println("You now have " + player1.health + " healths.");
                } else {
                    player1.canDealDamageDecision();
                }
            } else {
                npcArray[i].responseToPlayerNo();
                if (i == 0) {
                    player1.health -= 7;
                    System.out.println("I have taken your healths...seven of them!");
                    System.out.println("You now have " + player1.health + " healths.");
                } else {
                    player1.canDealDamageDecision();
                    player1.health -= 5;
                    System.out.println("You got hit. You now have " + player1.health + " healths.");
                }
            }
        }
        // If player makes it through the rounds with health it is considered a win
        if (player1.health > 0) {
            System.out.println("You won this time. Here have a cookie ()");
        } else {
            System.out.println("You met your demise...mwaahahahahaha");
        }
    }
}