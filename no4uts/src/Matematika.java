public class Matematika {
    private double x;
    private double deltax;

    //CONSTRUCTOR
    public Matematika(double x, double deltax) {
        this.x = x;
        this.deltax = deltax;
    }

    public double hitungMatematika() {
        double fx = hitungFungsi(x);
        double fxdeltax = hitungFungsi(x + deltax);
        double turunan = (fxdeltax - fx) / deltax;
        return turunan;
    }

    public double hitungFungsi(double x) {
        double fungsi = x*x + 2*x + 1;

        return fungsi;
    }
}
