/*
 * Ad Soyad: Birgül Göktürk
 * Ogrenci No:250541094
 * Tarih:02.12.2025
 * 


public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }

    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}



1. Stack Diyagramı

|---------------------------------------------|
| zoop (Aktif Metot)                          |
|   [Parametre] fred: " breakfast "           |
|   [Parametre] bob : 4                       |
|   [Yerel Değişken]: Yok                     |
|---------------------------------------------|
| clink                                       |
|   [Parametre] fork: 4                       |
|   [Yerel Değişken]: Yok                     |
|---------------------------------------------|
| main                                        |
|   [Parametre] args: [String dizisi]         |
|   [Yerel Değişken] bizz: 5                  |
|   [Yerel Değişken] buzz: 2                  |
|---------------------------------------------|




2. Programın Tam Çıktısı

    just for 
 any  not  more 
It ’s  breakfast 
!
