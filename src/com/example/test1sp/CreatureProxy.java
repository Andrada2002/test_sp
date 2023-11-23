package com.example.test1sp;

public class CreatureProxy implements Creature {
    private Creature realCreature;

    public CreatureProxy(Creature realCreature) {
        this.realCreature = realCreature;
    }

    @Override
    public void attack() {
        System.out.println("Preparing for attack...");
        realCreature.attack();
        System.out.println("Attack completed!");
    }

    @Override
    public void defend() {
        System.out.println("Preparing for defense...");
        realCreature.defend();
        System.out.println("Defense completed!");
    }

    @Override
    public void accept(Visitor visitor) {

    }
}
