
/**
 *
 * @author roberto
 */
public final class Retangulo {

    private Retangulo() {
    }

    protected static double calcula(float b, float a) {
        double area = 0;
        if (b <= 0 || a <= 0) {
            System.out.println("Condicao de existencia de retangulo nao satisfeita");
        } else {
            area = b * a;
        }
        return area;
    }
}
