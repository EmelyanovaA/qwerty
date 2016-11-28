package com.company;
import java.util.List;

public class Unit {
    int currentHP;
    private List<Action> actionList;
    private Action action;

    public void move(int x, int y){
        actionList.add(new MoveAction(this, x, y));
    }

    public void tick(int x, int y) {
        if (actionList.isEmpty())
            return;
        action = actionList.get(0);

        action.tick();

        if (action.isDone()) {
            actionList.remove(0);
        }
    }

    public int getSpeed() {
        return 3;
    }

    public int getX(int x) {
        return x;
    }

    public int getY(int y) {
        return y;
    }
}

