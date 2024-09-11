/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularvalorabastecimento;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class CalcularValorAbastecimento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual produto foi comprado?");
        String produto = scan.next();
        System.out.println("Quantas unidades de " + produto + "s foi comprado?");
        int quantidade = scan.nextInt();
        System.out.println("Qual o valor unitário desse produto?");
        double preco = scan.nextDouble();
        
        double total = quantidade * preco;
        
        System.out.println("Valor final da compra do(a) "+ produto+ ": R$" + total);
    }
    
}
