package pertemuan04;

//No. 4
public class TahunKabisat {
    int tahun;

    public boolean isKabisat() {
        if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0)) {
            return true;
        }
        return false;
    }
}