package pertemuan04;

//No. 5
public class Salesman {
    double penjualan;

    public double hitungUangJasa() {
        if (penjualan <= 2000000) {
            return 100000;
        } else if (penjualan <= 5000000) {
            return 200000;
        } else {
            return 300000;
        }
    }

    public double hitungKomisi() {
        if (penjualan <= 2000000) {
            return 0.10 * penjualan;
        } else if (penjualan <= 5000000) {
            return 0.15 * penjualan;
        } else {
            return 0.20 * penjualan;
        }
    }

    public double hitungTotalPendapatan() {
        return hitungUangJasa() + hitungKomisi();
    }
}