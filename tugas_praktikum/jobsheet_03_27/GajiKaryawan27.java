package tugas_praktikum.jobsheet_03_27;

import java.util.Scanner;

public class GajiKaryawan27 {
    public static void main(String[] args) {
        // Deklarasi Scanner untuk input dari keyboard
        Scanner sc = new Scanner(System.in);

        // Deklarasi Variabel
        int gajiPokok;
        double bonus, totGaji;
        double tunjTransp = 600000;
        double tunjMkn = 400000;

        // Command Input Gaji Pokok
        System.out.print("Masukkan Gaji Pokok: ");
        gajiPokok = sc.nextInt();

        // Perhitungan Bonus dan Total Gaji
        bonus = 0.05 * gajiPokok;
        totGaji = gajiPokok + tunjTransp + tunjMkn + bonus - (0.1 * gajiPokok);

        // Menampilkan Hasil Output
        System.out.println("Bonus Bulanan anda adalah Rp. " + bonus);
        System.out.println("Gaji yang diterima adalah Rp. " + totGaji);

        sc.close();
    }
}