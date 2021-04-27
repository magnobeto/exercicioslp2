
/**
 *
 * @author roberto
 */
public class P1nX {

    public static void main(String[] args) {

        double area;
        TipoDeTriangulo tipo;

        try {
            if (args.length == 1) {
                area = Circulo.calcula(Float.parseFloat(args[0]));
                if (area != 0) {
                    System.out.printf("A area do circulo e': %.2f unidades de area \n", area);
                }
            } else if (args.length == 2) {
                area = Retangulo.calcula(Float.parseFloat(args[0]), Float.parseFloat(args[1]));
                if (area != 0) {
                    System.out.printf("A area do retangulo e': %.2f unidades de area \n", area);
                }
            } else if (args.length == 3) {
                area = Triangulo.calcula(Float.parseFloat(args[0]), Float.parseFloat(args[1]), Float.parseFloat(args[2]));
                tipo = Triangulo.tipoDoTriangulo(Float.parseFloat(args[0]), Float.parseFloat(args[1]), Float.parseFloat(args[2]));
                if (area != 0) {
                    System.out.printf("A area do triangulo e': %.2f unidades de area \n", area);
                    System.out.println("O triangulo e' do tipo: " + tipo);
                }

            } else if (args.length > 3) {
                System.out.println("Numero de argumentos excessivo");
            } else {
                System.out.println("Numero de argumentos insuficientes");
            }
        } catch (NumberFormatException error) {
            System.out.println("Um ou mais argumentos nao eh numero");
        }
    }
}
