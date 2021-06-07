package lp2g49;

import exception.CopiaNaoDisponivelEx;
import exception.LivroNaoCadastradoEx;
import exception.NenhumaCopiaEmprestadaEx;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author roberto
 */
public class Biblioteca {

    private Hashtable<String, Usuario> cadastroDeUsuario;
    private Hashtable<String, Livro> cadastroDeLivro;
    private String nomeDoArquivoUsuario;
    private String nomeDoArquivoLivro;
    private String caminhoDoArquivoUsuario = "~\\P7n\\src\\" + nomeDoArquivoUsuario;
    private String caminhoDoArquivoLivro = "~\\P7n\\src\\" + nomeDoArquivoLivro;

    public Biblioteca(Hashtable cadastroDeUsuario, Hashtable cadastroDeLivro) {
        this.cadastroDeUsuario = cadastroDeUsuario;
        this.cadastroDeLivro = cadastroDeLivro;
    }

    public Biblioteca() {

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivoUsuario))) {

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("================");

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivoLivro))) {

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void cadastraUsuario(Usuario usuario) {
        cadastroDeUsuario.put(usuario.getCodigoUsuario(), usuario);
    }

    public void cadastraLivro(Livro livro) {
        cadastroDeLivro.put(livro.getCodigo(), livro);
    }

    public void salvaArquivo(Hashtable lista, String nomeDoArquivo) {

        if (nomeDoArquivo.toLowerCase().contains("usuario")) {

            this.nomeDoArquivoUsuario = nomeDoArquivo;

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoDoArquivoUsuario))) {
                lista.forEach((k, v) -> {
                    Usuario usuario = (Usuario) v;
                    try {
                        bw.write(usuario.toString());
                        bw.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (nomeDoArquivo.toLowerCase().contains("livro")) {

            this.nomeDoArquivoLivro = nomeDoArquivo;

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoDoArquivoLivro))) {
                lista.forEach((k, v) -> {
                    Livro livro = (Livro) v;
                    try {
                        bw.write(livro.toString());
                        bw.newLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void leArquivo(String nomeDoArquivo) {

        if (nomeDoArquivo.toLowerCase().contains("usuario")) {

            this.nomeDoArquivoUsuario = nomeDoArquivo;

            try (BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivoUsuario))) {
                String line = br.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (nomeDoArquivo.toLowerCase().contains("livro")) {

            this.nomeDoArquivoLivro = nomeDoArquivo;

            try (BufferedReader br = new BufferedReader(new FileReader(caminhoDoArquivoLivro))) {
                String line = br.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void emprestaLivro(Usuario usuario, Livro livro) {
        try {
            livro.empresta();
        } catch (CopiaNaoDisponivelEx ex) {
            ex.getMessage();
        }

        GregorianCalendar calendar = new GregorianCalendar();
        int yearEmp = calendar.get(Calendar.YEAR);
        int monthEmp = calendar.get(Calendar.MONTH);
        int dayOfMonthEmp = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfMonthDev = dayOfMonthEmp + 3;

        usuario.addLivroHist(
                yearEmp,
                monthEmp,
                dayOfMonthEmp,
                yearEmp,
                monthEmp,
                dayOfMonthDev,
                livro.getCodigo()
        );
    }

    public void devolveLivro(Usuario usuario, Livro livro) {
        try {
            livro.devolve();
        } catch (NenhumaCopiaEmprestadaEx ex) {
            ex.getMessage();
        }

        GregorianCalendar calendar = new GregorianCalendar();
        int yearEmp = calendar.get(Calendar.YEAR);
        int monthEmp = calendar.get(Calendar.MONTH);
        int dayOfMonthEmp = calendar.get(Calendar.DAY_OF_MONTH);

        List<Emprestimo> lista = usuario.getHistorico();
        Emprestimo emprestimo = lista
                .stream()
                .findFirst()
                .filter(x -> x.getCodigoDoLivro().equals(livro.getCodigo()))
                .get();

        if (dayOfMonthEmp - emprestimo.getDataDevolucao().get(Calendar.DAY_OF_MONTH) > 3) {
            System.out.println("Você será multado por ter excedido a quantidade de dias em empréstimo");
        }
    }

    public String imprimeLivros() {
        String lista = this.cadastroDeLivro
                .entrySet()
                .stream()
                .sorted()
                .toString();
        return lista;
    }

    public String imprimeUsuarios() {
        String lista = this.cadastroDeUsuario
                .entrySet()
                .stream()
                .sorted()
                .toString();
        return lista;
    }

    public Livro getLivro(String codigo) {
        return this.cadastroDeLivro.get(codigo);
        //add try LivroNaoCadastradoEx
    }
    
    public Usuario getUsuario(String codigo) {
        return this.cadastroDeUsuario.get(codigo);
        //add try LivroNaoCadastradoEx
    }
}
