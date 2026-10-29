package pertemuan04;

//No. 3
public class GajiKaryawan {
    String nik;
    String nama;
    int kodeGolongan;
    String statusPernikahan;
    int jumlahAnak;

    public double hitungGajiPokok() {
        switch (kodeGolongan) {
            case 1: return 1200000;
            case 2: return 1500000;
            case 3: return 1750000;
            case 4: return 2000000;
            default: return 0;
        }
    }

    public double hitungTunjanganPasangan() {
        if (statusPernikahan.equalsIgnoreCase("Menikah")) {
            return 0.10 * hitungGajiPokok();
        }
        return 0;
    }

    public double hitungTunjanganAnak() {
        return (0.05 * hitungGajiPokok()) * jumlahAnak;
    }

    public double hitungTotalTunjangan() {
        return hitungTunjanganPasangan() + hitungTunjanganAnak();
    }

    public double hitungGajiBersih() {
        return hitungGajiPokok() + hitungTotalTunjangan();
    }

    public void tampilData() {
        System.out.println("\n--- RINCIAN GAJI ---");
        System.out.println("Gaji Pokok         : Rp" + hitungGajiPokok());
        System.out.println("Tunjangan Pasangan : Rp" + hitungTunjanganPasangan());
        System.out.println("Tunjangan Anak     : Rp" + hitungTunjanganAnak());
        System.out.println("Total Tunjangan    : Rp" + hitungTotalTunjangan());
        System.out.println("Gaji Bersih        : Rp" + hitungGajiBersih());
    }
}