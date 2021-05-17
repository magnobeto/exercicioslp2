package lp2g49;

import java.util.GregorianCalendar;
/**
 *
 * @author roberto
 */
public class EmprestadoPara {
    
    private GregorianCalendar dataEmprestimo;
    private GregorianCalendar dataDevolucao;
    private String codigoUsuario;

    public EmprestadoPara(
            int yearEmp,
            int monthEmp,
            int dayOfMonthEmp,
            int yearDev,
            int monthDev,
            int dayOfMonthDev,
            String codigoUsuario
    ) {
        this.dataEmprestimo
                = new GregorianCalendar(yearEmp, monthEmp, dayOfMonthEmp);
        this.dataDevolucao
                = new GregorianCalendar(yearDev, monthDev, dayOfMonthDev);
        this.codigoUsuario = codigoUsuario;
    }
    
}
