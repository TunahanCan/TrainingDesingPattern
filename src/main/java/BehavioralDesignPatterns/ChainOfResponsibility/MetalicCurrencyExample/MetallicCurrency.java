package BehavioralDesignPatterns.ChainOfResponsibility.MetalicCurrencyExample;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public abstract class MetallicCurrency {

    /**
     * Otomata atılan paraların tutulduğu liste
     */
    private ArrayList<MetallicCurrency> metalParaList = new ArrayList<>();

    /**
     * Metal paranın sahip olduğu değer. 5, 10, 50,
     * 100 Kurus olabilir
     */
    private int value;

    private MetallicCurrency nextReference;

    public MetallicCurrency getNext() {
        return nextReference;
    }

    public MetallicCurrency setNext(MetallicCurrency next) {
        this.nextReference = next;
        return this;
    }

    public void check(MetallicCurrency para) {
        System.out.println("Sıradaki nesne sadece " + this + " işleyebilir.");
        if (para.getValue() != this.value) {
            System.out.println("Uymadı, zincirdeki "
                    + "bir " + "sonraki nesneye iletiyoruz.");
            if (getNext() != null) {
                getNext().check(para);
            } else {
                System.out.println("Zincirin sonundayız. "
                        + "" + "Metal para " + para.toString() + " "
                        + "bu otomat için uygun değil.");
            }
        } else {
            metalParaList.add(para);
            System.out.println("Otomat tarafından " + this.toString() + " kabul edildi");
        }
    }
}
