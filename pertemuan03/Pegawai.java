package pertemuan03;

public class Pegawai {
    String nik;
    String nama;
    String alamat;
    String jabatan;
    double gajiPokok;
    double tunjanganJabatan;
    double tunjanganIstri;
    double tunjanganAnak;

    public double hitungTotalGaji() {
        return gajiPokok + tunjanganJabatan + tunjanganIstri + tunjanganAnak;
    }

    public double hitungPajak() {
        return 0.10 * hitungTotalGaji();
    }

    public double hitungGajiBersih() {
        return hitungTotalGaji() - hitungPajak();
    }
}