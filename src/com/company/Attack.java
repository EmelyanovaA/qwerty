package com.company;

public class Attack {
    int damage;
    public Attack(int damage){
        this.damage = damage;
    }
    public void attack(Unit unit){
        int b = unit.currentHP - this.damage;
        System.out.println("b="+b);
    }
}
