import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner Absen18 = new Scanner(System.in);

        String jenisBuku;
        double diskon = 0, totalHarga = 0, totalDiskon = 0;
        int jumlahBuku, hargaKamus = 15000, hargaNovel = 10000, hargaBukuLain= 5000;

        System.out.print("Masukkan jenis buku (Novel/Kamus/Buku Lain): ");
        jenisBuku = Absen18.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        jumlahBuku = Absen18.nextInt();

    

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku > 2) {
                diskon = 0.10 + 0.02;
            } else {
                diskon = 0.10; 
            }
            totalDiskon = hargaKamus * jumlahBuku * diskon;
            totalHarga = hargaKamus * jumlahBuku - totalDiskon;

        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku > 3) {
                diskon = 0.07 + 0.02; 
            } else {
                diskon = 0.07 + 0.01; 
            }
            totalDiskon = hargaNovel * jumlahBuku * diskon;
            totalHarga = hargaNovel * jumlahBuku - totalDiskon;

        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05; 
            } else {
                diskon = 0; 
            }
            totalDiskon = hargaBukuLain * jumlahBuku * diskon;
            totalHarga = hargaBukuLain * jumlahBuku - totalDiskon;
        }

        System.out.println("Total diskon yang diterima: " + totalDiskon);
        System.out.println("Total harga untuk " + jumlahBuku + " buku " + jenisBuku + ": " + totalHarga);
        

        Absen18.close();;
    }
}