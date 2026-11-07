package pertemuan05;

public class SegitigaBintang {
    public void cetakHalfTriangle(int tinggi){
        System.out.println("----- Half Triangle -----");
        for(int i = 1; i <= tinggi; i++){
            // Cetak spasi
            for(int j = 1; j <= tinggi - i; j++){
                System.out.print(" ");
            }
            // Cetak bintang
            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void cetakFullTriangle(int tinggi){
        System.out.println("\n----- Full Triangle -----");
        // Segitiga bagian atas
        for(int i = 1; i <= tinggi; i++){
            for(int j = 1; j <= tinggi - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Segitiga bagian bawah
        for(int i = tinggi - 1; i >= 1; i--){
            for(int j = 1; j <= tinggi - i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}