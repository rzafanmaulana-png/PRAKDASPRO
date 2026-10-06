import java.util.Scanner;

public class kasus2_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah tabungan awal: ");
        double tabunganAwal = input.nextDouble();

        System.out.print("Masukkan lama menabung (tahun): ");
        int lamaMenabung = input.nextInt();

        System.out.print("Masukkan bunag dalam %: ");
        double persentaseBunga = input.nextDouble(); // 2% per tahun
        persentaseBunga = persentaseBunga / 100;

        // Rumus Bunga Majemuk: A = P * (1 + r)^t
        double tabunganAkhir = tabunganAwal * Math.pow(1 + persentaseBunga, lamaMenabung);
        double totalBunga = tabunganAkhir - tabunganAwal;

        System.out.println("------------------------------------");
        System.out.printf("Total Bunga Didapat : Rp%.0f\n", totalBunga);
        System.out.printf("Total Tabungan Akhir: Rp%.0f\n", tabunganAkhir);

        input.close();
    }
}

// Input: jumlah tabungan awal, lama menabung
// Output: bunga, jumlah tabungan akhir
// Data lain = prosentase bunga = 0,02
// Proses:
// Input jumlah tabungan awal, lama menabung
// Hitung bunga = lama menabung x prosentase bunga x jumlah tabungan awal
// Hitung jumlah tabungan akhir = bunga + jumlah tabungan awal
// Output bunga dan jumlah tabungan akhir
// jml_tabungan_awal : int
// lama_menabung : int
// jml_tabungan_akhir : double
// bunga : double
// prosentase_bunga : double