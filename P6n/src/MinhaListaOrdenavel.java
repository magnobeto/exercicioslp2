
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author roberto
 */
public class MinhaListaOrdenavel {

    private ArrayList<PessoaIMC> lista = new ArrayList();

    public void add(PessoaIMC p) {
        lista.add(p);
    }

    public PessoaIMC get(int i) {
        return lista.get(i);
    }

    public ArrayList<PessoaIMC> getLista() {
        return lista;
    }

    public Comparator pesoC = new Comparator() {

        @Override
        public int compare(Object o1, Object o2) {
            PessoaIMC pessoa1, pessoa2;
            double pf1, pf2;
            pessoa1 = (PessoaIMC) o1;
            pessoa2 = (PessoaIMC) o2;
            pf1 = pessoa1.getPeso();
            pf2 = pessoa2.getPeso();
            return (int) Math.round(pf2 - pf1);
        }
    };

    public Comparator alturaC = new Comparator() {

        @Override
        public int compare(Object o1, Object o2) {
            PessoaIMC pessoa1, pessoa2;
            double pf1, pf2, result;
            pessoa1 = (PessoaIMC) o1;
            pessoa2 = (PessoaIMC) o2;
            pf1 = pessoa1.getAltura();
            pf2 = pessoa2.getAltura();
            if (pf1 < pf2) {
                result = 1;
            } else if (pf2 < pf1) {
                result = -1;   
            } else {
                result = 0;
            }
            return (int) result;
        }
    };

    public Comparator imcC = new Comparator() {

        @Override
        public int compare(Object o1, Object o2) {
            PessoaIMC pessoa1, pessoa2;
            double pf1, pf2;
            pessoa1 = (PessoaIMC) o1;
            pessoa2 = (PessoaIMC) o2;
            pf1 = pessoa1.getImc();
            pf2 = pessoa2.getImc();
            return (int) Math.round(pf2 - pf1);
        }
    };

    public ArrayList ordena(int criterio) {
        switch (criterio) {
            case 3:
                Collections.sort(this.lista, pesoC);
            case 4:
                Collections.sort(this.lista, pesoC.reversed());
            case 5:
                Collections.sort(this.lista, alturaC);
            case 6:
                Collections.sort(this.lista, alturaC.reversed());
            case 7:
                Collections.sort(this.lista, imcC);
            case 8:
                Collections.sort(this.lista, imcC.reversed());
        }
        return this.lista;
    }
}
