package ru.geekbrains.obstacles;

import ru.geekbrains.participants.Animals;
import ru.geekbrains.participants.Robots;

public abstract class Obstacle {
    public abstract void doIt(Animals a);
    public abstract void daIt(Robots r);
}
