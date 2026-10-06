import java.util.Scanner;

public class StudiKasus227 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = input.nextLine().trim().toUpperCase();

        boolean lomba = jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI");
        boolean pkm = jenis.equals("PKM");

        String status;

        if (lomba) {
            // Cabang A: Perlombaan
            System.out.print("Jumlah dokumen : ");
            int dokumen = input.nextInt();
            System.out.print("Peringkat juara : ");
            int peringkat = input.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (dokumen == 4) {
                    status = "Dokumen lengkap. Dana penghargaan diberikan.";
                } else {
                    status = "Dokumen tidak lengkap (kurang " + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Bukan Juara 1, 2, atau 3. Dana penghargaan tidak diberikan.";
            }
        } else if (pkm) {
            // Cabang B: Program Kreativitas Mahasiswa
            System.out.print("Jumlah dokumen : ");
            int dokumen = input.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int statusPkm = input.nextInt();

            if (statusPkm == 1) {
                if (dokumen == 4) {
                    status = "Dokumen lengkap. Dana penghargaan diberikan.";
                } else {
                    status = "Dokumen tidak lengkap (kurang " + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Tidak lolos pendanaan PKM. Dana penghargaan tidak diberikan.";
            }
        } else {
            // Cabang C: Lainnya
            status = "Kegiatan Lainnya tidak memperoleh dana penghargaan.";
        }

        System.out.println("Status : " + status);
        input.close();
    }
}
