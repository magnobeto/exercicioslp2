
import java.util.Scanner;

/**
 *
 * @author roberto
 */
public class P2nX {

    public static void main(String[] args) {

        try {
            System.out.printf("Seno: %.2f \n", Angulo.funcaoSeno(Double.parseDouble(args[0])));
            System.out.printf("Cosseno: %.2f \n", Angulo.funcaoCosseno(Double.parseDouble(args[0])));
            System.out.printf("Tangente: %.2f \n", Angulo.funcaoTangente(Double.parseDouble(args[0])));
            System.out.printf("Cotangente: %.2f \n", Angulo.funcaoCotangente(Double.parseDouble(args[0])));
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println("Nao foi passado nenhum argumento de entrada para fazer os calculos.");
        }

        Scanner sc = new Scanner(System.in);
        String angulo = "1";

        while (!angulo.isEmpty()) {
            System.out.print("\nDigite uma medida em graus do angulo: ");
            angulo = sc.nextLine();

            if (!angulo.isEmpty()) {
                try {
                    System.out.printf("Seno: %.2f \n", Angulo.funcaoSeno(Double.parseDouble(angulo)));
                    System.out.printf("Cosseno: %.2f \n", Angulo.funcaoCosseno(Double.parseDouble(angulo)));
                    System.out.printf("Tangente: %.2f \n", Angulo.funcaoTangente(Double.parseDouble(angulo)));
                    System.out.printf("Cotangente: %.2f \n", Angulo.funcaoCotangente(Double.parseDouble(angulo)));
                } catch (NumberFormatException error) {
                    System.out.println("O valor de entrada nao eh um numero ou contem espacos entre os caracteres.");
                }

            }

        }

    }

}
