package com.example.test1sp;

public class BattalionVisitor implements Visitor {
    @Override
    public void visit(Battalion battalion) {
        System.out.println("Visiting Battalion");
        battalion.attack();
        battalion.defend();
    }

    @Override
    public void visit(Creature creature) {
        System.out.println("Visiting Creature");
        creature.attack();
        creature.defend();
    }
}
