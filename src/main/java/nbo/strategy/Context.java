package nbo.strategy;

public class Context {
    private IStrategy iStrategy = new IStrategyDefaultImpl();

    public void effectuerOperation(){
        System.out.println("******************");
        iStrategy.operationStrategy();
    }

    void setStrategy(IStrategy iStrategy){
        this.iStrategy = iStrategy;
    }

}
