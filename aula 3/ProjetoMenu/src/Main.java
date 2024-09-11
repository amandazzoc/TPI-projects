
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caixa caixa = new Caixa();
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite \n1-Depositar\n2-Sacar\n3-Consultar Saldo\n0-Sair"));
            
            switch(op){
                case 1:
                    caixa.depositar();
                    break;
                case 2:
                    caixa.sacar();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saldo Atual: R$" + caixa.mostrarSaldo());
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }while(op != 0);
    }
    
}
