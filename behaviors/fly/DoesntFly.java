package behaviors.fly;

public class DoesntFly implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("I can't fly!");
    }
}
