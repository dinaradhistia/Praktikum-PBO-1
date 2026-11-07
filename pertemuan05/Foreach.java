package pertemuan05;

public class Foreach {
    public void cetak(){
        int nilai[] = {80, 90, 75, 85, 95};

        System.out.println("----- Nilai dalam Array -----");
        for(int n : nilai){
            System.out.println("Nilai: " + n);
        }
    }
}