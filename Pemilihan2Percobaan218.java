import java.util.Scanner;

public class Pemilihan2Percobaan218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String member;
        int pilihanMenu, harga=0, jumlahBeli;
        double diskon=0, totalBayar;

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

        if (member.equalsIgnoreCase("y")){ //Menggunakan equalsIgnoreCase uuntuk membandingkan string
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
                return; //Menghentikan eksekusi lebih lanjut jika pilihan salah 
            }
            // Menghitung total bayar setelah diskon
            totalBayar = harga - (harga*diskon);
            System.out.println("Total bayar setelah diskon = " + totalBayar);
        }

        else if (member.equalsIgnoreCase("n")) {//Menggunakan equalsIqnoreCase untuk membandingkan string
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
                return; //Menghentikan eksekusi lebih lanjut jika pilihan salah 
            }
            // Menghitung total bayar setelah diskon
            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("---------------------------------------------");
    
        sc.close();

    }
    
}
