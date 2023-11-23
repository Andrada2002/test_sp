package com.example.test1sp;

public class DefensiveCombatStrategy implements CombatStrategy {
    @Override
    public void executeAttack() {
        System.out.println("Defensive Attack!");
    }

    @Override
    public void executeDefend() {
        System.out.println("Defensive Defense!");
    }
}
