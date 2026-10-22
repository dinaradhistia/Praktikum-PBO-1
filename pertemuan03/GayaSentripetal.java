package pertemuan03;

public class GayaSentripetal {
    double m;   // Massa
    double v;   // Kecepatan
    double r;   // Jari-jari

    public double hitungFc() {
        return (m * (v * v)) / r;
    }

    public void tampilHasil() {
        System.out.println("Gaya Sentripetal (Fc): " + hitungFc());
    }
}