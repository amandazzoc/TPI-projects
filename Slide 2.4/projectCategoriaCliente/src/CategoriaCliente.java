
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
public class CategoriaCliente {
    private String nome;
    private double numeroConta;
    private double saldoMedio;
    Scanner scan = new Scanner(System.in);

    public CategoriaCliente() {
        this("", 0, 0);
    }

    public CategoriaCliente(String nome, double numeroConta, double saldoMedio) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldoMedio = saldoMedio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoMedio() {
        return saldoMedio;
    }

    public void setSaldoMedio(double saldoMedio) {
        this.saldoMedio = saldoMedio;
    }
    
    public void verificarSaldo(){
        System.out.println("Digite seu nome");
        setNome(scan.next());
        System.out.println("Digite o número da conta");
        setNumeroConta(scan.nextDouble());
        System.out.println("Digite seu saldo medio");
        setSaldoMedio(scan.nextDouble());
        
        if(getSaldoMedio() < 1000){
            System.out.println("-----------------------\nCliente Comum");
        }else if(getSaldoMedio() >= 1000 && getSaldoMedio() < 2500){
            System.out.println("-----------------------\nCliente Prata");
        }else{
            System.out.println("-----------------------\nCliente Ouro");
        }
        System.out.println("-----------------------\nSaldo Medio: " + getSaldoMedio());
    }
}
