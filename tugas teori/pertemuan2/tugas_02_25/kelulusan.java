import java.util.Scanner;

public class kelulusan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data
        System.out.print("Masukan Nilai: ");
        int nilai = sc.nextInt();

        System.out.print("Presentase Kehadiran: ");
        int hadir = sc.nextInt();

        // Cek kondisi kelulusan
        if (nilai >= 60 && hadir >= 80) {
            System.out.println("Selamat Anda Lulus");
        } else {
            System.out.println("Maaf Anda tidak Lulus");
        }

        sc.close();
    }
}