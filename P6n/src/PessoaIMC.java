
/**
 *
 * @author roberto
 */
public abstract class PessoaIMC extends Pessoa {

    private double peso;
    private double altura;
    private double imc;

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
    
    public double getImc(){
        return imc;
    }

    public double calculaIMC (double peso, double altura) {
        this.imc = peso / Math.pow(altura, 2);
        return getImc();
    }
    
    public abstract String resultIMC();

    @Override
    public String toString() {
        return super.toString()
                + "\nPeso: " + peso
                + "\nAltura: " + altura;
    }
}
