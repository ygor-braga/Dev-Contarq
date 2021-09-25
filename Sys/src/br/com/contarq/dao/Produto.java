/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.contarq.dao;

import br.com.contarq.controladores.ServiceItePrevenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Produto {
    private Connection link;
    
    private String prodes;
    private String procod;    
    private String procomp;
    private String proforlin;
    private String prodesrdz;
    private String seccod;
    private String trbid;
    private String proctrest;
    private String prodesvar;
    private String properdcn;
    private Double proprcvdavar;
    private Double prodcnmax;
    private Double estatu;
    
    private ArrayList listProcomp;
    
    public Produto(Connection link){
        this.link = link;
        
        prodes = null;
        procod = null;    
        procomp = null;
        proprcvdavar = null;
        prodcnmax = null;
        estatu = null;
        listProcomp = null;
    }
    
    public void getDataProduto(String procod){
        this.procod = procod;
        try {
            String query = "SELECT * FROM PRODUTO WHERE PROCOD = ?";
            PreparedStatement stm = link.prepareStatement(query);
            stm.setString(1, procod);
            ResultSet data = stm.executeQuery();
            if(data.next()){
                this.prodes = data.getString("PRODES");
                this.proforlin = data.getString("PROFORLIN");
                this.procomp = data.getString("PROCOMP");
                this.prodesrdz = data.getString("PRODESRDZ");
                this.seccod = data.getString("SECCOD");
                this.trbid = data.getString("TRBID");
                this.proctrest = data.getString("PROCTREST");
                this.prodesvar = data.getString("PRODESVAR");
                this.properdcn = data.getString("PROPERDCN");
                this.proprcvdavar = data.getDouble("PROPRCVDAVAR");
                this.prodcnmax = data.getDouble("PRODCNMAX");
                if(this.procomp.equals("S")){
                    listProcomp = new ArrayList();
                    fillProcomp();
                }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void fillProcomp(){
        try {
            String query = "SELECT COMPONENTE.CNTCOD, COMPONENTE.CNTQTD, ESTOQUE.ESTATU FROM ESTOQUE, COMPONENTE WHERE ESTOQUE.PROCOD = COMPONENTE.CNTCOD AND COMPONENTE.PROCOD = ?";
            ArrayList componente = new ArrayList();
            
            PreparedStatement stm = link.prepareStatement(query);
            stm.setString(1, this.procod);
            ResultSet data = stm.executeQuery();
            
            while(data.next()){
                componente.add(data.getString("CNTCOD"));
                componente.add(data.getDouble("CNTQTD"));
                componente.add(data.getDouble("ESTATU"));
                this.listProcomp.add(componente);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Produto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public boolean checkComposto(Integer ipvqtd){        
        for(Object o : listProcomp){
            Double peso = 0.0;
            Double estoque = 0.0;
            if(o instanceof ArrayList){
                peso = Double.parseDouble(((ArrayList) o).get(1).toString());
                estoque = Double.parseDouble(((ArrayList) o).get(2).toString());
            }
            if(peso * ipvqtd > estoque){
                return false;
            }
        }        
        return true;
    }

    public String getProdes() {
        return prodes;
    }

    public void setProdes(String prodes) {
        this.prodes = prodes;
    }

    public String getProcod() {
        return procod;
    }

    public void setProcod(String procod) {
        this.procod = procod;
    }

    public String getProcomp() {
        return procomp;
    }

    public void setProcomp(String procomp) {
        this.procomp = procomp;
    }

    public Double getProprcvdavar() {
        return proprcvdavar;
    }

    public String getProforlin() {
        return proforlin;
    }

    public void setProforlin(String proforlin) {
        this.proforlin = proforlin;
    }

    public String getProdesrdz() {
        return prodesrdz;
    }

    public void setProdesrdz(String prodesrdz) {
        this.prodesrdz = prodesrdz;
    }

    public String getSeccod() {
        return seccod;
    }

    public void setSeccod(String seccod) {
        this.seccod = seccod;
    }

    public String getTrbid() {
        return trbid;
    }

    public void setTrbid(String trbid) {
        this.trbid = trbid;
    }

    public String getProctrest() {
        return proctrest;
    }

    public void setProctrest(String proctrest) {
        this.proctrest = proctrest;
    }

    public String getProdesvar() {
        return prodesvar;
    }

    public void setProdesvar(String prodesvar) {
        this.prodesvar = prodesvar;
    }
    
    

    public void setProprcvdavar(Double proprcvdavar) {
        this.proprcvdavar = proprcvdavar;
    }

    public Double getProdcnmax() {
        return prodcnmax;
    }

    public void setProdcnmax(Double prodcnmax) {
        this.prodcnmax = prodcnmax;
    }

    public Double getEstatu() {
        return estatu;
    }

    public void setEstatu(Double estatu) {
        this.estatu = estatu;
    }

    public ArrayList<Produto> getListProcomp() {
        return listProcomp;
    }

    public void setListProcomp(ArrayList<Produto> listProcomp) {
        this.listProcomp = listProcomp;
    }
    
    
    
}
