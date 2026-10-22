package pertemuan03;

import java.io.*;

public class Buah {
    public static void main(String[] args) throws IOException {
        //No. 5
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("5. Menghitung total buah yang dibeli menggunakan BufferedReader dan InputStreamReader");
        System.out.print("Jumlah mangga dibeli    : ");
        int manggaAwal = Integer.parseInt(br.readLine());

        System.out.print("Jumlah tetangga diberi  : ");
        int tetangga = Integer.parseInt(br.readLine());

        System.out.print("Jambu per tetangga      : ");
        int jambuPerTetangga = Integer.parseInt(br.readLine());

        System.out.print("Mangga busuk            : ");
        int manggaBusuk = Integer.parseInt(br.readLine());

        int manggaBagus = manggaAwal - manggaBusuk;
        int totalJambu = tetangga *  jambuPerTetangga;
        int totalBuah = manggaBagus + totalJambu;

        System.out.println("\nHasil Perhitungan:");
        System.out.println("Mangga Bagus : " + manggaBagus + " pcs");
        System.out.println("Total Jambu  : " + totalJambu + " pcs");
        System.out.println("Total Buah   : " + totalBuah + " pcs");
    }
}