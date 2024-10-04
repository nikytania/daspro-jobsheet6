import java.util.Scanner;

public class Pemilihan2Percobaan218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String member, jenis_pembayaran;
        int pilihanMenu, harga=0, jumlahBeli;
        double diskon=0, totalBayar=0;

        System.out.println("-----------------------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("-----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihanMenu = sc.nextInt();
        sc.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = sc.nextLine();
        System.out.println("--------------------------------------");

        if (member.equals("y")){ 
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            }else if (pilihanMenu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            }else if (pilihanMenu == 3){
                harga = 15000;
                System.out.println("Harga bundling: " + harga);

            }else{
                System.out.println("Masukkan pilihan menu dengan benar");
                return; 
            }
            
            System.out.print("Jenis pembayaran (tunai/QRIS): ");
            jenis_pembayaran = sc.nextLine();

            
            totalBayar = harga - (harga * diskon);
            System.out.println("Total bayar sebelum diskon QRIS: " + totalBayar);

             
            if (jenis_pembayaran.equals("QRIS")) {
                totalBayar -= 1000;
                System.out.println("Total bayar setelah diskon QRIS: " + totalBayar);
            } else {
                System.out.println("Total bayar: " + totalBayar);
            }
        }

        else if (member.equals("n")) { 
            if (pilihanMenu == 1) {
            harga = 14000;
                System.out.println("Harga ricebowl = " + harga);

            }else if (pilihanMenu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            }else if (pilihanMenu == 3){
                harga = 15000;
                System.out.println("Harga bundling: " + harga);

            }else{
                System.out.println("Masukkan pilihan menu dengan benar");
                return;  
            }

            System.out.print("Jenis pembayaran (tunai/QRIS): ");
            jenis_pembayaran = sc.nextLine();

            
            totalBayar = harga - (harga * diskon);
            System.out.println("Total bayar sebelum diskon QRIS: " + totalBayar);

             
            if (jenis_pembayaran.equals("QRIS")) {
                totalBayar -= 1000;
                System.out.println("Total bayar setelah diskon QRIS: " + totalBayar);
            } else {
                System.out.println("Total bayar: " + totalBayar);
            }
        }

        
        System.out.println("---------------------------------------------");
    
        sc.close();

    }
    
}
