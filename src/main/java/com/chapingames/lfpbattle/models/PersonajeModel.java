package com.chapingames.lfpbattle.models;

public class PersonajeModel {
    String name;
    int health;
    int attack;
    int defense;
    int initialLife= health*10;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        this.attack = attack;
    }
    public int getDefense() {
        return defense;
    }
    public void setDefense(int defense) {
        this.defense = defense;
    }
    public int getInitialLife() {
        return initialLife;
    }
}   
