<<<<<<< HEAD
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
public class Produto {
    private int codigo;
    private String nomeProduto;
    private String descricao;
    
    Conexao con = new Conexao();

    public Produto() {
        this(0, "", "");
    }

    public Produto(int codigo, String nomeProduto, String descricao) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void cadastrarProduto() {
        String sql = "INSERT INTO produtos(codigo, nomeProduto, descricao) VALUES" +
                "(" + this.getCodigo() + ",'" + this.getNomeProduto() + "','" + this.getDescricao() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
    }    
    
    public ResultSet consultarProduto() {
        ResultSet tabela;
        tabela = null;
        
        String sql = "SELECT * FROM Produtos";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    public void excluirProduto(){
        String sql;
        sql = "DELETE FROM produtos WHERE codigo = " + getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
    
    public void alterarProduto() {
        String sql;
        sql = "UPDATE produtos SET nomeProduto='" + getNomeProduto() + "',descricao='" + getDescricao() + "' where codigo = " + getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
    }
}
=======
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
public class Produto {
    private int codigo;
    private String nomeProduto;
    private String descricao;
    
    Conexao con = new Conexao();

    public Produto() {
        this(0, "", "");
    }

    public Produto(int codigo, String nomeProduto, String descricao) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void cadastrarProduto() {
        String sql = "INSERT INTO produtos(codigo, nomeProduto, descricao) VALUES" +
                "(" + this.getCodigo() + ",'" + this.getNomeProduto() + "','" + this.getDescricao() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registrado com sucesso");
    }    
    
    public ResultSet consultarProduto() {
        ResultSet tabela;
        tabela = null;
        
        String sql = "SELECT * FROM Produtos";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
    public void excluirProduto(){
        String sql;
        sql = "DELETE FROM produtos WHERE codigo = " + getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro excluido com sucesso...");
    }
    
    public void alterarProduto() {
        String sql;
        sql = "UPDATE produtos SET nomeProduto='" + getNomeProduto() + "',descricao='" + getDescricao() + "' where codigo = " + getCodigo();
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro alterado com sucesso...");
    }
}
>>>>>>> 737bb3580865bbbd1311bc738dce9e7c4556f091
