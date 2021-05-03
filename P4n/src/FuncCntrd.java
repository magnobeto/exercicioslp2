
/**
 *
 * @author roberto
 */
public class FuncCntrd extends Funcionario {

    private int numeroDeDependentes;
    private float salarioFamilia;
    private float valorPorDep = 9.58f;
    private float aliquotaIR = 0.15f;

    public FuncCntrd(
            String nome,
            String codigoDoFuncionario,
            float salario,
            int numeroDeDependentes) {
        super(nome, codigoDoFuncionario, salario);
        this.numeroDeDependentes = numeroDeDependentes;
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
                + salarioFamilia;
        super.setSalario(salarioBase);
        return calculaSalario(aliquotaIR);
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nSalario Liquido: " 
                + String.format("%.2f",calculaSalario(numeroDeDependentes));
    }
}
