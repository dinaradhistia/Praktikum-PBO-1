package pertemuan02;

public class Main {
    public static void main(String[] args) {
        //Increment - soal no. 1
        Increment inc = new Increment();
        
        inc.nilai = 5;
        
        System.out.println("1. Operator Increment");
        inc.tampilkanIncrement();
        
        //Persegi panjang - soal no. 2
        PersegiPanjang pp = new PersegiPanjang();
        
        pp.panjang = 50;
        pp.lebar = 45;
        
        System.out.println("\n2. Luas Persegi Panjang");
        System.out.println("Luas Persegi Panjang: " + pp.hitungLuas());
        
        //Persamaan kuadrat - soal no. 3
        PersamaanKuadrat pk = new PersamaanKuadrat();
        
        pk.a = 2;
        pk.b = 10;
        pk.c = 5;
        
        System.out.println("\n3. Persamaan Kuadrat");
        System.out.println("Hasil b^2 - 4ac: " + pk.hitungDeterminant());
        
        //Operasi Matematika - soal no. 4
        OperasiMatematika om = new OperasiMatematika();
        
        om.x = 22;
        om.y = 33;
        
        System.out.println("\n4. Operasi Matematika");
        System.out.println("Penjumlahan (x + y) : " + om.tambah());
        System.out.println("Pengurangan (x - y) : " + om.kurang());
        System.out.println("Perkalian   (x * y) : " + om.kali());
        System.out.println("Pembagian   (x / y) : " + om.bagi());
        
        //Segitiga - soal no. 5 & 6
        //No. 5
        Segitiga sgtg = new Segitiga();

        sgtg.a = 6;
        sgtg.b = 8;
        
        System.out.println("\n5. Luas Segitiga");
        System.out.println("Luas Segitiga: " + sgtg.hitungLuas());

        //No.6
        System.out.println("\n6. Nilai c dan Keliling Segitiga");
        System.out.println("Nilai c (Sisi Miring) : " + sgtg.hitungSisiMiring());
        System.out.println("Keliling Segitiga     : " + sgtg.hitungKeliling());
        
        //Ubah string - soal no. 7
        UbahString kalimat = new UbahString();
        
        kalimat.teksA = "Saya Belajar Java";
        kalimat.teksB = "Saya Belajar Java";
        
        System.out.println("\n7. Mengubah String");
        System.out.println("String a (lowercase) : " + kalimat.keHurufKecil());
        System.out.println("String b (uppercase) : " + kalimat.keHurufBesar());
        
        //Waktu tempuh - soal no. 8
        WaktuTempuh wt = new WaktuTempuh();
        
        System.out.println("\n8. Waktu Tempuh");
        System.out.println("Waktu ke Bulan    : " + wt.hitWaktuKeBulan() + " detik");
        System.out.println("Waktu ke Matahari : " + wt.hitWaktuKeMatahari() + " detik (" + (wt.hitWaktuKeMatahari() / 60) + " menit)");
        
        //Konversi suhu - soal no. 9
        KonversiSuhu sh = new KonversiSuhu();
        
        sh.C = 10;
        sh.F = 15;
        sh.R = 5;
        
        System.out.println("\n9. Konversi Suhu");
        System.out.println("a. Celcius ke Fahrenheit : " + sh.celciusToFahrenheit());
        System.out.println("   Fahrenheit ke Celcius : " + sh.fahrenheitToCelcius());
        System.out.println("b. Celcius ke Reamur      : " + sh.celciusToReamur());
        System.out.println("   Reamur ke Celcius      : " + sh.reamurToCelcius());
        System.out.println("c. Fahrenheit ke Reamur   : " + sh.fahrenheitToReamur());
        System.out.println("   Reamur ke Fahrenheit   : " + sh.reamurToFahrenheit());
    }    
}