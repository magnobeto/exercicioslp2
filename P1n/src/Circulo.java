
/**
 *
 * @author roberto
 */
public final class Circulo {

    private Circulo() {
    }

    protected static double calcula(float r) {
        double area = 0;
        if (r <= 0) {
            System.out.println("Condicao de existencia de circulo nao satisfeita");
        } else {
            area = Math.PI * Math.pow(r, 2);
        }
        return area;
    }
}
