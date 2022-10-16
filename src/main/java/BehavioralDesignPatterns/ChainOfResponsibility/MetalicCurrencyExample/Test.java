package BehavioralDesignPatterns.ChainOfResponsibility.MetalicCurrencyExample;

public class Test {

    private static MetallicCurrency zincir = null;

    public static void main(String[] args) {
        zincir = (new BirLira()).setNext((
                new ElliKurus()).setNext((
                new OnKurus()).setNext(
                new BesKurus())));

        paraAt(new ElliKurus());
        paraAt(new OnKurus());
        paraAt(new OnKurus());
        paraAt(new OnKurus());
        paraAt(new OnKurus());
        paraAt(new BesKurus());
        paraAt(new BesKurus());
        paraAt(new BirLira());
        paraAt(new BirLira());
        paraAt(new BirLira());


        System.out.println("------------------------------");
        zincir.getMetalParaList().stream().forEach(itr -> System.out.println(itr));
    }

    public static void paraAt(MetallicCurrency para) {
        System.out.println(
                "+++ ------------------------ +++");
        System.out.println(
                "Otomata " + para.toString() + " atıldı.");
        zincir.check(para);
        System.out.println(
                "+++ ------------------------ +++\n");
    }

}
