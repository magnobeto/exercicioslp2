
/**
 *
 * @author roberto
 */
public class Mulher extends PessoaIMC {

    public Mulher(
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
        if (valorIMC < 19) {
            resultado = "Abaixo do peso ideal";
        } else if (19 <= valorIMC && valorIMC <= 25.8) {
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
