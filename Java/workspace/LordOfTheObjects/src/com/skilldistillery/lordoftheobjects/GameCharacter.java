package com.skilldistillery.lordoftheobjects;

public abstract class GameCharacter {
    protected String name;
    protected int health;
    public GameCharacter(String name, int health) {
        super();
        this.name = name;
        this.health = health;
    }
    
}