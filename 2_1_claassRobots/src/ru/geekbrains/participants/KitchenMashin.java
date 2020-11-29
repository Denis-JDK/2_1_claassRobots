package ru.geekbrains.participants;

public class KitchenMashin extends Robots implements Swimabol{

    private int maxSwimDistance;

    public KitchenMashin(int id, String color) {
        super("Siemens", id, color, 0,0);
        maxSwimDistance = 0;
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

