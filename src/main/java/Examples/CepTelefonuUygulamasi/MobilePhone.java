package Examples.CepTelefonuUygulamasi;

import java.util.ArrayList;

public class CepTelefonu {
    private ArrayList<Kisi> rehber;
    private String kendiNumaram;

    public CepTelefonu(String kendiNumaram) {
        this.kendiNumaram=kendiNumaram;
        this.rehber = new ArrayList<Kisi>();
    }

    public boolean ekleYeniKisi(Kisi yeniKisi){

        if(kisiBul(yeniKisi.getIsim())>=0 ){
            System.out.println(yeniKisi.getIsim()+" zaten rehberinizde var.");
            return false;
        }

        this.rehber.add(yeniKisi);
        return true;
    }
    public int kisiBul(Kisi aranacakKisi){
        return this.rehber.indexOf(aranacakKisi);
    }
    public int kisiBul(String isim){
        for(int i=0;i<this.rehber.size();i++){
            Kisi oAnkiKisiNesnesi=this.rehber.get(i);
            if(oAnkiKisiNesnesi.getIsim().equals(isim))
                return i;

        }return -1;
    }

    public Kisi kisiSorgula(String isim) {
        int position=kisiBul(isim);
        if(position>=0){
            return rehber.get(position);
        }return null;
    }

    public boolean kisiSil(Kisi silinecekKisi){
       int position= kisiBul(silinecekKisi);
       if(position<0){
           System.out.println("Böyle bir kişi yok..");
           return false;
       }
       this.rehber.remove(silinecekKisi);
       return true;

    }

    public boolean kisiGuncelle(Kisi eskiKisi, Kisi yenikisi){
        int bulunanPosition=kisiBul(eskiKisi);
        if (bulunanPosition<0){
            System.out.println("Böyle bir kayıt yok");
            return false;
        }
        this.rehber.set(bulunanPosition, yenikisi);
        System.out.println(eskiKisi.getIsim()+" değeri "+yenikisi.getIsim()+" ile güncellendi");
        return true;
    }

    public void tumRehber(){
        System.out.println("\n********** TÜM REHBER **********");
        if(rehber.size()==0){
            System.out.println("---\nKayıtlı kişi yok!\n---");
            return;
        }
        for(int i=0;i<this.rehber.size();i++){
            System.out.println((i+1)+" - "+rehber.get(i).getIsim()+" -> "+rehber.get(i).getTelNo());
        }
    }

}
