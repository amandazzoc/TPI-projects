
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
public class Produto {
    private String nome;
    private int quantidade;
    private double valor;
    private double total;
    Scanner scan = new Scanner(System.in);

    public Produto() {
        this("", 0, 0, 0);
    }

    public Produto(String nome, int quantidade, double valor, double total) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
        this.total = total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public void calcularTotal(){
        System.out.println("Digite o nome do produto: ");
        setNome(scan.next());
        System.out.println("Digite a quantidade comprada do produto: ");
        setQuantidade(scan.nextInt());
        System.out.println("Digite o valor do produto: ");
        setValor(scan.nextDouble());
        
        setTotal(getQuantidade() * getValor());
        System.out.println("O valor total da compra do produto " + getNome() + " é: R$" + getTotal());
    }
    
}
