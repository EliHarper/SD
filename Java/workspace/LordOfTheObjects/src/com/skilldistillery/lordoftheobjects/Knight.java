package com.skilldistillery.lordoftheobjects;

public class Knight extends PlayerCharacter {
    private static int DAMAGE = 10;

    public Knight(String name, int health) {
        super(name, health);
    }

    public void runAway() {
        health -= 10;
        System.out.println("**coconuts clacking** I shall leave on my steed **coconuts clacking**");
    }

    public void canDealDamageDecision() {
        int compareValue = (int) (Math.random() * 20);
        if (compareValue >= DAMAGE) {
            doDamage();
        } else {
            runAway();
            health -= 5;
            System.out.println("Youve been struck. Your health is now at " + health + " healths.");
        }
    }

    public void doDamage() {
        System.out.println("I came here to kick ass and chew bubble gum...and I'm all outta gum.");
        System.out.println("You have been vanquished!");
    }
}