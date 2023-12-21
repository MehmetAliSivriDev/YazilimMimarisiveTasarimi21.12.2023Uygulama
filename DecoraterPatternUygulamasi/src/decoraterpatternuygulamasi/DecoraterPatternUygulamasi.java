
package decoraterpatternuygulamasi;


public class DecoraterPatternUygulamasi {

    public static void main(String[] args) {
        
       
        Bilgisayar temelBilgisayar = new TemelBilgisayar();
        System.out.println("Fiyat: "+temelBilgisayar.fiyat()+ "TL" );
        System.out.println("Açıklma: " + temelBilgisayar.aciklama());
        
         
        //Ram eklenmiş

        Bilgisayar ramBilgisayar = new RamEkleDecaoter(new TemelBilgisayar(),8);
        System.out.println("Fiyat: "+ramBilgisayar.fiyat()+ " TL");
        System.out.println("Açıklama: " + ramBilgisayar.aciklama());

        //depolama birimi ve ram eklenen

        Bilgisayar depolomaRamliBilgisayar = new DepolamaBirimiEkleDecaroter(new RamEkleDecaoter(new TemelBilgisayar(),8),256);
        System.out.println("Fiyat: "+depolomaRamliBilgisayar.fiyat());
        System.out.println("Açıklama: "+depolomaRamliBilgisayar.aciklama());

        //sadece depolama
        Bilgisayar depolamaBilgisayar = new DepolamaBirimiEkleDecaroter(new TemelBilgisayar(),256);
        System.out.println("Fiyat: "+depolamaBilgisayar.fiyat());
        System.out.println("Açıklama: " +depolamaBilgisayar.aciklama());
        
        

        //16 Gb ram eklenmiş
        Bilgisayar ramBilgisayar2 = new RamEkleDecaoter(new TemelBilgisayar(),16);
        System.out.println("Fiyat : "+ramBilgisayar2.fiyat()+ " TL");
        System.out.println("Açıklama: " + ramBilgisayar2.aciklama());

        
        //512 GB SSD depolama eklenmiş
        Bilgisayar depolamaBilgisayar2 = new DepolamaBirimiEkleDecaroter(new TemelBilgisayar(),512);
        System.out.println("Fiyat: " +depolamaBilgisayar2.fiyat() + "TL");
        System.out.println("Açıklama: " + depolamaBilgisayar2.aciklama());
    }
    
}
