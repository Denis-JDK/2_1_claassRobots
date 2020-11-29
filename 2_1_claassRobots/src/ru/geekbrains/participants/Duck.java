package ru.geekbrains.participants;

public class Duck extends Animals implements Swimabol {

    private int maxSwimDistance;

    public Duck(String name, String color) {
        super("Duck", name, color, 10,100);
        maxSwimDistance = TYPICAL_SWIM_DISTANCE * 10;
    }

    @Override
    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(color + " " + type + " " + name + " Swim OK.");
        } else {
            System.out.println(color + " " + type + " " + name + " Swim Failed.");
            onDistance = false;
        }
        }

    }

