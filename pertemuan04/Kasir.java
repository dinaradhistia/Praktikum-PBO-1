package pertemuan04;

//No. 6
public class Kasir {
    boolean isMember;
    double totalBelanja;
    double uangBayar;

    public double hitungDiskon() {
        double diskon = 0;
        if (isMember) {
            if (totalBelanja > 500000) {
                diskon = 50000;
            } else if (totalBelanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (totalBelanja > 100000) {
                diskon = 10000;
            }
        }
        return diskon;
    }

    public double hitungTotalBayar() {
        return totalBelanja - hitungDiskon();
    }

    public double hitungKembalian() {
        return uangBayar - hitungTotalBayar();
    }
}