package nbo.strategy;

public class IStrategyDefaultImpl implements IStrategy {
    @Override
    public void operationStrategy() {
        System.out.println("----------------------------------------------");
        System.out.println("------------ Strategy Default ----------------");
        System.out.println("----------------------------------------------");
    }
}
