package tugas_praktikum.jobsheet_03_27.TugasJobsheet2;

import java.util.Scanner;

public class HitungBiayaCetak27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int biayaPerLembar = 500;
        int biayaJilid = 5000;
        
        System.out.print("Masukkan jumlah lembar dokumen (x): ");
        int x = input.nextInt();
        
        int totalBiaya = (x * biayaPerLembar) + biayaJilid;
        
        System.out.println("Total biaya yang harus dibayar: Rp" + totalBiaya);
        
        input.close();
    }
}
