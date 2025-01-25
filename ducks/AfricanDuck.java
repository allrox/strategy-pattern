package ducks;

import behaviors.fly.*;
import behaviors.quack.*;
import behaviors.swim.*;

public class AfricanDuck extends Duck {

    public AfricanDuck(){
        super(new Fly(), new Quack(), new Swim());
    }

    @Override
    public void display() {
        System.out.println("I'm an African duck");
    }

    
}