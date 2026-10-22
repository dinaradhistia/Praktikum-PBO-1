package pertemuan03;

import java.io.*;

public class Pembelanjaan {
    public static void main(String[] args) throws IOException{
        //No. 2
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        System.out.println("2. Data Input Stream & Data Output Stream");
        System.out.print("Nama          : ");
        String nama = br.readLine();
        
        System.out.print("Total Belanja : ");
        double totalBelanja = Double.parseDouble(br.readLine());
        
        System.out.print("Diskon (%)    : ");
        double diskon = Double.parseDouble(br.readLine());

        double total = totalBelanja - (totalBelanja * (diskon / 100));

        System.out.print("Bayar         : ");
        double bayar = Double.parseDouble(br.readLine());

        double kembalian = bayar - total;
        
        System.out.println("Kembalian     : " + kembalian);

        DataOutputStream output = new DataOutputStream(new FileOutputStream("belanja.txt"));
        output.writeUTF(nama);
        output.writeDouble(totalBelanja);
        output.writeDouble(diskon);
        output.writeDouble(total);
        output.writeDouble(bayar);
        output.writeDouble(kembalian);
        output.close();

        DataInputStream input = new DataInputStream(new FileInputStream("belanja.txt"));
        
        String Nama = input.readUTF();
        double TotalBelanja = input.readDouble();
        double Diskon = input.readDouble();
        double Total = input.readDouble();
        double Bayar = input.readDouble();
        double Kembalian = input.readDouble();
        
      input.close();
    }
}