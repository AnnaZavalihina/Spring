package car;

import java.util.Random;

public class Auto {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed() {
        Random random = new Random();
        speed = random.nextInt(250)+50;
    }
}
