
/**
 *
 * @author roberto
 */
public class FuncExct extends Funcionario {

    private int numeroDeDependentes;
    private float salarioFamilia;
    private float valorPorDep = 9.58f;
    private float aliquotaIR = 0.15f;
    private float gratificacao;

    public FuncExct(
            String nome,
            String codigoDoFuncionario,
            float salario,
            int numeroDeDependentes,
            float gratificacao) {
        super(nome, codigoDoFuncionario, salario);
        this.numeroDeDependentes = numeroDeDependentes;
        this.gratificacao = gratificacao;
    }

    public int getNumeroDeDependentes() {
        return numeroDeDependentes;
    }

    public void setNumeroDeDependentes(int numeroDeDependentes) {
        this.numeroDeDependentes = numeroDeDependentes;
    }

    public float calculaSalario() {
        return super.calculaSalario(aliquotaIR);
    }

    public float calculaSalario(int numeroDeDependentes) {
        salarioFamilia = numeroDeDependentes * valorPorDep;
        float salarioBase = super.getSalario()
                + salarioFamilia + gratificacao;
        super.setSalario(salarioBase);
        return calculaSalario(aliquotaIR);
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + " (Executivo)"
                + "\nCodigo: " + super.getCodigoDoFuncionario()
                + "\nSalario Base: " + String.format("%.2f", super.getSalario())
                + "\nSalario Liquido: " 
                + String.format("%.2f",calculaSalario(numeroDeDependentes));
    }
}
