import java.util.Scanner;

public class Tugas2Pemilihan27 {
    public static void main(String[] args) {
        int jumlahSks;
        Scanner input = new Scanner(System.in);

        System.out.print("Input jumlah SKS: ");
        jumlahSks = input.nextInt();

        if (jumlahSks > 24) {
            System.out.println("Melebihi batas");
        } else {
            System.out.println("KRS valid");
        }

        input.close();
    }
}