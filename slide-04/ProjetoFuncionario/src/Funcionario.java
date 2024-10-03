
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author amanda
 */
public class Funcionario {
    private String nomeFuncionario;
    private String telefoneFuncionario;
    private String enderecoFuncionario;
    private double salarioHora;
    private double salarioFinal;

    public Funcionario() {
        this("", "", "", 0.0, 0.0);
    }

    public Funcionario(String nomeFuncionario, String telefoneFuncionario, String enderecoFuncionario, double salarioHora, double salarioFinal) {
        this.nomeFuncionario = nomeFuncionario;
        this.telefoneFuncionario = telefoneFuncionario;
        this.enderecoFuncionario = enderecoFuncionario;
        this.salarioHora = salarioHora;
        this.salarioFinal = salarioFinal;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

    public String getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public void setEnderecoFuncionario(String enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public double getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(double salarioFinal) {
        this.salarioFinal = salarioFinal;
    }
    
    public void cadastrarFuncionario(){
        setNomeFuncionario(JOptionPane.showInputDialog("Digite o nome do funcionario: "));
        setTelefoneFuncionario(JOptionPane.showInputDialog("Digite o telefone do funcionario :"));
        setEnderecoFuncionario(JOptionPane.showInputDialog("Digite o endereço do funcionario :"));
        setSalarioHora(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora de trabalho do funcionário: ")));
    }
    
    public void calcularSalarioFinal(int hrTrab){
        setSalarioFinal(hrTrab * getSalarioHora());
        JOptionPane.showMessageDialog(null, "O salário final do funcionario " + getNomeFuncionario() + " é de R$" + getSalarioFinal());
    }
    
    public void listarFuncionario(){
        JOptionPane.showMessageDialog(null, "Nome: " + getNomeFuncionario() +
                "\nTelefone: " + getTelefoneFuncionario() +
                "\nEndereço: " + getEnderecoFuncionario() +
                "\nValor da hora: R$" + getSalarioHora() +
                "\n------------------------" +
                "\nSalario Final: R$" + getSalarioFinal());
    }
}
