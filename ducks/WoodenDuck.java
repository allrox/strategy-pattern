package ducks;

import behaviors.fly.CantFly;
import behaviors.quack.Mute;
import behaviors.swim.Floats;

public class WoodenDuck extends Duck {
    
    public WoodenDuck(){
        super(new CantFly(), new Mute(), new Floats());
    }

    @Override
    public void display() {
        System.out.println("I'm a wooden duck");
    }
    
}