public class HitungVol {

//    Variable
    double pj;
    double lb;
    double tg;
    double hasil;

//    Construktor
    public HitungVol(){
        System.out.println();
        System.out.println("--------------------------------");
        System.out.println("Aplikasi Penghitung Volume Balok");
        System.out.println("--------------------------------");
        System.out.println();
    }

//    Method mengambil nilai panjang
    private double getPj(double Pj) {
        Pj = this.pj;
        return Pj;
    }

//    Method mengambil nilai lebar
    private void getLb(double Lb) {
        Lb = this.lb;
    }

//    Method mengambil nilai tinggi
    private void getTg(double Tg) {
        Tg = this.tg;
    }

//    Method  melakukan perhitungan volume balok
    private double Hitungvol(){
        hasil = pj * lb * tg;
        return hasil;
    }

//    Method menampung hasil yang akan ditampilkan
    public void PrintHasil(){
        this.Hitungvol();


        System.out.println("Panjang Balok   : " + this.pj);
        System.out.println("Lebar Balok     : " + this.lb);
        System.out.println("Tinggi Balok    : " + this.tg);
        System.out.println("Hasilnya adalah : " + String.format("%.2f", this.hasil));
    }
}
