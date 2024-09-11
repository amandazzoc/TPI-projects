/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularvalortotal;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class CalcularValorTotal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite nome, o valor e a quantidade comprada do primeiro produto, um abaixo do outro");
        String produto1 = scan.next();
        double valor1 = scan.nextDouble();
        int quantidade1 = scan.nextInt();
        
        System.out.println("Digite nome, o valor e a quantidade comprada do segundo produto, um abaixo do outro");
        String produto2 = scan.next();
        double valor2 = scan.nextDouble();
        int quantidade2 = scan.nextInt();
        
        System.out.println("Digite nome, o valor e a quantidade comprada do terceiro produto, um abaixo do outro");
        String produto3 = scan.next();
        double valor3 = scan.nextDouble();
        int quantidade3 = scan.nextInt();
        
        double valorProduto1 = valor1 * quantidade1;
        double valorProduto2 = valor2 * quantidade2;
        double valorProduto3 = valor3 * quantidade3;
        
        double valorTotal = valorProduto1 + valorProduto2 + valorProduto3;
        
        System.out.println("---------------------------------");
        System.out.println(produto1 + ":_______ R$" + valorProduto1);
        System.out.println(produto2 + ":_______ R$" + valorProduto2);
        System.out.println(produto3 + ":_______ R$" + valorProduto3);
        System.out.println("Valor total:_______ R$" + valorTotal);
        System.out.println("---------------------------------");
    }
    
}
