package pertemuan05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //No. 1
        System.out.println("1. Menentukan Bilangan Terbesar dan Terkecil");
        MinMax mm = new MinMax();
        mm.proses();
        
        //No. 2
        System.out.println("\n2. Penjumlahan Bilangan & Rata-rata ");
        PenjumlahanBilangan pb = new PenjumlahanBilangan();
        pb.proses();
        
        //N0. 3
        System.out.println("\n3. Floyd's Triangle");
        FloydTriangle ft = new FloydTriangle();
        System.out.print("Masukkan banyak baris : ");
        ft.baris = s.nextInt();
        ft.cetak();
        
        //No. 4
        System.out.println("\n4. Angka-angka Ganjil");
        AngkaGanjil ag = new AngkaGanjil();
        System.out.print("Masukkan banyak angka : ");
        ag.banyak = s.nextInt();
        ag.cetakDanHitung();
        
        //No. 5
        System.out.println("\n5. Segitiga Bintang");
        SegitigaBintang sb = new SegitigaBintang();
        sb.cetakHalfTriangle(5);
        sb.cetakFullTriangle(3);
        
        //No. 6
        System.out.println("\n6. Menampilkan Dua Angka Sebelas");
        AngkaSebelas as = new AngkaSebelas();
        as.cetak();
        
        //No. 7
        System.out.println("\n7. Perbedaan Increment");
        Perbedaan p = new Perbedaan();
        p.PostIncrement();
        p.PreIncrement();
        
        //No. 8
        System.out.println("\n8. Foreach untuk Array");
        Foreach f = new Foreach();
        f.cetak();
    }
}