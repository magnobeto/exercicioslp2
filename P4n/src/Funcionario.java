
/**
 *
 * @author roberto
 */
public class Funcionario {

    private String nome;
    private String codigoDoFuncionario;
    private float salario;
    private float salarioLiquido;

    public Funcionario(String nome, String codigoDoFuncionario, float salario) {
        this.nome = nome;
        this.codigoDoFuncionario = codigoDoFuncionario;
        this.salario = salario;
        this.salarioLiquido = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoDoFuncionario() {
        return codigoDoFuncionario;
    }

    public void setCodigoDoFuncionario(String codigoDoFuncionario) {
        this.codigoDoFuncionario = codigoDoFuncionario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(float salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public float calculaSalario(float desconto) {
         salarioLiquido = salario - (salario * desconto);
         return getSalarioLiquido();
    }

    @Override
    public String toString() {
        return "Nome: " + nome
                + "\nCodigo: " + codigoDoFuncionario
                + "\nSalario Base: " + String.format("%.2f", salario);
    }
}
