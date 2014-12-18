
package bangundatar;
public class SegiEmpat extends Bangun{
    private double pnj;
    private double lbr;

    public double getP() {
        return pnj;
    }

    public void setP(double pnj) {
        this.pnj = pnj;
    }

    public double getL() {
        return lbr;
    }

    public void setL(double lbr) {
        this.lbr = lbr;
    }
    @Override
    public double keliling (){
        double kliling = 2*(pnj+lbr);
        return kliling;
    }
    @Override
    public double luas (){
        double l = pnj*lbr;
        return l;
    }
}
