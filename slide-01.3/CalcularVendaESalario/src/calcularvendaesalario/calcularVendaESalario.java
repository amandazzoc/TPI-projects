/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularvendaesalario;

import java.util.Scanner;
/**
 *
 * @author fatec-dsm2
 */
public class calcularVendaESalario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int qtdVendas = scan.nextInt();
        int salario = (qtdVendas * 50) + 1000;
        System.out.println("Você vendeu " + qtdVendas + " móveis, logo seu salário total será de: R$" + salario);
    }
}

