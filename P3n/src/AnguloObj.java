
/**
 *
 * @author roberto
 */
public class AnguloObj {

    private double arcoRad;

    public AnguloObj(double anguloEmGraus) {
        double anguloEmRads = converteAngulo(anguloEmGraus);
        this.arcoRad = anguloEmRads;
    }

    public double converteAngulo(double medidaEmGrausAngulo) {
        return Math.toRadians(medidaEmGrausAngulo);
    }

    public double funcaoSeno() {
        return Math.sin(arcoRad);
    }

    public double funcaoCosseno() {
        return Math.cos(arcoRad);
    }

    public double funcaoTangente() {
        return Math.tan(arcoRad);
    }

    public double funcaoCotangente() {
        return 1 / Math.tan(arcoRad);
    }

    @Override
    public String toString() {
        return "\nArco: " + String.format("%.2f",arcoRad)
                + "\nSeno: " + String.format("%.2f",funcaoSeno())
                + "\nCosseno: " + String.format("%.2f",funcaoCosseno())
                + "\nTangente: " + String.format("%.2f",funcaoTangente())
                + "\nCotangente: " + String.format("%.2f",funcaoCotangente());
    }
}
