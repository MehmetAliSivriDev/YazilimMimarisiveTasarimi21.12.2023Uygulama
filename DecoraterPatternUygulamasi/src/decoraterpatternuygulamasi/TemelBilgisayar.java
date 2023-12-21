package decoraterpatternuygulamasi;


//temel bileşen sınıfı

public class TemelBilgisayar implements Bilgisayar{


    @Override
    public double fiyat() {
        return 25000.00; //bilgisayarafiyatı
    }

    @Override
    public String aciklama() {
        return "Temel Bilgisayar ";
    }

}
