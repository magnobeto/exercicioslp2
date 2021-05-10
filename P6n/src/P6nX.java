
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author roberto
 */
public class P6nX {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH);
        MinhaListaOrdenavel lista = new MinhaListaOrdenavel();
        Scanner sc = new Scanner(System.in);
        int decisao = 1;
        int escolha;

        Homem pessoa1 = new Homem("Roberto", "18/12/1992", 84.5, 1.76);
        Homem pessoa2 = new Homem("Magno", "15/02/1978", 94.5, 1.87);
        Homem pessoa3 = new Homem("Campos", "12/01/1982", 74.5, 1.77);
        Homem pessoa4 = new Homem("Silva", "12/11/1991", 88.5, 1.83);
        Homem pessoa5 = new Homem("Carlos", "28/08/1992", 77.5, 1.75);
        Mulher pessoa6 = new Mulher("Bruna", "08/05/1986", 64.5, 1.66);
        Mulher pessoa7 = new Mulher("Dani", "27/05/1981", 74.5, 1.65);
        Mulher pessoa8 = new Mulher("Manuella", "12/11/1999", 61.5, 1.70);
        Mulher pessoa9 = new Mulher("Giovanna", "26/02/1994", 60.5, 1.66);
        Mulher pessoa10 = new Mulher("Carla", "08/08/1986", 77.5, 1.67);

        lista.add(pessoa1);
        lista.add(pessoa2);
        lista.add(pessoa3);
        lista.add(pessoa4);
        lista.add(pessoa5);
        lista.add(pessoa6);
        lista.add(pessoa7);
        lista.add(pessoa8);
        lista.add(pessoa9);
        lista.add(pessoa10);

        while (decisao == 1) {
            System.out.println("1. Imprimir Lista");
            System.out.println("2. Sair");
            System.out.print("Digite sua opcao: ");
            decisao = sc.nextInt();
            if (decisao == 1) {
                System.out.println("Escolha seu modo de ordenacao: ");
                System.out.println("1. Alfabetica (A-Z)");
                System.out.println("2. Alfabetica (Z-A)");
                System.out.println("3. Menor Peso");
                System.out.println("4. Maior Peso");
                System.out.println("5. Menor Altura");
                System.out.println("6. Maior Altura");
                System.out.println("7. Menor IMC");
                System.out.println("8. Maior IMC");
                System.out.print("Digite sua opcao: ");
                escolha = sc.nextInt();
                lista.ordena(escolha);
                for (PessoaIMC pessoa : lista.getLista()){
                    System.out.println("\n" + pessoa.getAltura());
                }
                System.out.println();

            } else if (decisao == 2) {
                break;
            }

        }
        sc.close();
    }
}
