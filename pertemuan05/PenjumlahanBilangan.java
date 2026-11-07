package pertemuan05;

import java.util.Scanner;

//No. 2
public class PenjumlahanBilangan {
    public void proses(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan banyak bilangan: ");
        int n = s.nextInt();
        
        double total = 0;
        for(int i = 1; i <= n; i++){
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            double bil = s.nextDouble();
            total += bil;
        }

        double rataRata = total / n;
        System.out.println("\nTotal Jumlah : " + total);
        System.out.println("Rata-rata    : " + rataRata);
    }
}