/*
 * Ad Soyad: Birgül Göktürk
 * Ogrenci No:250541094
 * Tarih:02.12.2025
 * 


public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}

1. Stack Diyagramı
|----------------------------------|
| ping                             |
|   [Parametreler: Yok]            |
|   [Yerel Değişkenler: Yok]       |
|----------------------------------|
| baffle                           |
|   [Parametreler: Yok]            |
|   [Yerel Değişkenler: Yok]       |
|----------------------------------|
| zoop                             |
|   [Parametreler: Yok]            |
|   [Yerel Değişkenler: Yok]       |
|----------------------------------|
| main                             |
|   [Parametreler: args]           |
|   [Yerel Değişkenler: Yok]       |
|----------------------------------|


2. Programın Tam Çıktısı

No , I  wug.
 You wugga  wug.
I  wug.
