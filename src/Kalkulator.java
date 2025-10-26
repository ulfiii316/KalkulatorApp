public class Kalkulator {
    public static void main (String[] args) {
        System.out.println();
        System.out.println("=== Kalkulator Sederhana ===");
        double a = 10;
        double b = 5;
        System.out.println("Hasil Penjumlahan: " + tambah(a, b));
        System.out.println("Hasil Pengurangan: " + kurang(a, b));
        System.out.println("Hasil Perkalian: " + kali(a, b));
        System.out.println("Hasil Pembagian: " + bagi(a, b));
    }

    public static double tambah(double x, double y) {
        return x + y;
    }

    public static double kurang(double x, double y) {
        return x - y;
    }

    public static double kali(double x, double y) {
        return x * y;
    }

    public static double bagi(double x, double y) {
        return x / y;
    }
}
