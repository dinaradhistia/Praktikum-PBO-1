package pertemuan03;

public class SelisihWaktu {
    int jam1, menit1, detik1;
    int jam2, menit2, detik2;

    public void hitungSelisih() {
        int totalDetik1 = (jam1 * 3600) + (menit1 * 60) + detik1;
        int totalDetik2 = (jam2 * 3600) + (menit2 * 60) + detik2;

        int selisih = totalDetik2 - totalDetik1;

        int j = selisih / 3600;
        int sisa = selisih % 3600;
        int m = sisa / 60;
        int d = sisa % 60;

        System.out.println("Selisih Waktu: " + j + " jam, " + m + " menit, " + d + " detik");
    }
}