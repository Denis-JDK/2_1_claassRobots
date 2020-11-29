package ru.geekbrains.participants;

public class Cat extends Animals implements Swimabol {

    private int maxSwimDistance;

    public Cat(String name, String color) {
        super("Dog", name, color, 100,500);
        maxSwimDistance = TYPICAL_SWIM_DISTANCE;
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

