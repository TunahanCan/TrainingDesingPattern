package examples.BehavioralDesignPatterns.ChainOfResponsibility.MetalicCurrencyExample;

public class YirmiBesKurus extends MetallicCurrency {

    public YirmiBesKurus(){
        setValue(25);
    }

    @Override
    public String toString() {
        return "YirmiBesKurus{}";
    }
}
