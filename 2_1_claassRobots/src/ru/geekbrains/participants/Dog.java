package ru.geekbrains.participants;

public class Dog extends Animals implements Swimabol {

    private int maxSwimDistance;

    public Dog(String name, String color) {
        super("Dog", name, color, 50,1000);
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

