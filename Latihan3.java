import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner Absen18 = new Scanner (System.in);

        String merk, kategori;
        double ukuran, harga=0;

        System.out.println("Daftar Harga Toko Sepatu");
        System.out.println("Merk Sepatu :");
        System.out.println("1. Converse ");
        System.out.println("2. Sketchers ");
        System.out.println("3. Nike ");

        System.out.print("Pilih merk Sepatu apa yang di beli : ");
        merk = Absen18.nextLine();

        System.out.print("Berapa ukuran sepatu anda : ");
        ukuran = Absen18.nextDouble();
        System.out.println("--------------------------------------------");

        if (merk.equalsIgnoreCase("Converse")) {
            if (ukuran >= 36 && ukuran<=40) {
                harga = 800000;
                System.out.println("Kategori sepatu Slip On dengan harga Rp "+ harga);
            }
            else if (ukuran >= 40 && ukuran<=44) {
                harga = 1200000;
                System.out.println("Kategori sepatu High Top dengan harga Rp "+ harga);
            }else {
                System.out.println("Ukuran sepatu anda tidak tersedia!");
            }
        } else if (merk.equalsIgnoreCase("Sketchers")) {
            if (ukuran >= 36 && ukuran<=40) {
                harga = 1000000;
                System.out.println("Kategori sepatu untuk Pria/man dengan harga Rp "+ harga);
            }
            else if (ukuran >= 41 && ukuran<=44) {
                harga = 180000;
                System.out.println("Kategori sepatu untuk Wanita/woman dengan harga Rp "+ harga);
            }else {
                System.out.println("Ukuran sepatu anda tidak tersedia!");
            }
        } else if (merk.equalsIgnoreCase("Nike")) {
            if (ukuran >= 36 && ukuran<=40) {
                harga = 750000;
                System.out.println("Kategori sepatu untuk anak-anak/Kids dengan harga Rp "+ harga);
            }
            else if (ukuran >= 40 && ukuran<=44) {
                harga = 1500000;
                System.out.println("Kategori sepatu untuk Dewasa/Adult dengan harga Rp "+ harga);
            }else {
                System.out.println("Ukuran sepatu anda tidak tersedia!");
            }
        } else{
            System.out.println("Masukkan merk sepatu yang tersedia!");
        }
        Absen18.close();
    }
    
}