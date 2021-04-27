
/**
 *
 * @author roberto
 */
public final class Triangulo {
    
    private Triangulo(){
    }

    protected static double calcula(float l1, float l2, float l3) {
        double area = 0;
        if (l1 <= 0 || l2 <= 0 || l3 <= 0) {
            System.out.println("Condicao de existencia de triangulo nao satisfeita");
        } else if (l1 == l2 && l2 == l3 && l1 == l3) {
            area = ((l1 * l1 * Math.sqrt(3)) / 4);
        } else if (l1 == l2 || l2 == l3 || l1 == l3) {
            if (l1 == l2) {
                area = (Math.sqrt(Math.pow(l1, 2.0) - Math.pow(l3 / 2, 2.0)) * l3) / 2;
            } else if (l2 == l3) {
                area = (Math.sqrt(Math.pow(l2, 2.0) - Math.pow(l1 / 2, 2.0)) * l1) / 2;
            } else {
                area = (Math.sqrt(Math.pow(l3, 2.0) - Math.pow(l2 / 2, 2.0)) * l2) / 2;
            }
        } else {
            double constanteEscalenoP;
            constanteEscalenoP = (l1 + l2 + l3) / 2;
            double mult = constanteEscalenoP
                    * (constanteEscalenoP - l1)
                    * (constanteEscalenoP - l2)
                    * (constanteEscalenoP - l3);
            area = Math.sqrt(mult);
        }
        return area;
    }

    protected static TipoDeTriangulo tipoDoTriangulo(float l1, float l2, float l3) {
        TipoDeTriangulo tipo;
        if (l1 == l2 && l2 == l3 && l1 == l3) {
            tipo = TipoDeTriangulo.Equilátero;
        } else if (l1 == l2 || l2 == l3 || l1 == l3) {
            tipo = TipoDeTriangulo.Isósceles;
        } else {
            tipo = TipoDeTriangulo.Escaleno;
        }
        return tipo;
    }
}
