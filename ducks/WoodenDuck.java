package ducks;

import behaviors.fly.DoesntFly;
import behaviors.quack.Mute;
import behaviors.swim.Float;

public class WoodenDuck extends Duck {
    
    public WoodenDuck(){
        super(new DoesntFly(), new Mute(), new Float());
    }

    @Override
    public void display() {
        System.out.println("I'm a wooden duck");
    }
    
}