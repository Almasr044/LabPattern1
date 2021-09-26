package StrategyPatternLab;

public class LoudQuack implements IQuackBehavior {
    public void quack() {
        System.out.println("LoudQuack");
    }
}