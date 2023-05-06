public class Fisika {
    private double f, m, a, v, r;

    // CONSTRUCTOR
    public Fisika(double m, double a, double v, double r ){
        this.m = m;
        this.a = a;
        this.v = v;
        this.r = r;
    }

    public double Hitung1(){
        f = m * a;
        return f;
    }
    //OVERLOADING METHOD
    public double Hitung1(int a){
        f = m * a;
        return f;
    }

    public double Hitung2(){
        f = m * ((v * v) / r);
        return f;
    }
}
