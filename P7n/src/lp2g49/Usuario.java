package lp2g49;

import java.util.ArrayList;

/**
 *
 * @author roberto
 */
public class Usuario extends Pessoa {

    private String endereco;
    private String codigoUsuario;
    private ArrayList<Emprestimo> historico = new ArrayList();

    public Usuario(
            String nome,
            int year,
            int month,
            int dayOfMonth,
            String endereco,
            String codigoUsuario
    ) {
        super(nome, year, month, dayOfMonth);
        this.endereco = endereco;
        this.codigoUsuario = codigoUsuario;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public String getEndereco() {
        return endereco;
    }

    public ArrayList getHistorico() {
        return historico;
    }
    
    public void addLivroHist(
            int yearEmp,
            int monthEmp,
            int dayOfMonthEmp,
            int yearDev,
            int monthDev,
            int dayOfMonthDev,
            String codigoDoLivro
    ) {
        historico.add(
                new Emprestimo(
                        yearEmp,
                        monthEmp,
                        dayOfMonthEmp,
                        yearDev,
                        monthDev,
                        dayOfMonthDev,
                        codigoDoLivro
                )
        );
    }
}
