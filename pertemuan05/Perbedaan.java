package pertemuan05;

public class Perbedaan {
    public void PostIncrement(){
        System.out.println("----- Menggunakan i++ (Post-Increment) -----");
        
        int i = 0;
        while(i < 3){
            System.out.println("Nilai cetak: " + (i++)); 
            // Mencetak nilai i terlebih dahulu, baru nilai i ditambah 1
        }
    }

    public void PreIncrement(){
        System.out.println("\n----- Menggunakan ++i (Pre-Increment) -----");
        int i = 0;
        while(i < 3){
            System.out.println("Nilai cetak: " + (++i)); 
            // Nilai i ditambah 1 terlebih dahulu, baru dicetak
        }
    }
}