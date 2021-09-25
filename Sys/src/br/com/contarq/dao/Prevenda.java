/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.contarq.dao;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.util.Date;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Prevenda {
    Connection link = null;
    
    private String prvnum;
    private Integer prvnumaux;
    private String trnseq;
    private String trncxa;
    private String clicod;
    private Date prvdatemi;
    private String prvhoremi;
    private Date prvdatprv;
    private String prvhorprv;
    private Date prvdatrec;
    private String prvhorrec;
    private String prvtrf;
    private String prvfuncap;
    private String prvfunpro;
    private String prvfunven;
    private String fabcod;
    private String tipcod;
    private String isocod;
    private String prvsta;
    private String lojcap;
    private String lojpro;
    private String pedcod;
    private Double prvvalsin;
    private Date prvdatprd;
    private Double prvvlr;
    private String prvsol;
    private Date prvdatsai;
    private String prvhorsai;
    private String prvstaatu;
    private Double prvdcn;
    private Double prvdcnvlr;
    private Double prvdcnper;
    private String prvclides;
    private String prvcliend;
    private String prvclibai;
    private String prvclicid;
    private String prvcliest;
    private String prvclinum;
    private String prvclicmp;
    private String prvclicep;
    private String funcod;
    private Date prvdatrecenv;
    private Date prvdatretenv;
    private Date prvdatenvenv;
    private String prvhorrecenv;
    private String prvhorretenv;
    private String prvhorenvenv;
    private String prvtipprc;
    private Double prvacr;
    private Double prvacrper;
    private String clitel;
    private String prvtipatd;
    private String fzdcodsin;
    private String trnseqsin;
    private String cxanumsin;
    private Date trndatsin;
    private String prvcodext;
    private String prventdomvol;
    private String prvblodcn;
    private String prvbloest;
    private String prvblolimcrd;
    private String prvcorcod;
    private String prvloccod;
    private String prvtipfin;
    private String prvdcntip;
    private String prvclicodibge;
    private String prvmotlib;
    private String cxares;
    private String clicpfcnpj;
    private String prvtipret;
    private String forcod;
    private String prvtpfrete;
    private String prvindpres;
    private String prvinterind;
    private String prvcnpjinter;
    private String prvintermed;
    private String prvcnpjpag;
    private String prvobs;
    
    public Prevenda(Connection link){
        this.link = link;
        
        this.prvnumaux = null;
        this.trnseq = null;
        this.trncxa = null;
        this.clicod = null;
        this.prvdatemi = null;
        this.prvhoremi = null;
        this.prvdatprv = null;
        this.prvhorprv = null;
        this.prvdatrec = null;
        this.prvhorrec = null;
        this.prvtrf = null;
        this.prvfuncap = null;
        this.prvfunpro = null;
        this.prvfunven = null;
        this.fabcod = null;
        this.tipcod = null;
        this.isocod = null;
        this.prvsta = null;
        this.lojcap = null;
        this.lojpro = null;
        this.pedcod = null;
        this.prvvalsin = null;
        this.prvdatprd = null;
        this.prvvlr = null;
        this.prvsol = null;
        this.prvdatsai = null;
        this.prvhorsai = null;
        this.prvstaatu = null;
        this.prvdcn = null;
        this.prvdcnvlr = null;
        this.prvdcnper = null;
        this.prvclides = null;
        this.prvcliend = null;
        this.prvclibai = null;
        this.prvclicid = null;
        this.prvcliest = null;
        this.prvclinum = null;
        this.prvclicmp = null;
        this.prvclicep = null;
        this.funcod = null;
        this.prvdatrecenv = null;
        this.prvdatretenv = null;
        this.prvdatenvenv = null;
        this.prvhorrecenv = null;
        this.prvhorretenv = null;
        this.prvhorenvenv = null;
        this.prvtipprc = null;
        this.prvacr = null;
        this.prvacrper = null;
        this.clitel = null;
        this.prvtipatd = null;
        this.fzdcodsin = null;
        this.trnseqsin = null;
        this.cxanumsin = null;
        this.trndatsin = null;
        this.prvcodext = null;
        this.prventdomvol = null;
        this.prvblodcn = null;
        this.prvbloest = null;
        this.prvblolimcrd = null;
        this.prvcorcod = null;
        this.prvloccod = null;
        this.prvtipfin = null;
        this.prvdcntip = null;
        this.prvclicodibge = null;
        this.prvmotlib = null;
        this.cxares = null;
        this.clicpfcnpj = null;
        this.prvtipret = null;
        this.forcod = null;
        this.prvtpfrete = null;
        this.prvindpres = null;
        this.prvinterind = null;
        this.prvcnpjinter = null;
        this.prvintermed = null;
        this.prvcnpjpag = null;
        this.prvobs = null;
        
        this.lojcap = "0001"; //DELETAR DEPOIS DOS TESTES
        this.prvnum = generateCode();
    }
    
    public Prevenda(Connection link, String loja){
        this.link = link;
        
        this.prvnumaux = null;
        this.trnseq = null;
        this.trncxa = null;
        this.clicod = null;
        this.prvdatemi = null;
        this.prvhoremi = null;
        this.prvdatprv = null;
        this.prvhorprv = null;
        this.prvdatrec = null;
        this.prvhorrec = null;
        this.prvtrf = null;
        this.prvfuncap = null;
        this.prvfunpro = null;
        this.prvfunven = null;
        this.fabcod = null;
        this.tipcod = null;
        this.isocod = null;
        this.prvsta = null;
        this.lojpro = null;
        this.pedcod = null;
        this.prvvalsin = null;
        this.prvdatprd = null;
        this.prvvlr = null;
        this.prvsol = null;
        this.prvdatsai = null;
        this.prvhorsai = null;
        this.prvstaatu = null;
        this.prvdcn = null;
        this.prvdcnvlr = null;
        this.prvdcnper = null;
        this.prvclides = null;
        this.prvcliend = null;
        this.prvclibai = null;
        this.prvclicid = null;
        this.prvcliest = null;
        this.prvclinum = null;
        this.prvclicmp = null;
        this.prvclicep = null;
        this.funcod = null;
        this.prvdatrecenv = null;
        this.prvdatretenv = null;
        this.prvdatenvenv = null;
        this.prvhorrecenv = null;
        this.prvhorretenv = null;
        this.prvhorenvenv = null;
        this.prvtipprc = null;
        this.prvacr = null;
        this.prvacrper = null;
        this.clitel = null;
        this.prvtipatd = null;
        this.fzdcodsin = null;
        this.trnseqsin = null;
        this.cxanumsin = null;
        this.trndatsin = null;
        this.prvcodext = null;
        this.prventdomvol = null;
        this.prvblodcn = null;
        this.prvbloest = null;
        this.prvblolimcrd = null;
        this.prvcorcod = null;
        this.prvloccod = null;
        this.prvtipfin = null;
        this.prvdcntip = null;
        this.prvclicodibge = null;
        this.prvmotlib = null;
        this.cxares = null;
        this.clicpfcnpj = null;
        this.prvtipret = null;
        this.forcod = null;
        this.prvtpfrete = null;
        this.prvindpres = null;
        this.prvinterind = null;
        this.prvcnpjinter = null;
        this.prvintermed = null;
        this.prvcnpjpag = null;
        this.prvobs = null;
        
        this.lojcap = loja;
        this.prvnum = generateCode();
    }
    
    private String generateCode() {
        String prvnum = null;
        try {
            DecimalFormat df = new DecimalFormat("0000000000");
            CallableStatement call = link.prepareCall("EXECUTE PROCEDURE SP_NEW_CODE(?, ?)");
            call.setInt(1, 125);
            call.registerOutParameter(2, java.sql.Types.INTEGER);
            call.execute();
            int id = call.getInt(2);
            prvnum = df.format(id);
            
            String insert = "INSERT INTO CODIGO_RESERVA(TABCOD, CODIGO, IPCOM, USUARIO, CODAUX01, CODAUX02, CODAUX03) VALUES(125, ?,'192.168.199.31', 'SUPER', 0 ,0 ,0)";
            PreparedStatement stm = link.prepareStatement(insert);
            stm.setInt(1, id);
            stm.execute();
            
            this.prvnum = prvnum;
            
            insert = "INSERT INTO PREVENDA (PRVNUM, LOJCAP) VALUES(?, ?)";
            stm = link.prepareStatement(insert);
            stm.setString(1, this.prvnum);
            stm.setString(2, this.lojcap);
            stm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Prevenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prvnum;
    }
    

    public String getPrvnum() {
        return prvnum;
    }

    public void setPrvnum(String prvnum) {
        this.prvnum = prvnum;
    }

    public Integer getPrvnumaux() {
        return prvnumaux;
    }

    public void setPrvnumaux(Integer prvnumaux) {
        this.prvnumaux = prvnumaux;
    }

    public String getTrnseq() {
        return trnseq;
    }

    public void setTrnseq(String trnseq) {
        this.trnseq = trnseq;
    }

    public String getTrncxa() {
        return trncxa;
    }

    public void setTrncxa(String trncxa) {
        this.trncxa = trncxa;
    }

    public String getClicod() {
        return clicod;
    }

    public void setClicod(String clicod) {
        this.clicod = clicod;
    }

    public Date getPrvdatemi() {
        return prvdatemi;
    }

    public void setPrvdatemi(Date prvdatemi) {
        this.prvdatemi = prvdatemi;
    }

    public String getPrvhoremi() {
        return prvhoremi;
    }

    public void setPrvhoremi(String prvhoremi) {
        this.prvhoremi = prvhoremi;
    }

    public Date getPrvdatprv() {
        return prvdatprv;
    }

    public void setPrvdatprv(Date prvdatprv) {
        this.prvdatprv = prvdatprv;
    }

    public String getPrvhorprv() {
        return prvhorprv;
    }

    public void setPrvhorprv(String prvhorprv) {
        this.prvhorprv = prvhorprv;
    }

    public Date getPrvdatrec() {
        return prvdatrec;
    }

    public void setPrvdatrec(Date prvdatrec) {
        this.prvdatrec = prvdatrec;
    }

    public String getPrvhorrec() {
        return prvhorrec;
    }

    public void setPrvhorrec(String prvhorrec) {
        this.prvhorrec = prvhorrec;
    }

    public String getPrvtrf() {
        return prvtrf;
    }

    public void setPrvtrf(String prvtrf) {
        this.prvtrf = prvtrf;
    }

    public String getPrvfuncap() {
        return prvfuncap;
    }

    public void setPrvfuncap(String prvfuncap) {
        this.prvfuncap = prvfuncap;
    }

    public String getPrvfunpro() {
        return prvfunpro;
    }

    public void setPrvfunpro(String prvfunpro) {
        this.prvfunpro = prvfunpro;
    }

    public String getPrvfunven() {
        return prvfunven;
    }

    public void setPrvfunven(String prvfunven) {
        this.prvfunven = prvfunven;
    }

    public String getFabcod() {
        return fabcod;
    }

    public void setFabcod(String fabcod) {
        this.fabcod = fabcod;
    }

    public String getTipcod() {
        return tipcod;
    }

    public void setTipcod(String tipcod) {
        this.tipcod = tipcod;
    }

    public String getIsocod() {
        return isocod;
    }

    public void setIsocod(String isocod) {
        this.isocod = isocod;
    }

    public String getPrvsta() {
        return prvsta;
    }

    public void setPrvsta(String prvsta) {
        this.prvsta = prvsta;
    }

    public String getLojcap() {
        return lojcap;
    }

    public void setLojcap(String lojcap) {
        this.lojcap = lojcap;
    }

    public String getLojpro() {
        return lojpro;
    }

    public void setLojpro(String lojpro) {
        this.lojpro = lojpro;
    }

    public String getPedcod() {
        return pedcod;
    }

    public void setPedcod(String pedcod) {
        this.pedcod = pedcod;
    }

    public Double getPrvvalsin() {
        return prvvalsin;
    }

    public void setPrvvalsin(Double prvvalsin) {
        this.prvvalsin = prvvalsin;
    }

    public Date getPrvdatprd() {
        return prvdatprd;
    }

    public void setPrvdatprd(Date prvdatprd) {
        this.prvdatprd = prvdatprd;
    }

    public Double getPrvvlr() {
        return prvvlr;
    }

    public void setPrvvlr(Double prvvlr) {
        this.prvvlr = prvvlr;
    }

    public String getPrvsol() {
        return prvsol;
    }

    public void setPrvsol(String prvsol) {
        this.prvsol = prvsol;
    }

    public Date getPrvdatsai() {
        return prvdatsai;
    }

    public void setPrvdatsai(Date prvdatsai) {
        this.prvdatsai = prvdatsai;
    }

    public String getPrvhorsai() {
        return prvhorsai;
    }

    public void setPrvhorsai(String prvhorsai) {
        this.prvhorsai = prvhorsai;
    }

    public String getPrvstaatu() {
        return prvstaatu;
    }

    public void setPrvstaatu(String prvstaatu) {
        this.prvstaatu = prvstaatu;
    }

    public Double getPrvdcn() {
        return prvdcn;
    }

    public void setPrvdcn(Double prvdcn) {
        this.prvdcn = prvdcn;
    }

    public Double getPrvdcnvlr() {
        return prvdcnvlr;
    }

    public void setPrvdcnvlr(Double prvdcnvlr) {
        this.prvdcnvlr = prvdcnvlr;
    }

    public Double getPrvdcnper() {
        return prvdcnper;
    }

    public void setPrvdcnper(Double prvdcnper) {
        this.prvdcnper = prvdcnper;
    }

    public String getPrvclides() {
        return prvclides;
    }

    public void setPrvclides(String prvclides) {
        this.prvclides = prvclides;
    }

    public String getPrvcliend() {
        return prvcliend;
    }

    public void setPrvcliend(String prvcliend) {
        this.prvcliend = prvcliend;
    }

    public String getPrvclibai() {
        return prvclibai;
    }

    public void setPrvclibai(String prvclibai) {
        this.prvclibai = prvclibai;
    }

    public String getPrvclicid() {
        return prvclicid;
    }

    public void setPrvclicid(String prvclicid) {
        this.prvclicid = prvclicid;
    }

    public String getPrvcliest() {
        return prvcliest;
    }

    public void setPrvcliest(String prvcliest) {
        this.prvcliest = prvcliest;
    }

    public String getPrvclinum() {
        return prvclinum;
    }

    public void setPrvclinum(String prvclinum) {
        this.prvclinum = prvclinum;
    }

    public String getPrvclicmp() {
        return prvclicmp;
    }

    public void setPrvclicmp(String prvclicmp) {
        this.prvclicmp = prvclicmp;
    }

    public String getPrvclicep() {
        return prvclicep;
    }

    public void setPrvclicep(String prvclicep) {
        this.prvclicep = prvclicep;
    }

    public String getFuncod() {
        return funcod;
    }

    public void setFuncod(String funcod) {
        this.funcod = funcod;
    }

    public Date getPrvdatrecenv() {
        return prvdatrecenv;
    }

    public void setPrvdatrecenv(Date prvdatrecenv) {
        this.prvdatrecenv = prvdatrecenv;
    }

    public Date getPrvdatretenv() {
        return prvdatretenv;
    }

    public void setPrvdatretenv(Date prvdatretenv) {
        this.prvdatretenv = prvdatretenv;
    }

    public Date getPrvdatenvenv() {
        return prvdatenvenv;
    }

    public void setPrvdatenvenv(Date prvdatenvenv) {
        this.prvdatenvenv = prvdatenvenv;
    }

    public String getPrvhorrecenv() {
        return prvhorrecenv;
    }

    public void setPrvhorrecenv(String prvhorrevenv) {
        this.prvhorrecenv = prvhorrevenv;
    }

    public String getPrvhorretenv() {
        return prvhorretenv;
    }

    public void setPrvhorretenv(String prvhorretenv) {
        this.prvhorretenv = prvhorretenv;
    }

    public String getPrvhorenvenv() {
        return prvhorenvenv;
    }

    public void setPrvhorenvenv(String prvhorenvenv) {
        this.prvhorenvenv = prvhorenvenv;
    }

    public String getPrvtipprc() {
        return prvtipprc;
    }

    public void setPrvtipprc(String prvtipprc) {
        this.prvtipprc = prvtipprc;
    }

    public Double getPrvacr() {
        return prvacr;
    }

    public void setPrvacr(Double prvacr) {
        this.prvacr = prvacr;
    }

    public Double getPrvacrper() {
        return prvacrper;
    }

    public void setPrvacrper(Double prvacrper) {
        this.prvacrper = prvacrper;
    }

    public String getClitel() {
        return clitel;
    }

    public void setClitel(String clitel) {
        this.clitel = clitel;
    }

    public String getPrvtipatd() {
        return prvtipatd;
    }

    public void setPrvtipatd(String prvtipatd) {
        this.prvtipatd = prvtipatd;
    }

    public String getFzdcodsin() {
        return fzdcodsin;
    }

    public void setFzdcodsin(String fzdcodsin) {
        this.fzdcodsin = fzdcodsin;
    }

    public String getTrnseqsin() {
        return trnseqsin;
    }

    public void setTrnseqsin(String trnseqsin) {
        this.trnseqsin = trnseqsin;
    }

    public String getCxanumsin() {
        return cxanumsin;
    }

    public void setCxanumsin(String cxanumsin) {
        this.cxanumsin = cxanumsin;
    }

    public Date getTrndatsin() {
        return trndatsin;
    }

    public void setTrndatsin(Date trndatsin) {
        this.trndatsin = trndatsin;
    }

    public String getPrvcodext() {
        return prvcodext;
    }

    public void setPrvcodext(String prvcodext) {
        this.prvcodext = prvcodext;
    }

    public String getPrventdomvol() {
        return prventdomvol;
    }

    public void setPrventdomvol(String prventdomvol) {
        this.prventdomvol = prventdomvol;
    }

    public String getPrvblodcn() {
        return prvblodcn;
    }

    public void setPrvblodcn(String prvblodcn) {
        this.prvblodcn = prvblodcn;
    }

    public String getPrvbloest() {
        return prvbloest;
    }

    public void setPrvbloest(String prvbloest) {
        this.prvbloest = prvbloest;
    }

    public String getPrvblolimcrd() {
        return prvblolimcrd;
    }

    public void setPrvblolimcrd(String prvblolimcrd) {
        this.prvblolimcrd = prvblolimcrd;
    }

    public String getPrvcorcod() {
        return prvcorcod;
    }

    public void setPrvcorcod(String prvcorcod) {
        this.prvcorcod = prvcorcod;
    }

    public String getPrvloccod() {
        return prvloccod;
    }

    public void setPrvloccod(String prvloccod) {
        this.prvloccod = prvloccod;
    }

    public String getPrvtipfin() {
        return prvtipfin;
    }

    public void setPrvtipfin(String prvtipfin) {
        this.prvtipfin = prvtipfin;
    }

    public String getPrvdcntip() {
        return prvdcntip;
    }

    public void setPrvdcntip(String prvdcntip) {
        this.prvdcntip = prvdcntip;
    }
    
    public String getPrvclicodibge() {
        return prvclicodibge;
    }

    public void setPrvclicodibge(String prvclicodibge) {
        this.prvclicodibge = prvclicodibge;
    }

    public String getPrvmotlib() {
        return prvmotlib;
    }

    public void setPrvmotlib(String prvmotlib) {
        this.prvmotlib = prvmotlib;
    }

    public String getCxares() {
        return cxares;
    }

    public void setCxares(String cxares) {
        this.cxares = cxares;
    }

    public String getClicpfcnpj() {
        return clicpfcnpj;
    }

    public void setClicpfcnpj(String clicpfcnpj) {
        this.clicpfcnpj = clicpfcnpj;
    }

    public String getPrvtipret() {
        return prvtipret;
    }

    public void setPrvtipret(String prvtipret) {
        this.prvtipret = prvtipret;
    }

    public String getForcod() {
        return forcod;
    }

    public void setForcod(String forcod) {
        this.forcod = forcod;
    }

    public String getPrvtpfrete() {
        return prvtpfrete;
    }

    public void setPrvtpfrete(String prvtpfrete) {
        this.prvtpfrete = prvtpfrete;
    }

    public String getPrvindpres() {
        return prvindpres;
    }

    public void setPrvindpres(String prvindpres) {
        this.prvindpres = prvindpres;
    }

    public String getPrvinterind() {
        return prvinterind;
    }

    public void setPrvinterind(String prvinterind) {
        this.prvinterind = prvinterind;
    }

    public String getPrvcnpjinter() {
        return prvcnpjinter;
    }

    public void setPrvcnpjinter(String prvcnpjinter) {
        this.prvcnpjinter = prvcnpjinter;
    }

    public String getPrvintermed() {
        return prvintermed;
    }

    public void setPrvintermed(String prvintermed) {
        this.prvintermed = prvintermed;
    }

    public String getPrvcnpjpag() {
        return prvcnpjpag;
    }

    public void setPrvcnpjpag(String prvcnpjpag) {
        this.prvcnpjpag = prvcnpjpag;
    }

    public String getPrvobs() {
        return prvobs;
    }

    public void setPrvobs(String prvobs) {
        this.prvobs = prvobs;
    }
}
