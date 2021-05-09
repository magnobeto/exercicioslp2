
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author roberto
 */
public class P5nX {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        ArrayList<Pessoa> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o numero de pessoas: ");
            int quantPessoas = sc.nextInt();
            sc.nextLine();

            while (quantPessoas != 0) {

                try {
                    System.out.print("Inserir homem (h) ou mulher(m)? ");
                    String sexo = sc.nextLine().toLowerCase().substring(0, 1);

                    if ("h".equals(sexo) || "m".equals(sexo)) {
                        System.out.print("Digite o nome: ");
                        String nome = sc.nextLine();
                        System.out.print("Digite a data de nascimento: ");
                        String data = sc.nextLine();
                        System.out.print("Digite o peso: ");
                        double peso = sc.nextDouble();
                        System.out.print("Digite a altura (em metros): ");
                        double altura = sc.nextDouble();
                        sc.nextLine();
                        if ("h".equals(sexo)) {
                            lista.add(new Homem(nome, data, peso, altura));
                        } else {
                            lista.add(new Mulher(nome, data, peso, altura));
                        }
                    } else {
                        System.out.println("----- Opcao Invalida!!!");
                        quantPessoas += 1;
                    }
                    quantPessoas -= 1;
                } catch (InputMismatchException error) {
                    System.out.println("-----  Valor de entrada incompatível!!!");
                    sc.nextLine();
                }
            }

            for (Pessoa pessoa : lista) {
                System.out.println("---------");
                System.out.println(pessoa);
                System.out.println("---------");
            }
        } catch (InputMismatchException error) {
            System.out.println("-----  Valor de entrada incompatível!!!");
        }
        sc.close();
    }
}
