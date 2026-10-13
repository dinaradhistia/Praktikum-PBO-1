package pertemuan02;

public class WaktuTempuh {
    double kecepatanCahaya = 300000;
    double jarakBulan = 384400;
    double jarakMatahari = 152100000; 

    public double hitWaktuKeBulan() {
        return jarakBulan / kecepatanCahaya;
    }

    public double hitWaktuKeMatahari() {
        return jarakMatahari / kecepatanCahaya;
    }
}