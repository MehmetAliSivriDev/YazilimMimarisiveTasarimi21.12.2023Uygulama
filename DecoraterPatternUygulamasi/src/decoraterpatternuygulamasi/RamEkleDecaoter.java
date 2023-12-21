package decoraterpatternuygulamasi;

public class RamEkleDecaoter extends BilgisayarDecorator{
    
    private int ramBoyutu;

    public RamEkleDecaoter(Bilgisayar bilgisayar,int ramBoyutu) {
        super(bilgisayar);
        this.ramBoyutu = ramBoyutu;
    }

    @Override
    public double fiyat() {
        if(ramBoyutu == 8)
        {
            return super.fiyat() + 2500;
        }
        else if (ramBoyutu == 16){
            return super.fiyat() + 4500;
        }
        else{
            return super.fiyat();
        }
    }

    @Override
    public String aciklama() {
        
        return super.aciklama()+ this.ramBoyutu +" Gb Ram eklendi ";
    }
}
