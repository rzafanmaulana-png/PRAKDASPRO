public class percobaan1_27 {

    public static void main(String[] args) {
        // Deklarasi dan Inisialisasi Variabel
        String salahSatuHobySayaAdalah = "Bermain efootball";
        boolean isPandai = true;
        char jenisKelamin = 'L';
        byte umurSayaSekarang = 20;
        double ipk = 3.24;
        double tinggi = 1.78;

        // Menampilkan Output ke Konsol
        System.out.println(salahSatuHobySayaAdalah);
        System.out.println("Apakah pandai? " + isPandai);
        System.out.println("Jenis kelamin: " + jenisKelamin);
        System.out.println("Umurku saat ini: " + umurSayaSekarang);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", ipk, tinggi));
    }
}