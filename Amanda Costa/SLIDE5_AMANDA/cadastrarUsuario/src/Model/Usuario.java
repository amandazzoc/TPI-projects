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
    private String nome;
    private String login;
    private String senha;
    private String email;

    Conexao con = new Conexao();
    
    public Usuario() {
        this("", "", "", "");
    }

    public Usuario(String nome, String login, String senha, String email) {
   
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void cadastrarUsuario(){
        String sql;
        sql = "INSERT INTO Usuario(nome, login, senha, email) VALUES" +
                "('" + getNome() + "','" + getLogin() + "','" + getSenha() + "','" + getEmail() + "')";
        
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso...");
    }
    
    public ResultSet consultar(){
        ResultSet tabela;
        tabela = null;
        String sql = "SELECT * FROM Usuario";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
}
