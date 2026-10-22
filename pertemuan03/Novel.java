package pertemuan03;

public class Novel {
    int banyakNovel;
    int tebalLembar;

    public void hitungWaktu() {
        long totalLembar = (long) banyakNovel * tebalLembar;
        long totalDetik = totalLembar;

        long hari = totalDetik / 86400;
        long sisaHari = totalDetik % 86400;

        long jam = sisaHari / 3600;
        long sisaJam = sisaHari % 3600;

        long menit = sisaJam / 60;
        long detik = sisaJam % 60;

        System.out.println("Total Lembar : " + totalLembar);
        System.out.println("Waktu Cetak  : " + hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");
    }
}