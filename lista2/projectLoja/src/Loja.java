
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Loja {
    private String razaoSocial;
    private String cpfCliente;
    private double valorCompra;
    private double qtdItensComp;
    private double valorTotalCompra;
    Scanner scan = new Scanner(System.in);

    public Loja() {
        this("", "", 0, 0, 0);
    }

    public Loja(String razaoSocial, String cpfCliente, double valorCompra, double qtdItensComp, double valorTotalCompra) {
        this.razaoSocial = razaoSocial;
        this.cpfCliente = cpfCliente;
        this.valorCompra = valorCompra;
        this.qtdItensComp = qtdItensComp;
        this.valorTotalCompra = valorTotalCompra;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public double getQtdItensComp() {
        return qtdItensComp;
    }

    public void setQtdItensComp(double qtdItensComp) {
        this.qtdItensComp = qtdItensComp;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }
    
    public void inserirDadosLoja(){
        System.out.println("Digite a razão social da loja");
        setRazaoSocial(scan.next());
        System.out.println("Digite o cpf do cliente");
        setCpfCliente(scan.next());
        System.out.println("Digite o valor da compra");
        setValorCompra(scan.nextDouble());
        System.out.println("Digite a quantidade de itens comprados");
        setQtdItensComp(scan.nextDouble());
        
    }
    public String mostrarDadosLoja(){
        return "----------------------\nNota Fiscal\n----------------------\nRazão Social: " + getRazaoSocial() + "\nCPF do cliente: " + getCpfCliente() + "\nValor do produto: R$" + getValorCompra() + "\nQuantidade de itens comprados: " + getQtdItensComp() + "\n----------------------";
    }
    public double calcularCompraLoja(){
        setValorTotalCompra(getValorCompra() * getQtdItensComp());
        return getValorTotalCompra();
    }
}
