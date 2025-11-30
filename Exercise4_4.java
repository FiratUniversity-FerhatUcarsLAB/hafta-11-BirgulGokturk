/*
 * Ad Soyad: Birgül Göktürk
 * Ogrenci No:250541094
 * Tarih:30.11.2025
 * 


     public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        // Cevap:
        // Bu metot bir int değeri döndürüyor ama biz sonucu kullanmadık.
        // Java hata vermez, program çalışır.
        // Sadece IDE veya derleyici "unused return value" şeklinde bir uyarı gösterebilir.

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // Cevap:
        // sayHello() metodu void döndürür, yani bir değer döndürmez.
        // + operatörü birleştirme/toplama için kullanılır.
        // Bu yüzden derleyici hata verir:
        // "error: bad operand types for binary operator '+'"
        // Çünkü void bir değer olmadığı için toplama işleminde kullanılamaz.

        // Programın çıktısı:
        // Bu kod çalıştırıldığında ekrana hiçbir şey yazılmaz.
        // sayHello() satırı yorum satırı olduğu için "hello" da yazılmaz.
    }

    // 3) Stack diyagramı örneği (zoop metodu için)
    // Örnek: zoop ikinci kez çağrıldığında stack yapısı şöyle olur:
    // (En üstten aşağıya doğru)
    //
    // +-------------------------+
    // | zoop() - 2. çağrı       | <- aktif metot en üstte
    // | Parametreler            |
    // | Yerel değişkenler       |
    // +-------------------------+
    // | zoop() - 1. çağrı       | <- bir önceki çağrı
    // | Parametreler            |
    // | Yerel değişkenler       |
    // +-------------------------+
    // | main()                  | <- en altta
    // | args                     |
    // | main içindeki değişkenler|
    // +-------------------------+
    //
    // Stack LIFO çalışır: yeni çağrı en üste eklenir, tamamlanınca silinir.
}
