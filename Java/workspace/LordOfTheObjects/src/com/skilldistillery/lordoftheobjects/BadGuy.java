package com.skilldistillery.lordoftheobjects;

public class BadGuy extends NPCharacter {

    public BadGuy(String name, int health) {
        super(name, health);
    }
    public void promptPlayer() {
        System.out.println("Hey, wanna fight? Y/N");
    }
    
    public void responseToPlayerYes() {
        System.out.println("En Garde **sword rasies**");
    }
    
    public void responseToPlayerNo() {
        System.out.println("Then I guess this is a beatdown.");
    }

}