package behaviors.swim;

public class Sink implements SwimBehavior{
    @Override
    public void swim(){
        System.out.println("I can't swim. I sink!");
    }
    
}
