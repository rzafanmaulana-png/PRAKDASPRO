import java.util.Scanner;

public class TugasParkir27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan lama parkir (dalam jam): ");
        int lamaParkir = input.nextInt();

        int tarifDasar = 2000;
        int tarifPerJamBerikutnya = 1000;
        int totalBiaya;

        if (lamaParkir <= 0) {
            System.out.println("Lama parkir tidak valid!");
        } else if (lamaParkir <= 2) {
            // 2 jam pertama atau kurang, hanya dikenai tarif dasar
            totalBiaya = tarifDasar;
            System.out.println("Lama parkir       : " + lamaParkir + " jam");
            System.out.println("Total biaya parkir: Rp " + totalBiaya);
        } else {
            // Lebih dari 2 jam, tarif dasar + tambahan per jam berikutnya
            int jamTambahan = lamaParkir - 2;
            totalBiaya = tarifDasar + (jamTambahan * tarifPerJamBerikutnya);
            System.out.println("Lama parkir       : " + lamaParkir + " jam");
            System.out.println("Jam tambahan      : " + jamTambahan + " jam");
            System.out.println("Total biaya parkir: Rp " + totalBiaya);
        }

        input.close();
    }
}
