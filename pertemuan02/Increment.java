package pertemuan02;

public class Increment {
    int nilai;

    public void tampilkanIncrement() {
        System.out.println("Nilai awal           : " + nilai);
        System.out.println("Post-increment (x++) : " + (nilai++));
        System.out.println("Nilai setelah x++    : " + nilai);
        System.out.println("Pre-increment (++x)  : " + (++nilai));
    }
}