package pertemuan04;

//No. 1
public class GanjilGenap {
    int angka;

    public String cekStatus() {
        if (angka % 2 == 0) {
            return "Bilangan Genap";
        } else {
            return "Bilangan Ganjil";
        }
    }
}