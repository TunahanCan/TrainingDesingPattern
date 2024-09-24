package examples.BehavioralDesignPatterns.ChainOfResponsibility.MetalicCurrencyExample;

public class OnKurus extends MetallicCurrency{

    public OnKurus(){
        setValue(10);
    }

    @Override
    public String toString() {
        return "OnKurus{}";
    }


}
