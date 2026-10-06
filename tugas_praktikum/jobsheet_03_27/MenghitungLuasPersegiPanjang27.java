package tugas_praktikum.jobsheet_03_27;

import java.util.Scanner;

public class MenghitungLuasPersegiPanjang27 {
    public static void main(String[] args) {
        // Deklarasi Scanner untuk input data dari keyboard
        Scanner sc = new Scanner(System.in);

        // Deklarasi variabel
        long panjang;
        long lebar;
        long luas;

        // Perintah untuk menginputkan panjang dan lebar
        System.out.print("Masukkan panjang: ");
        panjang = sc.nextInt();
        
        System.out.print("Masukkan lebar: ");
        lebar = sc.nextInt(); // Catatan: sc.nextInt() sesuai petunjuk

        // Perintah untuk menghitung luas persegi panjang
        luas = panjang * lebar;

        // Menampilkan isi variabel luas
        System.out.println("Luas persegi adalah " + luas);
        
        sc.close();
    }
}
