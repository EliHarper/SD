package com.skilldistillery.lordoftheobjects;

public class GoodGuy extends NPCharacter {

    public GoodGuy(String name, int health) {
        super(name, health);
    }
    
    public void promptPlayer() {
        System.out.println("Do you want some health? I'm a good guy! Come to my van I have health in my van...lots of healthy health.\nY/N");
    }
    
    public void responseToPlayerYes() {
        System.out.println("Here is some of that fantastic health I mentioned.");
    }
    
    public void responseToPlayerNo() {
        System.out.println("I guess you don't like free health...pffff....jeez...gosh");
    }
}