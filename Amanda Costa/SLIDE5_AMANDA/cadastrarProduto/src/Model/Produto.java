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
    
    public void cadastrarProduto(){
        String sql;
        sql = "INSERT INTO Produto(codigo, nomeProduto, descricao) VALUES" +
                "(" + getCodigo() + ",'" + getNomeProduto() + "','" + getDescricao() + "')";
        
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro Salvo com Sucesso...");
    }
    
    public ResultSet listarProduto(){
        ResultSet tabela;
        tabela = null;
        String sql = "SELECT * FROM Produto";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
}
