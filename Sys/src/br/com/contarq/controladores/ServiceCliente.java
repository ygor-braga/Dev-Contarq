/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.contarq.controladores;

import br.com.contarq.dao.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ServiceCliente {
    Connection link = null;
    
    public ServiceCliente(Connection link){
        this.link = link;
    }
    
    public void add(Cliente cliente){
        try {
            String query = "INSERT INTO CLIENTE(CLICOD, CLIDES, CLIEND, CLICPFCGC, CLIBAI, CLITEL, CLICEP, CLICID, CLINUM, CLICMP, CLIEST) "
                    + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stm = link.prepareStatement(query);
            
            if(cliente.getClicod() == null){stm.setNull(1, java.sql.Types.VARCHAR);}else{stm.setString(1, cliente.getClicod());}            
            if(cliente.getClides() == null){stm.setNull(2, java.sql.Types.VARCHAR);}else{stm.setString(2, cliente.getClides());}            
            if(cliente.getCliend() == null){stm.setNull(3, java.sql.Types.VARCHAR);}else{stm.setString(3, cliente.getCliend());}            
            if(cliente.getClicpfcgc() == null){stm.setNull(4, java.sql.Types.VARCHAR);}else{stm.setString(4, cliente.getClicpfcgc());}            
            if(cliente.getClibai() == null){stm.setNull(5, java.sql.Types.VARCHAR);}else{stm.setString(5, cliente.getClibai());}            
            if(cliente.getClitel() == null){stm.setNull(6, java.sql.Types.VARCHAR);}else{stm.setString(6, cliente.getClitel());}            
            if(cliente.getClicep() == null){stm.setNull(7, java.sql.Types.VARCHAR);}else{stm.setString(7, cliente.getClicep());}            
            if(cliente.getClicid() == null){stm.setNull(8, java.sql.Types.VARCHAR);}else{stm.setString(8, cliente.getClicid());}            
            if(cliente.getClinum() == null){stm.setNull(9, java.sql.Types.VARCHAR);}else{stm.setString(9, cliente.getClinum());}            
            if(cliente.getClicmp() == null){stm.setNull(10, java.sql.Types.VARCHAR);}else{stm.setString(10, cliente.getClicmp());}            
            if(cliente.getCliest() == null){stm.setNull(11, java.sql.Types.VARCHAR);}else{stm.setString(11, cliente.getCliest());}

            if(!stm.execute()){
               System.out.println("Cliente cadastrado com sucesso!");
            }
        } catch (SQLException ex) {
            System.out.println("Error ao cadastrar cliente: " +  ex.getMessage());
            Logger.getLogger(ServiceCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
