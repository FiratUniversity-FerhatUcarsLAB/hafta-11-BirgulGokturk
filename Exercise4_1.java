/*
 * Ad Soyad: Birgül Göktürk
 * Ogrenci No:250541094
 * Tarih:30.11.2025
 * 

import java.util.Scanner;

public class Exercise4_1 {

    // Amerikan Formatı
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    // Avrupa Formatı
    public static void printEuropean(String gun, int tarih, String ay, int yil) {
        System.out.println(tarih + " " + ay + " " + yil + ", " + gun);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Günü giriniz (örn: Pazartesi): ");
        String gun = input.nextLine();

        System.out.print("Ayı giriniz (örn: Temmuz): ");
        String ay = input.nextLine();

        System.out.print("Tarihi giriniz (örn: 22): ");
        int tarih = input.nextInt();

        System.out.print("Yılı giriniz (örn: 2019): ");
        int yil = input.nextInt();

        System.out.println();
        System.out.println("=== Amerikan Formatı ===");
        printAmerican(gun, tarih, ay, yil);

        System.out.println("=== Avrupa Formatıs ===");
        printEuropean(gun, tarih, ay, yil);
    }
}

 
