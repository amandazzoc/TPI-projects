/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularquantossalariosminimos;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class CalcularQuantosSalariosMinimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double salarioMinimo = scan.nextInt();
        double salarioFuncionario = scan.nextInt();
        
        double qtdsal = salarioFuncionario/salarioMinimo;
        System.out.println("O funcionário recebe " + qtdsal + " salarios mínimos");
    }
    
}
