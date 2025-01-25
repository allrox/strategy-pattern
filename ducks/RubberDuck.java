package ducks;

import behaviors.fly.CantFly;
import behaviors.quack.Mute;
import behaviors.swim.Floats;

public class RubberDuck extends Duck {
    
    public RubberDuck(){
        super(new CantFly(), new Mute(), new Floats());
    }
    
    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }

}
