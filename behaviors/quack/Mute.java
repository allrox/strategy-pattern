package behaviors.quack;

public class Mute implements QuackBehavior{
    @Override
    public void quack(){
        System.out.println("I don't make any sound!");
    }
    
}
