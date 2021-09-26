package StrategyPatternLab;

public class UpsideDownFlying implements IFlyBehavior{
    @Override
    public void fly() {
        System.out.println("No Fly");
    }
}
