package com.company;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Archer archer = new Archer();
        Swordman Swordman = new Swordman();
        Swordman.fight(archer);
        ArrayList<Archer> arrayList = new ArrayList<Archer>();
        arrayList.add(archer);
        Archer archer1 = new Archer();
        arrayList.add(archer1);
        Archer archer2 = new Archer();
        arrayList.add(archer2);
        Archer archer3 = new Archer();
        arrayList.add(archer3);
        Archer archer4 = new Archer();
        arrayList.add(archer4);
        Archer archer5 = new Archer();
        arrayList.add(archer5);
        for (Archer c : arrayList) {
            System.out.println(c);
        }
        Swordman.move(x, y);
        Archer.move(x, y);
        for (int i = 0; i < 100; i++) {
            Swordman.tick();
            Archer.tick();
        }
    }
}