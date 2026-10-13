package pertemuan02;

public class Segitiga {
    double a, b;

    public double hitungLuas() {
        return 0.5 * a * b;
    }

    public double hitungSisiMiring() {
        return Math.sqrt((a * a) + (b * b));
    }

    public double hitungKeliling() {
        return a + b + hitungSisiMiring();
    }
}