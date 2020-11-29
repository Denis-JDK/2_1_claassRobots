package ru.geekbrains.obstacles;

import ru.geekbrains.participants.Animals;
import ru.geekbrains.participants.Robots;

public class Wall extends Obstacle {

    private int height;

    public Wall(int length) {
        this.height = height;
    }

    @Override
    public void daIt(Robots r) {
        r.jump(height);
    }

    @Override
    public void doIt(Animals a) {
    a.jump(height);
    }
}
