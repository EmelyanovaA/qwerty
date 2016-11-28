package com.company;

public class Archer extends Unit implements Movable, Fighter{


    public void create() {

    }

    @Override
    public void moveTo() {

    }

    public void fight(Unit unit){
        Attack a = new Attack(30);
        a.attack(unit);
    }
}
