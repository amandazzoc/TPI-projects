/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularquantidadecomprar;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class CalcularQuantidadeComprar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        
        System.out.println("Digite o nome do produto: ");
        String produto = scan.next();
        System.out.println("Digite a quantidade máxima do produto:");
        int quantidadeMaxima = scan.nextInt();
        System.out.println("Digite a quantidade do produto em estoque: ");
        int quantidadeEstoque = scan.nextInt();
        
        int quantidadeComprar = quantidadeMaxima - quantidadeEstoque;
        
        System.out.println("Comprar mais " + quantidadeComprar + " " + produto);
    }
    
}
