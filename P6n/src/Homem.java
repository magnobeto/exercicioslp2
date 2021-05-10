
/**
 *
 * @author roberto
 */
public class Homem extends PessoaIMC {

    public Homem(
            String nome,
            String dataNascimento,
            double peso,
            double altura
    ) {
        super(nome, dataNascimento, peso, altura);
    }
    
    @Override
    public String resultIMC() {
        String resultado;
        double valorIMC = super.calculaIMC(super.getPeso(), super.getAltura());
        if (valorIMC < 20.7) {
            resultado = "Abaixo do peso ideal";
        } else if (20.7 <= valorIMC && valorIMC <= 26.4) {
            resultado = "Peso Ideal";
        } else {
            resultado = "Acima do peso Ideal";
        }
        return resultado;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nIMC: "
                + String.format(
                        "%.2f",
                        super.calculaIMC(super.getPeso(), super.getAltura()))
                + "   "
                + resultIMC();
    }
}
