package ru.geekbrains.participants;

public abstract class Animals {

    protected String type;
    protected String name;
    protected String color;


    protected int maxRunDistance;
    protected int maxJumpHeight;

    protected boolean onDistance;
    public Animals (String type, String name, String color, int maxJumpHeight, int maxRunDistance) {
         this.type = type;
        this.name = name;
        this.color = color;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
        this.onDistance = true;
}

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public boolean isOnDistance() {
        return onDistance;
    }

    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(color + " " + type + " " + name + " Run OK.");
        } else {            System.out.println(color + " " + type + " " + name + " Run Failed.");
            onDistance = false;
        }
    }

    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(color + " " + type + " " + name + " Jump OK.");
        } else {
            System.out.println(color + " " + type + " " + name + " Jump Failed.");

            onDistance = false;
        }
    }

    public void info () {
        System.out.println(color + " " + type + " " + name + ": " + onDistance);
    }
}
