import java.util.Scanner;

public class Pemilihan2Percobaan118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tahun;

        System.out.print("Masukkan Tahun: ");
        tahun = sc.nextInt();

        if ((tahun % 4) == 0){
            if((tahun % 100) != 0)
            System.out.println("Tahun Kabisat: ");
            else{
            System.out.println("Bukan Tahun Kabisat !! ");
            }
        }else{
            System.err.println("Bukan Tahun Kabisat");
        }

    
            sc.close();

    }
}
