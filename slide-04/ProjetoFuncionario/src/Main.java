
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
        Funcionario func = new Funcionario();
        
        int op;
        
        do{
            
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite\n1-Cadastrar funcionario\n2-Calcular salário\n3-Listar funcionário\n0-Sair"));
            
            switch(op){
                case 1:
                    func.cadastrarFuncionario();
                    break;
                case 2:
                    int horastrab;
                    horastrab = Integer.parseInt(JOptionPane.showInputDialog("Digite as horas trabalhadas do funcionario: "));
                    func.calcularSalarioFinal(horastrab);
                    break;
                case 3:
                    func.listarFuncionario();
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
