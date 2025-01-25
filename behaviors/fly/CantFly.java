package behaviors.fly;

public class CantFly implements FlyBehavior{
    @Override
    public void fly(){
        System.out.println("I can't fly!");
    }
}
