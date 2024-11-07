
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
        CustoPiso piso = new CustoPiso();
        int op;
        do{
            
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite\n1-Inserir valores do comodo\n2-Calcular preço por area\n3-Mostrar valores\n0-Sair"));
            
            switch(op){
                case 1:
                    piso.inserirValores();
                    break;
                case 2:
                    piso.calcularPrecoArea();
                    break;
                case 3:
                    piso.mostrarValores();
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
