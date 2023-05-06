import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih1,pilih2;
        double m, a, v, r, x, deltax, turunan;

        System.out.println("1. Matematika : Turunan Fungsi");
        System.out.println("2. Fisika : Gerak Sentripetal");
        System.out.println("Masukkan pilihan anda : ");
        pilih1 = input.nextInt();

        switch (pilih1){
            case 1:
                System.out.println("Rumus Turunan Fungsi x*x + 2*x + 1");
                System.out.println("Masukkan nilai x : ");
                x = input.nextDouble();
                System.out.println("Masukkan nilai delta x : ");
                deltax = input.nextDouble();
                Matematika matematika = new Matematika(x, deltax);
                turunan = matematika.hitungMatematika();
                System.out.println("Turunan fungsi x*x + 2*x + 1 adalah  " + turunan);
            break;
            case 2:
                System.out.println("Rumus Gerak Sentripetal");
                System.out.println("1. Bila diketahui massa dan percepatan");
                System.out.println("2. Bila diketahui massa, kelajuan dan jari-jari");
                System.out.println("Komponen yang tidak diketahui cukup isi dengan 0");
                System.out.println("Masukkan pilihan anda : ");
                pilih2 = input.nextInt();

                System.out.println("Masukkan massa (kg) : ");
                m = input.nextDouble();
                System.out.println("Masukkan percepatan (m/s^2) : ");
                a = input.nextDouble();
                System.out.println("Masukkan kelajuan (m/s) : ");
                v = input.nextDouble();
                System.out.println("Masukkan jari-jari (m) : ");
                r = input.nextDouble();
                Fisika fisika = new Fisika(m,a,v,r);

                        switch (pilih2){
                            case 1:
                                System.out.println("Hasil menggunakan rumus 1 : "+fisika.Hitung1() + " N");
                                break;

                            case 2:
                                System.out.println("Hasil menggunakan rumus 2 : "+fisika.Hitung2() + " N");
                        }
        }
    }
}