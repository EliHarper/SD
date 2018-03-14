package com.skilldistillery.lordoftheobjects;

public class Mage extends PlayerCharacter {
    private static int DAMAGE = 7;

    public Mage(String name, int health) {
        super(name, health);
    }

    public void runAway() {
        health -= 10;
        System.out.println("*teleporting sounds* watch me fade to the ether *teleporting sounds*");
    }

    public void canDealDamageDecision() {
        int compareValue = (int) (Math.random() * 14);
        if (compareValue >= DAMAGE) {
            doDamage();
        } else {
            runAway();
            System.out.println("My revenge will be magical...");
            health -= 5;
            System.out.println("Youve been struck. Your health is now at " + health + " healths.");
        }
    }

    public void doDamage() {
        System.out.println("Da Mage does the DAMage");
    }
}