
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author amanda
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Consorcio cons = new Consorcio();
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite\n1-Inserir valores do consorcio\n2-Calcular total pago\n3-Calcular saldo do devedor\n4-Mostrar valores\n0-Sair"));
            switch(op){
                case 1:
                    cons.inserirValoresConsorcio();
                    break;
                case 2:
                    cons.calcularTotalPago();
                    break;
                case 3:
                    cons.calcularSaldoDevedor();
                    break;
                case 4:
                    cons.mostrarValores();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor Indisponível");
                    break;
            }
        }while(op != 0);
    }
    
}
