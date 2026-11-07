package pertemuan05;

public class FloydTriangle {
    int baris;

    public void cetak(){
        int angka = 1;
        
        for(int i = 1; i <= baris; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(angka + " ");
                angka++;
            }
            System.out.println();
        }
    }
}