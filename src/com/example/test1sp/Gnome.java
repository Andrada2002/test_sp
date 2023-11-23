package com.example.test1sp;

public class Gnome implements Creature {
    // ... (restul codului rămâne neschimbat)

    @Override
    public void attack() {

    }

    @Override
    public void defend() {

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
