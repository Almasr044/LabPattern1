package StrategyPatternLab;

public class NoFlying implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("No fly");
    }
}
