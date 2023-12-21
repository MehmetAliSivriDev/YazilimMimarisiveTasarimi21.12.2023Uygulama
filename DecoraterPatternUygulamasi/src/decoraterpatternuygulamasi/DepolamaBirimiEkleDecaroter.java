package decoraterpatternuygulamasi;


public class DepolamaBirimiEkleDecaroter extends BilgisayarDecorator{
    
    private int depolamaBoyutu;
    
    
    public DepolamaBirimiEkleDecaroter(Bilgisayar bilgisayar,int depolamaBoyutu) {
        super(bilgisayar);
        this.depolamaBoyutu = depolamaBoyutu;
    }

    @Override
    public double fiyat() {
        if(depolamaBoyutu == 256)
        {
            return super.fiyat()+ 4999;
        }
        else if (depolamaBoyutu == 512){
            return super.fiyat()+ 7999;       
        }
        else{
            return super.fiyat();
        }
        
        
    }

    @Override
    public String aciklama() {
        return super.aciklama()+ this.depolamaBoyutu + " GB SSD Disk eklendi.";
    }

}
