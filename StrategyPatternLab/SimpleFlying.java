package StrategyPatternLab;

public class SimpleFlying implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("SimpleFly");
    }
}
