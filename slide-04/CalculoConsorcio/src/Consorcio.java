
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
public class Consorcio {
    private int numeroTotalPrestacoes;
    private int qtdPrestacoesPagas;
    private int valorPrestacao;
    private int saldoDevedor;
    private int totalPago;

    public Consorcio() {
        this(0,0,0,0,0);
    }

    public Consorcio(int numeroTotalPrestacoes, int qtdPrestacoesPagas, int valorPrestacao, int saldoDevedor, int totalPago) {
        this.numeroTotalPrestacoes = numeroTotalPrestacoes;
        this.qtdPrestacoesPagas = qtdPrestacoesPagas;
        this.valorPrestacao = valorPrestacao;
        this.saldoDevedor = saldoDevedor;
        this.totalPago = totalPago;
    }

    public int getNumeroTotalPrestacoes() {
        return numeroTotalPrestacoes;
    }

    public void setNumeroTotalPrestacoes(int numeroTotalPrestacoes) {
        this.numeroTotalPrestacoes = numeroTotalPrestacoes;
    }

    public int getQtdPrestacoesPagas() {
        return qtdPrestacoesPagas;
    }

    public void setQtdPrestacoesPagas(int qtdPrestacoesPagas) {
        this.qtdPrestacoesPagas = qtdPrestacoesPagas;
    }

    public int getValorPrestacao() {
        return valorPrestacao;
    }

    public void setValorPrestacao(int valorPrestacao) {
        this.valorPrestacao = valorPrestacao;
    }

    public int getSaldoDevedor() {
        return saldoDevedor;
    }

    public void setSaldoDevedor(int saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }

    public int getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(int totalPago) {
        this.totalPago = totalPago;
    }
    
    public void inserirValoresConsorcio(){
        setNumeroTotalPrestacoes(Integer.parseInt(JOptionPane.showInputDialog("Digite o número total de prestações: ")));
        setQtdPrestacoesPagas(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de prestações pagas: ")));
        setValorPrestacao(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da prestação: ")));
    }
    
    public void calcularTotalPago(){
        setTotalPago(getValorPrestacao() * getQtdPrestacoesPagas());
        JOptionPane.showMessageDialog(null, "O valor total a ser pago é de: R$" + getTotalPago());
    }
    
    public void calcularSaldoDevedor(){
        setSaldoDevedor((getNumeroTotalPrestacoes() * getValorPrestacao()) - getTotalPago());
        JOptionPane.showMessageDialog(null, "O saldo do devedor é de: R$" + getSaldoDevedor());
    }
    
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null, "Total Pago: R$" + getTotalPago() + 
                "\nSaldo do Devedor: R$" + getSaldoDevedor());
    }
}
