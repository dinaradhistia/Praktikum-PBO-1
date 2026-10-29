package pertemuan04;

//No. 2
public class Hari {
    int kodeHari;

    public String NamaHari() {
        switch (kodeHari) {
            case 1: return "Senin";
            case 2: return "Selasa";
            case 3: return "Rabu";
            case 4: return "Kamis";
            case 5: return "Jumat";
            case 6: return "Sabtu";
            case 7: return "Minggu";
            default: return "Kode hari tidak valid (Harus 1-7)";
        }
    }
}