package com.example.test1sp;

class Ent implements Creature {
    @Override
    public void attack() {
        System.out.println("Ent attacks with immense strength and tree branches!");
    }

    @Override
    public void defend() {
        System.out.println("Ent defends by rooting and hardening its bark!");
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
