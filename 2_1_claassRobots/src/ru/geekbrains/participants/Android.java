package ru.geekbrains.participants;

public class Android extends Robots implements Swimabol {

    private int maxSwimDistance;

    public Android(int id, String color) {
        super("T1000", id, color, 1150,10000);
        maxSwimDistance = TYPICAL_SWIM_DISTANCE*5;
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(color + " " + type + " " + id + " Swim OK.");
        } else {
            System.out.println(color + " " + type + " " + id + " Swim Failed.");
            onDistance = false;
        }
        }

    }

