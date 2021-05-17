package lp2g49;

import java.util.GregorianCalendar;

/**
 *
 * @author roberto
 */
public class Pessoa {
    
    private String nome;
    private GregorianCalendar dateNasc;
    
    public Pessoa (String nome, int year, int month, int dayOfMonth) {
        this.nome = nome;
        this.dateNasc = new GregorianCalendar(year, month, dayOfMonth);
    }
}
