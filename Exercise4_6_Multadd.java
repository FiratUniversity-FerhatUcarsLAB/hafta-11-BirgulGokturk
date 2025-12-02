/*
 * Ad Soyad: Birgül Göktürk
 * Ogrenci No:250541094
 * Tarih:02.12.2025
 * 



public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static double expSum(double x) {
        double exp_minus_x = Math.exp(-x);

        double term1 = x * exp_minus_x;

        double term2 = Math.sqrt(1 - exp_minus_x);

        return term1 + term2;
    }

    public static void main(String[] args) {

        System.out.println("--- multadd Basit Testler ---");

        double test1 = multadd(1.0, 2.0, 3.0);
        System.out.println("1.0 * 2.0 + 3.0 = " + test1);

        double test2 = multadd(5.0, 10.0, -5.0);
        System.out.println("5.0 * 10.0 + (-5.0) = " + test2);

        System.out.println("--------------------------------");

        System.out.println("--- 4. İfadeler (multadd Kullanarak) ---");

        double pi_over_4 = Math.PI / 4.0;
        double a = Math.cos(pi_over_4);
        double b = 0.5;
        double c = Math.sin(pi_over_4);

        double resultA = multadd(a, b, c);
        System.out.println("sin(π/4) + cos(π/4)/2 = " + resultA);


        double log10_val = Math.log(10.0);
        double log20_val = Math.log(20.0);

        double resultB = multadd(1.0, log10_val, log20_val);
        System.out.println("log(10) + log(20) = " + resultB);

        System.out.println("--------------------------------");
        
        System.out.println("--- 5. expSum Metodu Testi (x = 2.0) ---");

        double x_test = 2.0;
        double resultExpSum = expSum(x_test);

        System.out.println("x = " + x_test + " için expSum sonucu: " + resultExpSum);
        System.out.println("--------------------------------");
    }
}
