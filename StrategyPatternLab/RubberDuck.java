package StrategyPatternLab;

public class RubberDuck extends Duck{
    public RubberDuck(){
        flyBehavior = new SimpleFlying();
        quackBehavior = new LoudQuack();
    }

    public void display(){
        System.out.println("I'm a rubber duck.");
    }
}

