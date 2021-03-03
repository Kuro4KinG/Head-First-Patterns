
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quaqckBehavior;

    public Duck() {
        display();
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quaqckBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuaqckBehavior(QuackBehavior quaqckBehavior) {
        this.quaqckBehavior = quaqckBehavior;
    }
}
