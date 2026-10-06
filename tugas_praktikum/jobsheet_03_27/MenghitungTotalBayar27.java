package tugas_praktikum.jobsheet_03_27;

import java.util.Scanner;

public class MenghitungTotalBayar27 {
    public static void main(String[] args) {
        // Deklarasi Scanner
        Scanner sc = new Scanner(System.in);

        // Deklarasi Variabel
        int harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;

        // Input Harga
        System.out.print("Masukkan harga barang: ");
        harga = sc.nextInt();

        // Proses Perhitungan
        potongan = diskon * harga;
        jml_bayar = harga - potongan;

        // Output Hasil
        System.out.println("Besar potongan harga: Rp. " + potongan);
        System.out.println("Jumlah yang harus anda bayar adalah Rp. " + jml_bayar);
        
        sc.close();
    }
}
