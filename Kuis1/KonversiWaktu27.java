import java.util.Scanner;

public class KonversiWaktu27 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ================= HEADER =================
        System.out.println("========================= KONVERSI WAKTU =========================");

        // ================= VARIABEL =================
        int totalDetik;
        int jam;
        int menit;
        int detik;

        // ================= INPUT =================
        System.out.println("\nINPUT DATA");
        System.out.print("Total detik : ");
        totalDetik = input.nextInt();

        // ================= PROSES =================
        jam = totalDetik / 3600;
        menit = (totalDetik % 3600) / 60;
        detik = totalDetik % 60;

        // ================= OUTPUT =================
        System.out.println("\nHASIL KONVERSI");
        System.out.println("Hasil Konversi Waktu = "
                + jam + " jam "
                + menit + " menit "
                + detik + " detik");

        input.close();
    }
}
