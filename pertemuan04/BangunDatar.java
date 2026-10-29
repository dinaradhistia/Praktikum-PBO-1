package pertemuan04;

import java.util.Scanner;

//No. 7
public class BangunDatar {
    public void hitungLuas(int pilihan, Scanner input) {
        switch (pilihan) {
            case 1: // Persegi
                System.out.print("Masukkan sisi: ");
                double s = input.nextDouble();
                System.out.println("Luas Persegi: " + (s * s));
                break;
            case 2: // Segitiga
                System.out.print("Masukkan alas: ");
                double a = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();
                System.out.println("Luas Segitiga: " + (0.5 * a * t));
                break;
            case 3: // Lingkaran
                System.out.print("Masukkan jari-jari (r): ");
                double r = input.nextDouble();
                System.out.println("Luas Lingkaran: " + (Math.PI * r * r));
                break;
            case 4: // Trapesium
                System.out.print("Masukkan sisi atas (a): ");
                double sa = input.nextDouble();
                System.out.print("Masukkan sisi bawah (b): ");
                double sb = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tt = input.nextDouble();
                System.out.println("Luas Trapesium: " + (0.5 * (sa + sb) * tt));
                break;
            case 5: // Layang-layang
                System.out.print("Masukkan diagonal 1 (d1): ");
                double d1 = input.nextDouble();
                System.out.print("Masukkan diagonal 2 (d2): ");
                double d2 = input.nextDouble();
                System.out.println("Luas Layang-layang: " + (0.5 * d1 * d2));
                break;
            default:
                System.out.println("Pilihan menu tidak valid!");
                break;
        }
    }
}