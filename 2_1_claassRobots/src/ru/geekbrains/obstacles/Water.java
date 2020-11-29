package ru.geekbrains.obstacles;

import ru.geekbrains.participants.Animals;
import ru.geekbrains.participants.Robots;
import ru.geekbrains.participants.Swimabol;

public class Water extends Obstacle {

    private int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void daIt(Robots r) {
        if (r instanceof Swimabol) {
            ((Swimabol) r).swim(length);
        }else {
            System.out.println(r.getColor() + " " + r.getType() + " " + r.getName() + " Can Swim.");
            r.setOnDistance(false);
        }
    }

    @Override
    public void doIt(Animals a) {
        if (a instanceof Swimabol) {
            ((Swimabol) a).swim(length);
        }else {
            System.out.println(a.getColor() + " " + a.getType() + " " + a.getName() + " Can Swim.");
            a.setOnDistance(false);
        }
    }
}
