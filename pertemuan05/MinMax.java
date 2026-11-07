package pertemuan05;

import java.util.Scanner;

//No. 1
public class MinMax {
    public void proses(){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan ke-1: ");
        int bil = s.nextInt();
        
        int terbesar = bil;
        int terkecil = bil;

        for(int i = 2; i <= 10; i++){
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            bil = s.nextInt();
            
            if(bil > terbesar){
                terbesar = bil;
            }
            if(bil < terkecil){
                terkecil = bil;
            }
        }

        System.out.println("\nBilangan Terbesar : " + terbesar);
        System.out.println("Bilangan Terkecil : " + terkecil);
    }
}