package com.skilldistillery.lordoftheobjects;

public abstract class PlayerCharacter extends GameCharacter {

    public PlayerCharacter(String name, int health) {
        super(name, health);
    }
public abstract void runAway();
public abstract void canDealDamageDecision();
public abstract void doDamage();

}