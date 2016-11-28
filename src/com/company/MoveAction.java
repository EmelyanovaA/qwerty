package com.company;


    public class MoveAction implements Action{

        private Unit u;

        public MoveAction(Unit u, int x, int y) {
            this.u = u;
        }

        @Override
        public void tick() {
            int speed = u.getSpeed();
            int current_x = u.getX();
            int current_y = u.getY();
        }
        public boolean isDone() {
            if (x == u.getX() && y == u.getY())
                return true;
            return false;
        }
    }

