package com.example.test1sp;

public class Test1SpApplication {
        public static void main(String[] args) {
            Creature gnome = new Gnome();
            Creature elf = new Elf();
            Creature ent = new Ent();

            Battalion battalion1 = new Battalion();
            battalion1.addCreature(gnome);
            battalion1.addCreature(elf);

            Battalion battalion2 = new Battalion();
            battalion2.addCreature(gnome);
            battalion2.addCreature(ent);

            Visitor visitor = new BattalionVisitor();

            System.out.println("Visiting Battalion 1:");
            battalion1.accept(visitor);

            System.out.println("\nVisiting Battalion 2:");
            battalion2.accept(visitor);
        }
    }