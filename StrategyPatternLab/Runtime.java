package StrategyPatternLab;

public class Runtime {
    public static void main(String[] args) {
        //CityDuck
        Duck cityDuck = new CityDuck();
        cityDuck.performQuack();
        cityDuck.performFly();
        cityDuck.display();


        //RubberDuck
        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.setFlyBehavior(new UpsideDownFlying());
        rubberDuck.performFly();
        rubberDuck.display();
    }
}

