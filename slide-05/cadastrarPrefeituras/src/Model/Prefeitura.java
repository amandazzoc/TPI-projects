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
public class Prefeitura {
    private int codigo;
    private String nomePrefeitura;
    private String cidade;
    
    Conexao con = new Conexao();

    public Prefeitura() {
        this(0, "", "");
    }

    public Prefeitura(int codigo, String nomePrefeitura, String cidade) {
        this.codigo = codigo;
        this.nomePrefeitura = nomePrefeitura;
        this.cidade = cidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomePrefeitura() {
        return nomePrefeitura;
    }

    public void setNomePrefeitura(String nomePrefeitura) {
        this.nomePrefeitura = nomePrefeitura;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public void Gravar(){
        String sql;
        sql = "INSERT INTO Prefeitura(codigo, nomePrefeitura, cidade) VALUES" +
                "(" + getCodigo() + ",'" + getNomePrefeitura() + "','" + getCidade() + "')";
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Registro salvo com sucesso...");
    }
    
    public ResultSet listarPrefeitura(){
        ResultSet tabela;
        tabela = null;
        String sql = "SELECT * FROM Prefeitura";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
    
}
