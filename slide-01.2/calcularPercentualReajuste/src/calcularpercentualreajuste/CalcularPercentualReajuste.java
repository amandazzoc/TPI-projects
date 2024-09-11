/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularpercentualreajuste;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class CalcularPercentualReajuste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double salarioMensal = scan.nextDouble();
        double percentualReajuste = scan.nextDouble();
        
        double novoSalario = salarioMensal + (salarioMensal * percentualReajuste)/100;
        
        System.out.println("Seu novo salário com o percentual de reajuste adicionado é: " + novoSalario);
    }
    
}
