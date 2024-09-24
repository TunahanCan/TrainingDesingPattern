package examples.BehavioralDesignPatterns.ChainOfResponsibility.MetalicCurrencyExample;

public class ElliKurus extends MetallicCurrency{

    public ElliKurus(){
        setValue(50);
    }

    @Override
    public String toString() {
        return "ElliKurus{}";
    }

}
