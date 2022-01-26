package car;

import org.springframework.beans.factory.annotation.Autowired;

public class Driver {
    @Autowired
    private Auto car;
    public void push(){
        car.setSpeed();
        System.out.println("speed of car is "+ car.getSpeed());
    }
}
