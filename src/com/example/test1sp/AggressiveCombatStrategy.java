package com.example.test1sp;

public class AggressiveCombatStrategy implements CombatStrategy {
    @Override
    public void executeAttack() {
        System.out.println("Aggressive Attack!");
    }

    @Override
    public void executeDefend() {
        System.out.println("Aggressive Defense!");
    }
}
