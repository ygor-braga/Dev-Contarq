/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.contarq.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ItePrevenda {
    private Connection link = null;
    
    private Integer id;    
    private String prvnum;
    private String procod;
    private String lojcod;
    private Double ipvqtd;
    private Double ipvvlruni;
    private Double ipvdcn;
    private String ipvdcntip;
    private String ipvtrf;
    private String ipvtip;
    private String ipvfab;
    private String ipvobs;
    private Double ipvqtdefe;
    private String ipvasstip;
    private String ipvasscod;
    private Integer ipvqtdbonenv;
    private String ipvprodes;
    private String ipvprodesrdz;
    private String ipvseccod;
    private String ipvtrbid;
    private String ipvserpro;
    private String procodaux;
    private String ipvctrest;
    private String funcod;
    private String ipvprodesvar;
    private String ipvtxaent;
    private String ipvcodass;
    private String ipvperdcn;
    private Double ipvprcdva;
    private Double ipvdesvlr;
    private Double ipvprcgar;
    private String ipvcstpis;
    private Double ipvaliqpis;
    private String ipvcstcofins;
    private Double ipvaliqcofins;
    
    public ItePrevenda(Connection link){
        this.link = link;
        
        this.id = null;
        this.prvnum = null;
        this.procod = null;
        this.lojcod = null;
        this.ipvqtd = null;
        this.ipvvlruni = null;
        this.ipvdcn = null;
        this.ipvdcntip = null;
        this.ipvtrf = null;
        this.ipvtip = null;
        this.ipvfab = null;
        this.ipvobs = null;
        this.ipvqtdefe = null;
        this.ipvasstip = null;
        this.ipvasscod = null;
        this.ipvqtdbonenv = null;
        this.ipvprodes = null;
        this.ipvprodesrdz = null;
        this.ipvseccod = null;
        this.ipvtrbid = null;
        this.ipvserpro = null;
        this.procodaux = null;
        this.ipvctrest = null;
        this.funcod = null;
        this.ipvprodesvar = null;
        this.ipvtxaent = null;
        this.ipvcodass = null;
        this.ipvperdcn = null;
        this.ipvprcdva = null;
        this.ipvdesvlr = null;
        this.ipvprcgar = null;
        this.ipvcstpis = null;
        this.ipvaliqpis = null;
        this.ipvcstcofins = null;
        this.ipvaliqcofins = null;
    }

    public ItePrevenda(Connection link, ResultSet produto){
        try {
            this.link = link;
            
            this.prvnum = null;
            this.procod = produto.getString("PROCOD");
            this.lojcod = null;
            this.ipvqtd = null;
            this.ipvvlruni = produto.getDouble("PROPRCVDAVAR");
            this.ipvdcn = null;
            this.ipvdcntip = null;
            this.ipvtrf = null;
            this.ipvtip = null;
            this.ipvfab = null;
            this.ipvobs = null;
            this.ipvqtdefe = null;
            this.ipvasstip = null;
            this.ipvasscod = null;
            this.ipvqtdbonenv = null;
            this.ipvprodes = produto.getString("PRODES");
            this.ipvprodesrdz = produto.getString("PRODESRDZ");
            this.ipvseccod = produto.getString("SECCOD");
            this.ipvtrbid = produto.getString("TRBID");
            this.ipvserpro = null;
            this.procodaux = null;
            this.ipvctrest = produto.getString("PROCTREST");
            this.funcod = null;
            this.ipvprodesvar = produto.getString("PRODESVAR");
            this.ipvtxaent = null;
            this.ipvcodass = null;
            this.ipvperdcn = null;
            this.ipvprcdva = null;
            this.ipvdesvlr = null;
            this.ipvprcgar = null;
            this.ipvcstpis = null;
            this.ipvaliqpis = null;
            this.ipvcstcofins = null;
            this.ipvaliqcofins = null;
        } catch (SQLException ex) {
            Logger.getLogger(ItePrevenda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ItePrevenda(Connection link, Produto produto){
        this.link = link;
            
        this.prvnum = null;
        this.procod = produto.getProcod();
        this.lojcod = null;
        this.ipvqtd = null;
        this.ipvvlruni = produto.getProprcvdavar();
        this.ipvdcn = null;
        this.ipvdcntip = null;
        this.ipvtrf = null;
        this.ipvtip = null;
        this.ipvfab = null;
        this.ipvobs = null;
        this.ipvqtdefe = null;
        this.ipvasstip = null;
        this.ipvasscod = null;
        this.ipvqtdbonenv = null;
        this.ipvprodes = produto.getProdes();
        this.ipvprodesrdz = produto.getProdesrdz();
        this.ipvseccod = produto.getSeccod();
        this.ipvtrbid = produto.getTrbid();
        this.ipvserpro = null;
        this.procodaux = null;
        this.ipvctrest = produto.getProctrest();
        this.funcod = null;
        this.ipvprodesvar = produto.getProdesvar();
        this.ipvtxaent = null;
        this.ipvcodass = null;
        this.ipvperdcn = null;
        this.ipvprcdva = null;
        this.ipvdesvlr = null;
        this.ipvprcgar = null;
        this.ipvcstpis = null;
        this.ipvaliqpis = null;
        this.ipvcstcofins = null;
        this.ipvaliqcofins = null;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getPrvnum() {
        return prvnum;
    }

    public void setPrvnum(String prvnum) {
        this.prvnum = prvnum;
    }

    public String getProcod() {
        return procod;
    }

    public void setProcod(String procod) {
        this.procod = procod;
    }

    public String getLojcod() {
        return lojcod;
    }

    public void setLojcod(String lojcod) {
        this.lojcod = lojcod;
    }

    public Double getIpvqtd() {
        return ipvqtd;
    }

    public void setIpvqtd(Double ipvqtd) {
        this.ipvqtd = ipvqtd;
    }

    public Double getIpvvlruni() {
        return ipvvlruni;
    }

    public void setIpvvlruni(Double ipvvlruni) {
        this.ipvvlruni = ipvvlruni;
    }

    public Double getIpvdcn() {
        return ipvdcn;
    }

    public void setIpvdcn(Double ipvdcn) {
        this.ipvdcn = ipvdcn;
    }

    public String getIpvdcntip() {
        return ipvdcntip;
    }

    public void setIpvdcntip(String ipvdcntip) {
        this.ipvdcntip = ipvdcntip;
    }

    public String getIpvtrf() {
        return ipvtrf;
    }

    public void setIpvtrf(String ipvtrf) {
        this.ipvtrf = ipvtrf;
    }

    public String getIpvtip() {
        return ipvtip;
    }

    public void setIpvtip(String ipvtip) {
        this.ipvtip = ipvtip;
    }

    public String getIpvfab() {
        return ipvfab;
    }

    public void setIpvfab(String ipvfab) {
        this.ipvfab = ipvfab;
    }

    public String getIpvobs() {
        return ipvobs;
    }

    public void setIpvobs(String ipvobs) {
        this.ipvobs = ipvobs;
    }

    public Double getIpvqtdefe() {
        return ipvqtdefe;
    }

    public void setIpvqtdefe(Double ipvqtdefe) {
        this.ipvqtdefe = ipvqtdefe;
    }

    public String getIpvasstip() {
        return ipvasstip;
    }

    public void setIpvasstip(String ipvasstip) {
        this.ipvasstip = ipvasstip;
    }

    public String getIpvasscod() {
        return ipvasscod;
    }

    public void setIpvasscod(String ipvasscod) {
        this.ipvasscod = ipvasscod;
    }

    public Integer getIpvqtdbonenv() {
        return ipvqtdbonenv;
    }

    public void setIpvqtdbonenv(Integer ipvqtdbonenv) {
        this.ipvqtdbonenv = ipvqtdbonenv;
    }

    public String getIpvprodes() {
        return ipvprodes;
    }

    public void setIpvprodes(String ipvprodes) {
        this.ipvprodes = ipvprodes;
    }

    public String getIpvprodesrdz() {
        return ipvprodesrdz;
    }

    public void setIpvprodesrdz(String ipvprodesrdz) {
        this.ipvprodesrdz = ipvprodesrdz;
    }

    public String getIpvseccod() {
        return ipvseccod;
    }

    public void setIpvseccod(String ipvseccod) {
        this.ipvseccod = ipvseccod;
    }

    public String getIpvtrbid() {
        return ipvtrbid;
    }

    public void setIpvtrbid(String ipvtrbid) {
        this.ipvtrbid = ipvtrbid;
    }

    public String getIpvserpro() {
        return ipvserpro;
    }

    public void setIpvserpro(String ipvserpro) {
        this.ipvserpro = ipvserpro;
    }

    public String getProcodaux() {
        return procodaux;
    }

    public void setProcodaux(String procodaux) {
        this.procodaux = procodaux;
    }

    public String getIpvctrest() {
        return ipvctrest;
    }

    public void setIpvctrest(String ipvctrest) {
        this.ipvctrest = ipvctrest;
    }

    public String getFuncod() {
        return funcod;
    }

    public void setFuncod(String funcod) {
        this.funcod = funcod;
    }

    public String getIpvprodesvar() {
        return ipvprodesvar;
    }

    public void setIpvprodesvar(String ipvprodesvar) {
        this.ipvprodesvar = ipvprodesvar;
    }

    public String getIpvtxaent() {
        return ipvtxaent;
    }

    public void setIpvtxaent(String ipvtxaent) {
        this.ipvtxaent = ipvtxaent;
    }

    public String getIpvcodass() {
        return ipvcodass;
    }

    public void setIpvcodass(String ipvcodass) {
        this.ipvcodass = ipvcodass;
    }

    public String getIpvperdcn() {
        return ipvperdcn;
    }

    public void setIpvperdcn(String ipvperdcn) {
        this.ipvperdcn = ipvperdcn;
    }

    public Double getIpvprcdva() {
        return ipvprcdva;
    }

    public void setIpvprcdva(Double ipvprcdva) {
        this.ipvprcdva = ipvprcdva;
    }

    public Double getIpvdesvlr() {
        return ipvdesvlr;
    }

    public void setIpvdesvlr(Double ipvdesvlr) {
        this.ipvdesvlr = ipvdesvlr;
    }

    public Double getIpvprcgar() {
        return ipvprcgar;
    }

    public void setIpvprcgar(Double ipvprcgar) {
        this.ipvprcgar = ipvprcgar;
    }

    public String getIpvcstpis() {
        return ipvcstpis;
    }

    public void setIpvcstpis(String ipvcstpis) {
        this.ipvcstpis = ipvcstpis;
    }

    public Double getIpvaliqpis() {
        return ipvaliqpis;
    }

    public void setIpvaliqpis(Double ipvaliqpis) {
        this.ipvaliqpis = ipvaliqpis;
    }

    public String getIpvcstcofins() {
        return ipvcstcofins;
    }

    public void setIpvcstcofins(String ipvcstcofins) {
        this.ipvcstcofins = ipvcstcofins;
    }

    public Double getIpvaliqcofins() {
        return ipvaliqcofins;
    }

    public void setIpvaliqcofins(Double ipvaliqcofins) {
        this.ipvaliqcofins = ipvaliqcofins;
    }
    
    
}
