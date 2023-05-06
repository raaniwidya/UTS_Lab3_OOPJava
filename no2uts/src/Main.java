public class Main {
    public static void main(String[] args) {
        Reverse k1 = new Reverse("Pemrograman");
        System.out.println("Kata : " + k1.getKata());
        System.out.println("Reverse Perhuruf : " + k1.reverseHuruf());

        Reverse k2 = new Reverse("Pemrograman Berorientasi Objek");
        System.out.println("\nKata : " + k2.getKata());
        System.out.println("Reverse Perkata : " + k2.reverseKata());
    }
}