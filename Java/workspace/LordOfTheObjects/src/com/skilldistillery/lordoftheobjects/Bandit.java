package com.skilldistillery.lordoftheobjects;

public class Bandit extends PlayerCharacter {
    private static int DAMAGE = 5;
    public Bandit(String name, int health) {
        super(name, health);
    }

    public void runAway() {
        health -= 10;
        System.out.println("OH SHOOT HES GOT A GUN!!!! **running towards the sunset**");    
    }
    public void canDealDamageDecision() {
        int compareValue = (int)(Math.random() * 10);
        if(compareValue >= DAMAGE) {
            doDamage();
        }else {
            runAway();
            System.out.println("I'LL GET YOU NEXT TIME!!");
            health -= 5;
            System.out.println("Youve been struck. Your health is now at " + health + " healths.");
        }
    }
    public void doDamage() {
        System.out.println("HA!! GOT'EM");
    }
}