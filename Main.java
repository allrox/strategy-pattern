import behaviors.swim.*;
import ducks.*;


public class Main {
    public static void main(String[] args) {
        
        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.performSwim();

        System.out.println("\n");
        
        Duck woodenDuck = new WoodenDuck();
        woodenDuck.display();
        woodenDuck.performFly();
        woodenDuck.performQuack();
        woodenDuck.performSwim();

        System.out.println("\nNow, let's modify wooden duck's behavior...");
        woodenDuck.setSwimBehavior(new Sink());

        woodenDuck.display();
        woodenDuck.performSwim();
                
    }
    
}
