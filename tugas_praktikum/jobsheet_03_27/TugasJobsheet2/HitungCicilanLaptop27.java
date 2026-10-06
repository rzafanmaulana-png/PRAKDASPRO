package tugas_praktikum.jobsheet_03_27.TugasJobsheet2;

import java.util.Scanner;

public class HitungCicilanLaptop27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga laptop (x): Rp ");
        double hargaLaptop = input.nextDouble();

        System.out.print("Masukkan uang muka (y): Rp ");
        double uangMuka = input.nextDouble();

        System.out.print("Masukkan lama cicilan dalam bulan (z): ");
        int lamaCicilan = input.nextInt();

        double sisaHarga = hargaLaptop - uangMuka;
        double cicilanPokok = sisaHarga / lamaCicilan;
        double bungaBulanan = sisaHarga * 0.02;
        double totalCicilanPerBulan = cicilanPokok + bungaBulanan;

        System.out.println("\n=== RINCIAN PEMBAYARAN ===");
        System.out.printf("Sisa harga yang dicicil : Rp %.2f%n", sisaHarga);
        System.out.printf("Total cicilan per bulan  : Rp %.2f%n", totalCicilanPerBulan);

        input.close();
    }
}
