package lp2g49;

import java.util.GregorianCalendar;

/**
 *
 * @author roberto
 */
class Emprestimo {

    private GregorianCalendar dataEmprestimo;
    private GregorianCalendar dataDevolucao;
    private String codigoDoLivro;

    public Emprestimo(
            int yearEmp,
            int monthEmp,
            int dayOfMonthEmp,
            int yearDev,
            int monthDev,
            int dayOfMonthDev,
            String codigoDoLivro
    ) {
        this.dataEmprestimo
                = new GregorianCalendar(yearEmp, monthEmp, dayOfMonthEmp);
        this.dataDevolucao
                = new GregorianCalendar(yearDev, monthDev, dayOfMonthDev);
        this.codigoDoLivro = codigoDoLivro;
    }

    public GregorianCalendar getDataEmprestimo() {
        return dataEmprestimo;
    }

    public GregorianCalendar getDataDevolucao() {
        return dataDevolucao;
    }

    public String getCodigoDoLivro() {
        return codigoDoLivro;
    }
}
