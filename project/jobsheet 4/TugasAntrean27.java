import java.util.Scanner;

public class TugasAntrean27 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kode layanan (1-4): ");
        int kode = input.nextInt();

        String layanan;
        String loket;

        switch (kode) {
            case 1:
                layanan = "Legalisir Ijazah";
                loket = "Loket A";
                System.out.println("Layanan : " + layanan);
                System.out.println("Loket   : " + loket);
                break;
            case 2:
                layanan = "Surat Keterangan Aktif Kuliah";
                loket = "Loket B";
                System.out.println("Layanan : " + layanan);
                System.out.println("Loket   : " + loket);
                break;
            case 3:
                layanan = "Pembayaran UKT";
                loket = "Loket C";
                System.out.println("Layanan : " + layanan);
                System.out.println("Loket   : " + loket);
                break;
            case 4:
                layanan = "Pengajuan Cuti Akademik";
                loket = "Loket D";
                System.out.println("Layanan : " + layanan);
                System.out.println("Loket   : " + loket);
                break;
            default:
                System.out.println("Kode layanan tidak tersedia");
                break;
        }

        input.close();
    }
}
