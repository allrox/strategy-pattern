package ducks;

import behaviors.fly.FlyBehavior;
import behaviors.quack.QuackBehavior;
import behaviors.swim.SwimBehavior;

public abstract class Duck {
    
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    protected SwimBehavior swimBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior, SwimBehavior swimBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.swimBehavior = swimBehavior;
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performSwim(){
        swimBehavior.swim();
    }

    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    public void setSwimBehavior(SwimBehavior swimBehavior){
        this.swimBehavior = swimBehavior;
    }

}
