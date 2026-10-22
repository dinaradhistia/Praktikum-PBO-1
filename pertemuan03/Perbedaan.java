package pertemuan03;

import java.io.*;
import java.util.Scanner;

public class Perbedaan {
    public static void main(String[] args) throws IOException {
        //No. 3
        // Pakai Scanner
        //Mengambil input tipe data secara langsung
        Scanner input = new Scanner(System.in);
        
        System.out.println("3. Perbedaan Scanner dan BufferedReader");
        System.out.print("Input angka (Scanner): ");
        int a = input.nextInt();

        // Pakai BufferedReader
        //Membaca input sebagai String secara default sehingga harus dikonversi lebih dulu
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.print("Input angka (BufferedReader): ");
        int b = Integer.parseInt(br.readLine());
    }
}