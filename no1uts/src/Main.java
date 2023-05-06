//Class adalah sebuah blueprint atau rancangan yang mendefinisikan sebuah objek.
//Class berisi data dan fungsi atau metode yang terkait dengan objek tersebut.
//Dalam class, dapat menentukan properti atau atribut dari objek dan perilaku atau fungsi yang dapat dilakukan oleh objek tersebut.

//Object adalah sebuah hasil blueprint atau realisasi dari sebuah class.
//Setiap object dibangun dari sekumpulan attribute yang disebut variabel untuk menjabarkan karakteristik khusus dari objek.
//Juga terdiri dari sekumpulan method yang menjabarkan tingkah laku object.

//Constructor adalah yang dipanggil pada saat pembentukan objek dan berfungsi untuk memberikan nilai inisial pada variable objek.
//Setiap class pada OOP dapat memiliki satu atau lebih constructor.
//Constructor biasanya memiliki nama yang sama dengan nama class-nya, dan tidak mengembalikan nilai apapun.

//Overloading method adalah salah satu konsep dalam paradigma pemrograman berorientasi objek (OOP) yang memungkinkan kita untuk mendefinisikan dua atau lebih method dengan nama yang sama di dalam sebuah class.
//Tetapi jumlah dan tipedata argumennya haruslah berbeda satu dengan lainnya.
//Method yang digunakan adalah method yang dimiliki variabel inputan yang sesuai dengan ketentuan variable method tersebut.

//Method setter dan getter adalah dua method yang umum digunakan dalam paradigma pemrograman berorientasi objek (OOP) untuk mengakses dan mengubah nilai properti atau atribut dari sebuah objek.
//Setter method adalah method yang digunakan untuk mengubah nilai dari properti atau atribut objek.
//Getter method adalah method yang digunakan untuk mengambil nilai dari properti atau atribut objek.
//Setter method biasanya memiliki nama yang diawali dengan kata "set", Getter method biasanya memiliki nama yang diawali dengan kata "get".

public class Main {
    public static void main(String[] args) {
        BilanganBulat bil1 = new BilanganBulat();

        bil1.setAngka(5);

        System.out.println("Bilangan 1: " + bil1.getAngka());
        System.out.println("Ganjil? " + bil1.isGanjil());
        System.out.println("Genap? " + bil1.isGenap());
        System.out.println("Prima? " + bil1.isPrima());

        BilanganBulat bil2 = new BilanganBulat(10);

        bil2.setAngka(7);

        System.out.println("\nBilangan 2: " + bil2.getAngka());
        System.out.println("Ganjil? " + bil2.isGanjil());
        System.out.println("Genap? " + bil2.isGenap());
        System.out.println("Prima? " + bil2.isPrima());
    }
}