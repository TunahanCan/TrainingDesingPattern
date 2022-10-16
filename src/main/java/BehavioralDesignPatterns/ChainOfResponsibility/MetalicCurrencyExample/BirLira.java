package BehavioralDesignPatterns.ChainOfResponsibility.MetalicCurrencyExample;

public class BirLira extends MetallicCurrency {
    public BirLira(){
        setValue(100);
    }

    @Override
    public String toString() {
        return  "bir lira";
    }
}
