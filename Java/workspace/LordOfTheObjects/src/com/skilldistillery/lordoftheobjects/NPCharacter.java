package com.skilldistillery.lordoftheobjects;

public abstract class NPCharacter extends GameCharacter {

    public NPCharacter(String name, int health) {
        super(name, health);
    }
    public abstract void promptPlayer();
    
    public abstract void responseToPlayerYes();
    public abstract void responseToPlayerNo();

}