/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import utils.Conexao;

public class Cliente {
    private String cpf;
    private String nome;
    private String email;
    private String numcartao;
    
    
    
    public boolean salvar(){
       String sql = "insert into cliente(cpf,email,nome, numcartao)";
                  sql += "values(?,?,?,?)";
       Connection con = Conexao.conectar();
       
       try {
           PreparedStatement stm = con.prepareStatement(sql);
           stm.setString(1, this.cpf);
           stm.setString(2, this.email);
           stm.setString(3, this.nome);
           stm.setString(4, this.numcartao);
           
           stm.execute();           
       } catch (SQLException ex) {
           System.out.println("Erro: " + ex.getMessage());
           return false;
       }        
       return true;
   }

    public boolean alterar(){
       Connection con = Conexao.conectar();
       String sql = "update cliente set ";
              sql +="nome = ?,";
              sql +="email = ?,";
              sql +="numcartao = ?";
              sql +=" where cpf = ?";
       try {
           PreparedStatement stm = con.prepareStatement(sql);
           stm.setString(1, this.nome);
           stm.setString(2, this.email);
           stm.setString(3, this.numcartao);
           stm.setString(4, this.cpf);
           
           stm.execute();           
       } catch (SQLException ex) {
           System.out.println("Erro: " + ex.getMessage());
           return false;
       }        
       return true;
   } 
    
    
    public Cliente consultar(String pCpf){
      Connection con = Conexao.conectar();
      String sql = "select cpf, nome, email, numcartao"
                 + " from cliente where cpf = ?";
      Cliente cliente = null;
       try {
           PreparedStatement stm = con.prepareStatement(sql);
           stm.setString(1, pCpf);
           ResultSet rs = stm.executeQuery();
           if(rs.next()){
             cliente = new Cliente();
             cliente.setCpf(pCpf);
             cliente.setNome(rs.getString("nome"));
             cliente.setEmail(rs.getString("email"));
             cliente.setNumcartao(rs.getString("numcartao"));            
           }
           
       } catch (SQLException ex) {
           System.out.println("Erro: " + ex.getMessage());
       }      
     return cliente;  
   }  

    public boolean excluir(){
       Connection con = Conexao.conectar();
       String sql = "delete from cliente ";
              sql +=" where cpf = ?";
       try {
           PreparedStatement stm = con.prepareStatement(sql);
           stm.setString(1, this.cpf);
           stm.execute();           
       } catch (SQLException ex) {
           System.out.println("Erro: " + ex.getMessage());
           return false;
       }        
       return true;
   }
  
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumcartao() {
        return numcartao;
    }

    public void setNumcartao(String numcartao) {
        this.numcartao = numcartao;
    }
   
}
