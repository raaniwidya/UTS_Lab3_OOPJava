// CONTOH CLASS
public class BilanganBulat {
    private int angka;

    // CONTOH CONSTRUCTOR
    public BilanganBulat() {
        this.angka = 0;
    }
    public BilanganBulat(int angka) {
        this.angka = angka;
    }

    // CONTOH SETTER METHOD
    public void setAngka(int angka) {
        if(angka < 0) {
            System.out.println("Angka tidak boleh negatif");
            System.exit(0);
        } else if(angka > 100) {
            System.out.println("Angka tidak lebih dari 100");
            System.exit(0);
        } else {
            this.angka = angka;
        }
    }

    // CONTOH OVERLOADING METHOD ANTARA METHOD SETANGKA
    public void setAngka(double angka) {
        if(angka < 0) {
            System.out.println("Angka tidak boleh negatif");
            System.exit(0);
        } else if(angka > 100) {
            System.out.println("Angka tidak lebih dari 100");
            System.exit(0);
        } else {
            this.angka = (int) angka;
        }
    }

    // CONTOH GETTER METHOD
    public int getAngka() {
        return angka;
    }

    public boolean isGanjil() {
        return angka % 2 != 0;
    }

    public boolean isGenap() {
        return angka % 2 == 0;
    }

    public boolean isPrima() {
        if (angka <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++) {
            if (angka % i == 0) {
                return false;
            }
        }
        return true;
    }
}
