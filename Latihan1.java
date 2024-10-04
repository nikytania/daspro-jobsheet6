public class Latihan1 {
    public static void main(String[] args) {

        int bil1 = 28, bil2 = 54, bil3 = 15;

        if (bil1>bil2) {
            if (bil1>bil3) {
                System.out.println("bilangan terbesar = 28");
            } else {
                System.out.println("bilangan terbesar = 15");
            }    
        } else if (bil2>bil3) {
            System.out.println("bilangan terbesar = 54");
        } else {
            System.out.println("bilangan terbesar = 15");
        }
        
    }
}