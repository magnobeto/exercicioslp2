
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author roberto
 */
public class P3nX {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Quantos angulos deseja inserir? ");
            int quantAngulos = sc.nextInt();
            AnguloObj[] array = new AnguloObj[quantAngulos];

            for (int i = 0; i < array.length; i++) {
                int indice = i + 1;
                System.out.print("\nAngulo " + indice + ": ");
                double angulo = sc.nextDouble();
                array[i] = new AnguloObj(angulo);
            }

            System.out.print("\nResultado ===================");

            for (AnguloObj angulo : array) {
                System.out.println(angulo);
            }
        } catch (InputMismatchException error) {
            System.out.println("O valor de entrada nao eh um numero");
        }

    }
}
