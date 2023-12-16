import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sarkicalar {
    private ArrayList<String> sarkiciListesi=new ArrayList<String>();
    public void sarkiclarıBastir(){
        System.out.println("şarkıcı listesinde"+sarkiciListesi.size()+" kadar şarkıcı var");
        for (int i = 0; i <sarkiciListesi.size() ; i++) {
            System.out.println((i+1)+"şarkıcı :"+sarkiciListesi.get(i));
        }
    }public void sarkiciEkle(String isim){
        sarkiciListesi.add(isim);
        System.out.println("şarkıcı listesi güncellendi");
    }public void sarkiciGuncelle(String yeniIsim,int pozisyon){
        sarkiciListesi.set(pozisyon,yeniIsim);
        System.out.println("şarkıcı listesi güncellendi");
    }public void sarkkiciSil(int pozisyon){
        String isim=sarkiciListesi.get(pozisyon);
        sarkiciListesi.remove(pozisyon);
        System.out.println(isim+" isimli şarkıcı listeden alındı");
    }public void sarkiciAra(String sarkiciIsmi){
        int pozisyon=sarkiciListesi.indexOf(sarkiciIsmi);
        if (pozisyon>=0){
            System.out.println("şarkıcı bulundu");
            System.out.println(sarkiciIsmi+"isimli şarkıcı"+(pozisyon+1)+"pozisyonda");
        }else {
            System.out.println("şarkıcı bulunamadı");
        }
    }
}
