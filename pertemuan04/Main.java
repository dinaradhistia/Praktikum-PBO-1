package pertemuan04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //No. 1
        GanjilGenap gg = new GanjilGenap();
        
        System.out.println("1. Cek Ganjil Genap");
        System.out.print("Masukkan angka: ");
        gg.angka = input.nextInt();
        
        System.out.println("Hasil: " + gg.cekStatus());
        
        //No. 2
        Hari nh = new Hari();
        
        System.out.println("\n2. Kode dan Nama Hari");
        System.out.print("Masukkan kode hari (1-7): ");
        nh.kodeHari = input.nextInt();

        System.out.println("Hari: " + nh.NamaHari());
        
        //No. 3
        GajiKaryawan gk = new GajiKaryawan();
        
        System.out.println("\n3. Hitung Gaji Karyawan");
        System.out.print("Masukkan NIK: ");
        gk.nik = input.next();
        System.out.print("Masukkan nama: ");
        input.nextLine();
        gk.nama = input.nextLine();
        System.out.print("Masukkan kode golongan (1-4): ");
        gk.kodeGolongan = input.nextInt();
        System.out.print("Status pernikahan (menikah/belum): ");
        gk.statusPernikahan = input.next();
        System.out.print("Masukkan jumlah anak: ");
        gk.jumlahAnak = input.nextInt();

        gk.tampilData();
        
        //No. 4
        TahunKabisat tk = new TahunKabisat();
        
        System.out.println("\n4. Penentuan Tahun Kabisat");
        System.out.print("Masukkan tahun: ");
        tk.tahun = input.nextInt();

        if (tk.isKabisat()) {
            System.out.println(tk.tahun + " adalah Tahun Kabisat");
        } else {
            System.out.println(tk.tahun + " bukan Tahun Kabisat");
        }
        
        //No. 5
        Salesman sm = new Salesman();
        
        System.out.println("\n5. Menghitung Pendapatan Seorang Salesman");
        System.out.print("Masukkan total penjualan hari ini: Rp");
        sm.penjualan = input.nextDouble();

        System.out.println("Uang Jasa        : Rp" + sm.hitungUangJasa());
        System.out.println("Uang Komisi      : Rp" + sm.hitungKomisi());
        System.out.println("Total Pendapatan : Rp" + sm.hitungTotalPendapatan());
        
        //No. 6
        Kasir kr = new Kasir();
        
        System.out.println("\n6. Program Kasir Sederhana");
        System.out.print("Apakah punya kartu member? (ya/tidak): ");
        String memberInput = input.next();
        kr.isMember = memberInput.equalsIgnoreCase("ya");

        System.out.print("Masukkan total belanja : Rp");
        kr.totalBelanja = input.nextDouble();
        System.out.print("Masukkan uang bayar    : Rp");
        kr.uangBayar = input.nextDouble();
        
        System.out.println("Diskon              : Rp" + kr.hitungDiskon());
        System.out.println("Total Harus Dibayar : Rp" + kr.hitungTotalBayar());
        System.out.println("Kembalian           : Rp" + kr.hitungKembalian());
        
        //No. 7
        BangunDatar bd = new BangunDatar();
        
        System.out.println("\n7. Perhitungan Luas Bangun Datar");
        System.out.println("--- MENU LUAS BANGUN DATAR ---");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Pilih Menu (1-5): ");
        int pil = input.nextInt();

        bd.hitungLuas(pil, input);
    }
}