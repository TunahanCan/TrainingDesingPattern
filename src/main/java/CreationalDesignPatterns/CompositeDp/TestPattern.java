package CreationalDesignPatterns.CompositeDp;

public class TestPattern {

    public static void main(String[] args) {

        Parca klavye = new Klavye();
        Parca birGbRam = new Ram();
        Parca mouse = new Mouse();
        Parca monitor = new Monitor();
        Parca islemci = new Islemci();
        Parca kasa = new Kasa();
        Parca grafikKarti = new GrafikKarti();

        Bilgisayar myPc = new Bilgisayar();
        myPc.parcaEkle(klavye);
        myPc.parcaEkle(birGbRam);
        myPc.parcaEkle(mouse);
        myPc.parcaEkle(monitor);
        myPc.parcaEkle(islemci);
        myPc.parcaEkle(kasa);
        myPc.parcaEkle(grafikKarti);

        System.out.println( myPc.fiyatiNedir() );
        myPc.printStackParcaInformation();
    }
}
