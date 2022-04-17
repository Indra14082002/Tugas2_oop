import java.util.Scanner;

public class HitungVolBalok {
    public static void main(String[] args) {

//       Method membuat object baru dari class HitungVol
        HitungVol volBalok = new HitungVol();

//       Method mendefinisikan scanner
        Scanner inputDt = new Scanner(System.in);

//       Method mengambil inputan nilai panjang dari user
        System.out.print("Masukan Nilai Panjang : ");
        volBalok.pj = inputDt.nextDouble();

//       Method mengambil inputan nilai lebar dari user
        System.out.print("Masukan Nilai Lebar   : ");
        volBalok.lb = inputDt.nextDouble();

//       Method mengambil inputan nilai tinggi dari user
        System.out.print("Masukan Nilai Tinggi  : ");
        volBalok.tg = inputDt.nextDouble();
        System.out.println();

//        Method PrintHasil untuk menampilkan hasil
        volBalok.PrintHasil();

    }
}
