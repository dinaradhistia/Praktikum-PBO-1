package pertemuan03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //No. 1
        System.out.println("1. Perhitungan Gaji Bersih Karyawan");
        Pegawai pegawai = new Pegawai();
        
        System.out.print("Nomor Induk Karyawan   : ");
        pegawai.nik = input.nextLine();
        System.out.print("Nama Karyawan          : ");
        pegawai.nama = input.nextLine();
        System.out.print("Alamat                 : ");
        pegawai.alamat = input.nextLine();
        System.out.print("Jabatan                : ");
        pegawai.jabatan = input.nextLine();
        System.out.print("Gaji Pokok (P1)        : ");
        pegawai.gajiPokok = input.nextDouble();
        System.out.print("Tunjangan Jabatan(P2)  : ");
        pegawai.tunjanganJabatan = input.nextDouble();
        System.out.print("Tunjangan Istri (P3)   : ");
        pegawai.tunjanganIstri = input.nextDouble();
        System.out.print("Tunjangan Anak (P4)    : ");
        pegawai.tunjanganAnak = input.nextDouble();
        System.out.println("Total Gaji             : " + pegawai.hitungTotalGaji());
        System.out.println("Pajak Penghasilan(10%) : " + pegawai.hitungPajak());
        System.out.println("Gaji Bersih            : " + pegawai.hitungGajiBersih());
        
        //No. 4
        GayaSentripetal fc = new GayaSentripetal();
        
        System.out.println("\n4. Gaya Sentripetal");
        System.out.print("Masukkan Massa (m)    : ");
        fc.m = input.nextDouble();
        
        System.out.print("Masukkan Kecepatan (v): ");
        fc.v = input.nextDouble();
        
        System.out.print("Masukkan Jari-jari (r): ");
        fc.r = input.nextDouble();

        fc.tampilHasil();
        
        //No. 6
        SelisihWaktu sw = new SelisihWaktu();
        
        System.out.println("\n6. Selisih Waktu");
        System.out.print("Waktu 1 (Jam)   : ");
        sw.jam1 = input.nextInt();
        System.out.print("Waktu 1 (Menit) : ");
        sw.menit1 = input.nextInt();
        System.out.print("Waktu 1 (Detik) : ");
        sw.detik1 = input.nextInt();

        System.out.print("\nWaktu 2 (Jam)   : ");
        sw.jam2 = input.nextInt();
        System.out.print("Waktu 2 (Menit) : ");
        sw.menit2 = input.nextInt();
        System.out.print("Waktu 2 (Detik) : ");
        sw.detik2 = input.nextInt();

        sw.hitungSelisih();
        
        Novel cn = new Novel();
        
        System.out.println("\n7. Percetakan Novel");
        System.out.print("Banyaknya Novel     : ");
        cn.banyakNovel = input.nextInt();
        System.out.print("Tebal Lembar/Novel: ");
        cn.tebalLembar = input.nextInt();

        cn.hitungWaktu();
    }
}