
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

    public Comparator nomeC = new Comparator() {

        @Override
        public int compare(Object o1, Object o2) {
            PessoaIMC pessoa1, pessoa2;
            pessoa1 = (PessoaIMC) o1;
            pessoa2 = (PessoaIMC) o2;
            return pessoa1.getNome().toUpperCase().compareTo(pessoa2.getNome().toUpperCase());
        }
    };

    public Comparator pesoC = new Comparator() {

        @Override
        public int compare(Object o1, Object o2) {
            PessoaIMC pessoa1, pessoa2;
            double pf1, pf2;
            pessoa1 = (PessoaIMC) o1;
            pessoa2 = (PessoaIMC) o2;
            pf1 = pessoa1.getPeso();
            pf2 = pessoa2.getPeso();
            return (int) Math.round(pf1 - pf2);
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
                result = -1;
            } else if (pf2 < pf1) {
                result = 1;
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
            double pf1, pf2, result;
            pessoa1 = (PessoaIMC) o1;
            pessoa2 = (PessoaIMC) o2;
            pf1 = pessoa1.getImc();
            pf2 = pessoa2.getImc();
            if (pf1 < pf2) {
                result = -1;
            } else if (pf2 < pf1) {
                result = 1;
            } else {
                result = 0;
            }
            return (int) result;
        }
    };

    public Comparator generoC = new Comparator() {

        @Override
        public int compare(Object o1, Object o2) {
            PessoaIMC pessoa1, pessoa2;
            String genero1, genero2;
            pessoa1 = (PessoaIMC) o1;
            pessoa2 = (PessoaIMC) o2;
            int result;
            if (pessoa1 instanceof Homem) {
                result = -1;
            } else if (pessoa2 instanceof Mulher) {
                result = 1;
            } else {
                result = 0;
            }
            return result;
        }
    };

    public ArrayList ordena(int criterio) {
        switch (criterio) {
            case 1:
                Collections.sort(this.lista, nomeC);
                break;
            case 2:
                Collections.sort(this.lista, nomeC.reversed());
                break;
            case 3:
                Collections.sort(this.lista, pesoC);
                break;
            case 4:
                Collections.sort(this.lista, pesoC.reversed());
                break;
            case 5:
                Collections.sort(this.lista, alturaC);
                break;
            case 6:
                Collections.sort(this.lista, alturaC.reversed());
                break;
            case 7:
                Collections.sort(this.lista, imcC);
                break;
            case 8:
                Collections.sort(this.lista, imcC.reversed());
                break;
            case 9:
                Collections.sort(this.lista, generoC);
                break;
            case 10:
                Collections.sort(this.lista, generoC.reversed());
                break;
        }
        return this.lista;
    }
}
