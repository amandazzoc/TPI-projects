
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
public class Dobro {
    private double numero;
    private double calculo;
    Scanner scan = new Scanner(System.in);

    public Dobro() {
        this(0, 0);
    }

    public Dobro(double numero, double calculo) {
        this.numero = numero;
        this.calculo = calculo;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getCalculo() {
        return calculo;
    }

    public void setCalculo(double calculo) {
        this.calculo = calculo;
    }
    
    public void calcularDobro(){
        System.out.println("Digite o número: ");
        setNumero(scan.nextDouble());
        
        setCalculo(getNumero() * 2);
        System.out.println("O dobro do número " + getNumero() + " é: " + getCalculo());
    }
    
}
