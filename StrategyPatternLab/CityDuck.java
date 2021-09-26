package StrategyPatternLab;

public class CityDuck extends Duck {
    public CityDuck(){
        flyBehavior = new NoFlying();
        quackBehavior = new Squeak();
    }

    public void display(){
        System.out.println("I'm a city duck duck.");
    }
}