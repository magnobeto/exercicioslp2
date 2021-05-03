
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author roberto
 */
public class P4nX {

    ArrayList<Funcionario> funcList;
    static int n;

    public P4nX(int n) {
        this.funcList = new ArrayList<Funcionario>(n);
    }

    public void entDados() {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cadastro de Funcionários");

        for (int i = 0; i < n; i++) {
            System.out.print("\nContratado ou Executivo (c/e)? ");
            char tipoFuncionario = sc.next().charAt(0);
            sc.nextLine();

            if (tipoFuncionario == 'c') {
                System.out.print("Nome do Empregado: ");
                String nome = sc.nextLine();
                System.out.print("Codigo: ");
                String codigo = sc.nextLine();
                System.out.print("Salario: ");
                float salario = sc.nextFloat();
                System.out.print("Numero de Dependentes: ");
                int numeroDeDependentes = sc.nextInt();
                Funcionario funcionario = new FuncCntrd(nome, codigo, salario, numeroDeDependentes);
                funcList.add(funcionario);
            } else if (tipoFuncionario == 'e') {
                System.out.print("Nome do Empregado: ");
                String nome = sc.nextLine();
                System.out.print("Codigo: ");
                String codigo = sc.nextLine();
                System.out.print("Salario: ");
                float salario = sc.nextFloat();
                System.out.print("Numero de Dependentes: ");
                int numeroDeDependentes = sc.nextInt();
                System.out.print("Gratificacao: ");
                float gratificacao = sc.nextFloat();
                Funcionario funcionario = new FuncExct(nome, codigo, salario, numeroDeDependentes, gratificacao);
                funcList.add(funcionario);
            } else {
                System.out.println("O caracter nao eh uma das opcoes de escolha, tente novamente!");
            }
        }
        sc.close();
    }

    public void geraFolha() {
        System.out.println("\n\n--------Folha Salarial");
        for (Funcionario funcionario : funcList) {
            System.out.println("\n" + funcionario);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Quantos funcionarios? ");
            n = sc.nextInt();
            P4nX p = new P4nX(n);

            p.entDados();
            p.geraFolha();
        } catch (InputMismatchException error) {
            System.out.println("Esse parametro esta errado, verifique se esta trocando letra por numero");
        }
    }
}
