package com.example.test1sp;

class Elf implements Creature {
    @Override
    public void attack() {
        System.out.println("Elf attacks with bow and arrow!");
    }

    @Override
    public void defend() {
        System.out.println("Elf defends with agility and magic!");
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

