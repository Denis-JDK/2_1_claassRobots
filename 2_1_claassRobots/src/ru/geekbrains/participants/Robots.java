package ru.geekbrains.participants;

    public abstract class Robots {

        protected String type;
        protected int id;
        protected String color;


        protected int maxRunDistance;
        protected int maxJumpHeight;

    protected boolean onDistance;

    public Robots(String type,int id, String color, int maxJumpHeight, int maxRunDistance) {
        this.type = type;
        this.id = id;
        this.color = color;
        this.maxJumpHeight = maxJumpHeight;
        this.maxRunDistance = maxRunDistance;
        this.onDistance = true;
    } public int getName() {
        return id;
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
    public String getType() {
            return type;
        }

    public boolean isOnDistance() {
        return onDistance;
    }

    public void setOnDistance(boolean onDistance) {
        this.onDistance = onDistance;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(color + " " + type + " " + id + " Run OK.");
        } else {            System.out.println(color + " " + type + " " + id + " Run Failed.");
            onDistance = false;
        }
    }

    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(color + " " + type + " " + id + " Jump OK.");
        } else {
            System.out.println(color + " " + type + " " + id + " Jump Failed.");

            onDistance = false;
        }
    }

    public void info () {
        System.out.println(color + " " + type + " " + id + ": " + onDistance);
    }
}