
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
public class Multiplicacao {
    private int valor;
    private int resultado;
    Scanner scan = new Scanner(System.in);

    public Multiplicacao() {
        this(0,0);
    }

    public Multiplicacao(int valor, int resultado) {
        this.valor = valor;
        this.resultado = resultado;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public int multiplicacao4(){
        System.out.println("Digite um número para ser multiplicado por 4: ");
        setValor(scan.nextInt());
        setResultado(getValor()*4);
        return getResultado();
    }
    public void mostrarMultiplicacao(){
        System.out.println("O resultado da multiplicacao é: "+ multiplicacao4());
    }
}
