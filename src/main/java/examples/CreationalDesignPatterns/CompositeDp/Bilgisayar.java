package examples.CreationalDesignPatterns.CompositeDp;

import lombok.Data;

import java.util.ArrayList;


@Data
public class Bilgisayar implements Parca {

    /*
     * Bilgisayar çeşitli parcalardan oluşur. Bu parcalar parcaListem içinde yer
     * alır. ArrayList içinde sadece Parca tipi nesneler yer alabilir.
     */
    private ArrayList<Parca> parcaListem = new ArrayList<Parca>();


    /**
     * Bilgisayarın parcalarını oluşturmak için kullanılan metot.
     */
    public void parcaEkle(final Parca parca) {
        getParcaListem().add(parca);
    }

    /**
     * Bilgisayar parcalarından herhangi birisini silmek için kullanılan metot.
     */
    public void parcaSil(final Parca parca) {
        if (getParcaListem().contains(parca)) {
            getParcaListem().remove(parca);
        }
    }


    /**
     * Sıra numarası belli bir bilgisayar parcasını edinmek için kullanılan
     * metot.
     */
    public Parca parcaVer(final int index) throws Exception {
        Parca parca = null;
        try {
            parca = getParcaListem().get(index);
        } catch (final Exception e) {
            throw new Exception(index + " nolu parca bulunamadı");
        }
        return parca;
    }

    /**
     * Bilgisayar Parca interface sınıfını implemente ettiği için fiyatiNedir()
     * metodunu sunmak zorundadır. Bu metot içinde bilgisayarı oluşturan tüm
     * parçaların fiyatları toplanarak, bilgisayarın fiyatı edinilir.
     */
    @Override
    public int fiyatiNedir() {
        int fiyat = 0;
        for (int i = 0; i < getParcaListem().size(); i++) {
            fiyat += getParcaListem().get(i).fiyatiNedir();
        }
        return fiyat;
    }

    public void printStackParcaInformation(){
        parcaListem.stream().forEach(itr -> System.out.println(itr.toString()  + " -  "+ itr.fiyatiNedir()));
    }
}
