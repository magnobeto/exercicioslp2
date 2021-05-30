package lp2g49;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Hashtable;

/**
 *
 * @author roberto
 */
public class Biblioteca {

    private Hashtable<String, Usuario> cadastroDeUsuario;
    private Hashtable<String, Livro> cadastroDeLivro;
    private String nomeDoArquivoUsuario;
    private String caminhoDoArquivoUsuario = "~\\P7n\\src\\" + nomeDoArquivoUsuario;
    private String nomeDoArquivoLivro;
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

    public void salvaArquivoUsuario(Hashtable lista, String nomeDoArquivo) {

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
    }
    
    public void salvaArquivoLivro(Hashtable lista, String nomeDoArquivo) {

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

    public void leArquivoUsuario(String nomeDoArquivo) {
             
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
    
    public void leArquivoLivro(String nomeDoArquivo) {
             
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
