import java.util.Scanner;

public class Test {
    private static Sarkicalar sarkicalar = new Sarkicalar();
    private static Scanner scanner = new Scanner(System.in);

    public static void islemleriBastir() {
        System.out.println("\t 0-işlemleri görüntüle");
        System.out.println("\t 1-Şarkıcıları görüntüle");
        System.out.println("\t 2-)şarkıcı ekle");
        System.out.println("\t 3-)şarkıcı güncelle");
        System.out.println("\t 4-)şarkıcı sil");
        System.out.println("\t 5-)şarkıcı ara");
        System.out.println("\t 6-)uygulamadan çık");
    }
    public static void sarkiciGoruntule(){
        sarkicalar.sarkiclarıBastir();
    }public static void sarkiciEkle(){
        System.out.println("eklemek istediğiniz şarkıcının ismi");
        String isim=scanner.nextLine();
        sarkicalar.sarkiciEkle(isim);
    }public static void sarkiciGuncelle(){
        System.out.println("güncellemek istediğiniz kişi(1,2,3)");
        int pozisyon= scanner.nextInt();
        scanner.nextLine();
        String yeniIsim=scanner.nextLine();
        sarkicalar.sarkiciGuncelle(yeniIsim,pozisyon-1);
    }public static void sarkiciSil(){
        System.out.println("silmek istediğiniz şarkıcı(1,2,3)");
        int pozisyon= scanner.nextInt();
        sarkicalar.sarkkiciSil(pozisyon-1);
    }public static void sarkiciAra(){
        System.out.println("aramak istediğiniz şarkıcı");
        String isim=scanner.nextLine();
        sarkicalar.sarkiciAra(isim);
    }

    public static void main(String[] args) {
        System.out.println("şarkıcı uygulamasına hoşgeldiniz");
        islemleriBastir();
        boolean cikis = false;
        int islem;
        while (!cikis) {
            System.out.println("bir işlem seçiniz");
            islem= scanner.nextInt();
            scanner.nextLine();
            switch (islem){
                case 0:
                    islemleriBastir();
                    break;
                case 1:
                    sarkiciGoruntule();
                    break;
                case 2:
                    sarkiciEkle();
                    break;
                case 3:
                    sarkiciGuncelle();
                    break;
                case 4:
                    sarkiciSil();
                    break;
                case 5:
                    sarkiciAra();
                    break;
                case 6:
                    cikis=true;
                    System.out.println("uygulamadan çıkılyıor");
                    break;
            }
        }
    }
}
