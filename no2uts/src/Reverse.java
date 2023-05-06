public class Reverse {

    private String kata;

    // Constructor
    public Reverse(String kata) {
        this.kata = kata;
    }

    public String getKata() {
        return kata;
    }

    // Method untuk membalikkan urutan karakter
    public String reverseHuruf() {
        StringBuilder builder = new StringBuilder(kata);
        builder.reverse();
        return builder.toString();
    }

    // Method untuk membalikkan urutan kata
    public String reverseKata() {
        String[] arrKata = kata.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = arrKata.length - 1; i >= 0; i--) {
            builder.append(arrKata[i]).append(" ");
        }
        return builder.toString().trim();
    }
}
