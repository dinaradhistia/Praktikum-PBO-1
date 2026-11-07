package pertemuan05;

public class AngkaGanjil {
    int banyak;

    public void cetakDanHitung(){
        int total = 0;
        int ganjil = 1;

        for(int i = 1; i <= banyak; i++){
            System.out.print(ganjil + " ");
            total += ganjil;
            ganjil += 2;
        }
        
        System.out.println("\nTotal penjumlahan : " + total);
    }
}