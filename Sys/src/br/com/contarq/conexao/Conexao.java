/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.contarq.conexao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Usuario
 */
public class Conexao {
    final private String driver = "org.firebirdsql.jdbc.FBDriver";
    final private String CHARSET = "?encoding=ISO8859_1";
    final private String server = "127.0.0.1";
    final private String porta = "3050";
    final private String dir = "C://Syspdv//";
    final private String banco = "syspdv_srv.fdb";
    final private String user = "SYSDBA";
    final private String pwd = "masterkey";
    
    Connection link = null;
    
    public Connection Connect() {
        try{
            Class.forName(driver);
            link =
            DriverManager.getConnection(
            "jdbc:firebirdsql://" + server + ":" + porta + "/" + dir + banco + CHARSET, user, pwd);
            System.out.println("Conexão feira com sucesso ao syspdv");
        }catch (Exception e){
            System.out.println("Não foi possível conectar ao banco: " + e.getMessage());
            link = null;
        }
        return link;
    }
}
