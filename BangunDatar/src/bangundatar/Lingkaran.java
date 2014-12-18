
package bangundatar;

public class Lingkaran extends Bangun{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    @Override
    public double keliling (){
        double kliling = 2*3.14*r;
        return kliling;
    }
    @Override
    public double luas (){
        double l = 3.14*(Math.pow(r, 2));
        return l;
    }
}
