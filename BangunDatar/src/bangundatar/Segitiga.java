
package bangundatar;
public class Segitiga extends Bangun {
    private double alas;
    private double tinggi;
    private double miring;
    public double getAlas() {
        return alas;
    }
    public void setAlas(double alas) {
        this.alas = alas;
    }
    public double getTinggi() {
        return tinggi;
    }
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    public double getMiring() {
        return miring;
    }
    public void setMiring(double miring) {
        this.miring = miring;
    }
    @Override
    public double keliling (){
        double kliling = miring+alas+tinggi;
        return kliling;
    }
    @Override
    public double luas (){
        double l = 0.5*(alas*tinggi);
        return l;
    }
}
