
/**
 *
 * @author roberto
 */
public abstract class PessoaIMC extends Pessoa {

    private double peso;
    private double altura;

    public PessoaIMC(
            String nome,
            String dataNascimento,
            double peso,
            double altura
    ) {
        super(nome, dataNascimento);
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calculaIMC (double peso, double altura) {
        return peso / Math.pow(altura, 2);
    }
    
    public abstract String resultIMC();

    @Override
    public String toString() {
        return super.toString()
                + "\nPeso: " + peso
                + "\nAltura: " + altura;
    }
}
