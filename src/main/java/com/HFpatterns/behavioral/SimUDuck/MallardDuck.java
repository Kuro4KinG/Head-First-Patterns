

public class MallardDuck extends Duck {
    public MallardDuck() {
        quaqckBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard duck");
    }
}
