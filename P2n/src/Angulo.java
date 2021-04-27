
/**
 *
 * @author roberto
 */
public class Angulo {

    public static double converteAngulo(double medidaEmGrausAngulo) {
        return Math.toRadians(medidaEmGrausAngulo);
    }

    public static double funcaoSeno(double medidaEmGrausAngulo) {
        double anguloEmRadianos = converteAngulo(medidaEmGrausAngulo);
        return Math.sin(anguloEmRadianos);
    }

    public static double funcaoCosseno(double medidaEmGrausAngulo) {
        double anguloEmRadianos = converteAngulo(medidaEmGrausAngulo);
        return Math.cos(anguloEmRadianos);
    }

    public static double funcaoTangente(double medidaEmGrausAngulo) {
        double anguloEmRadianos = converteAngulo(medidaEmGrausAngulo);
        return Math.tan(anguloEmRadianos);
    }

    public static double funcaoCotangente(double medidaEmGrausAngulo) {
        double anguloEmRadianos = converteAngulo(medidaEmGrausAngulo);
        return 1 / Math.tan(anguloEmRadianos);
    }
}
