package com.example.test1sp;

public interface Creature {
    void attack();
    void defend();
    void accept(Visitor visitor);
}
