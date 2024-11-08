/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Controller.Conexao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fatec-dsm2
 */
public class Usuario {
    private String login;
    private String senha;
    Conexao con = new Conexao();

    public Usuario() {
        
    }

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public ResultSet logar(){
        ResultSet tabela;
        tabela = null;
        
        String sql = "select * from usuario where login='" + getLogin() + "' and senha= '" + getSenha() + "' ";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    public void cadastrar() {
        String sql = "Insert into usuario(senha, login)values "
                + "('" + this.getSenha()+ "', '" + this.getLogin() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
    }
}
