package lp2g49;

import exception.CopiaNaoDisponivelEx;
import exception.NenhumaCopiaEmprestadaEx;
import java.util.ArrayList;

/**
 *
 * @author roberto
 */
public class Livro {

    private String codigo;
    private String titulo;
    private String categoria;
    private int quantidade;
    private int emprestados;
    private ArrayList historico = new ArrayList<EmprestadoPara>();

    public Livro(
            String codigo,
            String titulo,
            String categoria,
            int quantidade,
            int emprestados
    ) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.emprestados = emprestados;
    }

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
  
    public String getCodigo() {
        return codigo;
    }

    public void empresta() throws CopiaNaoDisponivelEx {
        if (emprestados == quantidade) {
            throw new CopiaNaoDisponivelEx(
                    "Nao tem copia disponivel para emprestimo."
            );
        } else {
            this.quantidade -= 1;
            this.emprestados += 1;
        }
    }

    public void devolve() throws NenhumaCopiaEmprestadaEx {
        if (emprestados == 0) {
            throw new NenhumaCopiaEmprestadaEx(
                    "Nenhuma copia emprestada."
            );
        } else {
            this.emprestados -= 1;
            this.quantidade += 1;
        }
    }

    public void addUsuarioHist(
            int yearEmp,
            int monthEmp,
            int dayOfMonthEmp,
            int yearDev,
            int monthDev,
            int dayOfMonthDev,
            String codigoUsuario
    ) {
        historico.add(
                new EmprestadoPara(
                        yearEmp,
                        monthEmp,
                        dayOfMonthEmp,
                        yearDev,
                        monthDev,
                        dayOfMonthDev,
                        codigoUsuario
                )
        );
    }
}
