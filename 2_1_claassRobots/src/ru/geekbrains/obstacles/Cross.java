package ru.geekbrains.obstacles;

import ru.geekbrains.participants.Animals;
import ru.geekbrains.participants.Robots;

        public class Cross extends Obstacle {

            private int length;

            @Override
            public void daIt(Robots r) {
                r.run(length);
            }

            public Cross(int length) {
                this.length = length;
            }

            @Override
            public void doIt(Animals a) {
                a.run(length);
    }
}
