/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularatraso;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class CalcularAtraso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor da parcela");
        double valorParcela = scan.nextDouble();
        System.out.println("Digite a taxa de juros");
        double taxaJuros = scan.nextDouble();
        System.out.println("Digite o tempo de atraso em meses");
        double tempo = scan.nextDouble();
        
        double valorAtraso = valorParcela + (valorParcela * (taxaJuros / 100) * tempo);
        
        System.out.println("O valor da parcela em atraso é de: R$" + valorAtraso);
    }
    
}
