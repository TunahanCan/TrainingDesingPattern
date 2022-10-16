package BehavioralDesignPatterns.ChainOfResponsibility.MetalicCurrencyExample;

public class BesKurus extends MetallicCurrency{

    public BesKurus(){
        setValue(5);
    }
    @Override
    public String toString() {
        return "BesKurus{}";
    }
}
