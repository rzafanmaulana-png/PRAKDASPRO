import java.util.Scanner;

public class KeramikLantai27 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ================= HEADER =================
        System.out.println("========================= HITUNG KEBUTUHAN KERAMIK=========================");

        // ================= VARIABEL =================
        double panjang;
        double lebar;
        double luasRuangan;
        double luasKeramik;
        int jumlahMinimum;
        int jumlahTambahan;
        int totalKeramik;
        int hargaKeramik;
        int totalBiaya;

        // ================= INPUT =================
        System.out.println("\nINPUT DATA");
        System.out.print("Panjang ruangan (meter) : ");
        panjang = input.nextDouble();

        System.out.print("Lebar ruangan (meter)   : ");
        lebar = input.nextDouble();

        // Data keramik
        luasKeramik = 0.60 * 0.60;
        hargaKeramik = 45000;

        // ================= PROSES =================
        luasRuangan = panjang * lebar;

        // Jumlah keramik minimum
        jumlahMinimum = (int) Math.ceil(luasRuangan / luasKeramik);

        // Tambahan 10%
        jumlahTambahan = (int) Math.ceil(jumlahMinimum * 0.10);

        // Total keramik
        totalKeramik = jumlahMinimum + jumlahTambahan;

        // Total biaya
        totalBiaya = totalKeramik * hargaKeramik;

        // ================= OUTPUT =================
        System.out.println("\nHASIL PERHITUNGAN");
        System.out.printf("Luas ruangan           : %.2f m2%n", luasRuangan);
        System.out.printf("Luas 1 keramik         : %.2f m2%n", luasKeramik);
        System.out.printf("Keramik minimum        : %d buah%n", jumlahMinimum);
        System.out.printf("Tambahan 10%%           : %d buah%n", jumlahTambahan);
        System.out.printf("Total keramik          : %d buah%n", totalKeramik);
        System.out.printf("Harga 1 keramik        : Rp %,d%n", hargaKeramik);
        System.out.printf("Total biaya belanja    : Rp %,d%n", totalBiaya);

        input.close();
    }
}
