/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.contarq.controladores;

import br.com.contarq.dao.Prevenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ServicePrevenda {
    Connection link = null;
    SimpleDateFormat data = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    SimpleDateFormat parseador = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat hora = new SimpleDateFormat("HHmm");
    
    public ServicePrevenda(Connection link){
        this.link = link;
    }
    
    public void update(Prevenda prevenda){
        if(prevenda.getPrvnum() != null){
            try {
                String query = "UPDATE PREVENDA PRVNUMAUX = ?, TRNSEQ = ?, TRNCXA = ?, CLICOD = ?, PRVDATEMI = ?, PRVHOREMI = ?, PRVDATPRV = ?, PRVHORPRV = ?"
                        + ", PRVDATREC = ?, PRVHORREC = ?, PRVTRF = ?, PRVFUNCAP = ?, PRVFUNPRO = ?, PRVFUNVEN = ?, FABCOD = ?, TIPCOD = ?, ISOCOD = ?, PRVSTA = ?"
                        + ", LOJPRO = ?, PEDCOD = ?, PRVVALSIN = ?, PRVDATPRD = ?, PRVVLR = ?, PRVSOL = ?, PRVDATSAI = ?, PRVHORSAI = ?, PRVSTAATU = ?, PRVDCN = ?, PRVDCNVLR = ?"
                        + ", PRVDCNPER = ?, PRVCLIDES = ?, PRVCLIEND = ?, PRVCLIBAI = ?, PRVCLICID = ?, PRVCLIEST = ?, PRVCLINUM = ?, PRVCLICMP = ?, PRVCLICEP = ?, FUNCOD = ?"
                        + ", PRVDATRECENV = ?, PRVDATRETENV = ?, PRVDATENVENV = ?, PRVHORRECENV = ?, PRVHORRETENV = ?, PRVHORENVENV = ?, PRVTIPPRC = ?, PRVACR = ?, PRVACRPER = ?"
                        + ", CLITEL = ?, PRVTIPATD = ?, FZDCODSIN = ?, TRNSEQSIN = ?, CXANUMSIN = ?, TRNDATSIN = ?, PRVCODEXT = ?, PRVENTDOMVOL = ?, PRVBLODCN = ?, PRVBLOEST = ?"
                        + ", PRVBLOLIMCRD = ?, PRVCORCOD = ?, PRVLOCCOD = ?, PRVTIPFIN = ?, PRVDCNTIP = ?, PRVCLICODIBGE = ?, PRVMOTLIB = ?, CXARES = ?, CLICPFCNPJ = ?, PRVTIPRET = ?"
                        + ", FORCOD = ?, PRVTPFRETE = ?, PRVINDPRES = ?, PRVCNPJINTER = ?, PRVINTERIND = ?, PRVINTERMED = ?, PRVCNPJPAG = ?, PRVOBS = ? "
                        + "WHERE PRVNUM = ? AND LOJCAP = ?";
                PreparedStatement stm = this.link.prepareStatement(query);
                
                if(prevenda.getPrvnumaux() == null){stm.setNull(1, java.sql.Types.INTEGER);}else{stm.setInt(1, prevenda.getPrvnumaux());}
                if(prevenda.getTrnseq() == null){stm.setNull(2, java.sql.Types.CHAR);}else{stm.setString(2, prevenda.getTrnseq());}
                if(prevenda.getTrncxa() == null){stm.setNull(3, java.sql.Types.CHAR);}else{stm.setString(3, prevenda.getTrncxa());}
                if(prevenda.getClicod() == null){stm.setNull(4, java.sql.Types.CHAR);}else{stm.setString(4, prevenda.getClicod());}
                if(prevenda.getPrvdatemi() == null){stm.setNull(5, java.sql.Types.TIMESTAMP);}else{stm.setString(5, data.format(prevenda.getPrvdatemi()));}
                if(prevenda.getPrvhoremi() == null){stm.setNull(6, java.sql.Types.CHAR);}else{stm.setString(6, prevenda.getPrvhoremi());}
                if(prevenda.getPrvdatprv() == null){stm.setNull(7, java.sql.Types.TIMESTAMP);}else{stm.setString(7, data.format(prevenda.getPrvdatprv()));}
                if(prevenda.getPrvhorprv() == null){stm.setNull(8, java.sql.Types.CHAR);}else{stm.setString(8, prevenda.getPrvhorprv());}
                if(prevenda.getPrvdatrec() == null){stm.setNull(9, java.sql.Types.TIMESTAMP);}else{stm.setString(9, data.format(prevenda.getClicod()));}
                if(prevenda.getPrvhorrec() == null){stm.setNull(10, java.sql.Types.CHAR);}else{stm.setString(10, prevenda.getPrvhorrec());}
                if(prevenda.getPrvtrf() == null){stm.setNull(11, java.sql.Types.CHAR);}else{stm.setString(11, prevenda.getPrvtrf());}
                if(prevenda.getPrvfuncap() == null){stm.setNull(12, java.sql.Types.CHAR);}else{stm.setString(12, prevenda.getPrvfuncap());}
                if(prevenda.getPrvfunpro() == null){stm.setNull(13, java.sql.Types.CHAR);}else{stm.setString(13, prevenda.getPrvfunpro());}
                if(prevenda.getPrvfunven() == null){stm.setNull(14, java.sql.Types.CHAR);}else{stm.setString(14, prevenda.getPrvfunven());}
                if(prevenda.getFabcod() == null){stm.setNull(15, java.sql.Types.CHAR);}else{stm.setString(15, prevenda.getFabcod());}
                if(prevenda.getTipcod() == null){stm.setNull(16, java.sql.Types.CHAR);}else{stm.setString(16, prevenda.getTipcod());}
                if(prevenda.getIsocod() == null){stm.setNull(17, java.sql.Types.CHAR);}else{stm.setString(17, prevenda.getIsocod());}
                if(prevenda.getPrvsta() == null){stm.setNull(18, java.sql.Types.CHAR);}else{stm.setString(18, prevenda.getPrvsta());}
                if(prevenda.getLojpro() == null){stm.setNull(19, java.sql.Types.CHAR);}else{stm.setString(19, prevenda.getLojpro());}
                if(prevenda.getPedcod() == null){stm.setNull(20, java.sql.Types.CHAR);}else{stm.setString(20, prevenda.getPedcod());}
                if(prevenda.getPrvvalsin() == null){stm.setNull(21, java.sql.Types.NUMERIC);}else{stm.setDouble(21, prevenda.getPrvvalsin());}
                if(prevenda.getPrvdatprd() == null){stm.setNull(22, java.sql.Types.TIMESTAMP);}else{stm.setString(22, data.format(prevenda.getClicod()));}
                if(prevenda.getPrvvlr() == null){stm.setNull(23, java.sql.Types.NUMERIC);}else{stm.setDouble(23, prevenda.getPrvvlr());}
                if(prevenda.getPrvsol() == null){stm.setNull(24, java.sql.Types.VARCHAR);}else{stm.setString(24, prevenda.getPrvsol());}
                if(prevenda.getPrvdatsai() == null){stm.setNull(25, java.sql.Types.TIMESTAMP);}else{stm.setString(25, data.format(prevenda.getPrvdatsai()));}
                if(prevenda.getPrvhorsai() == null){stm.setNull(26, java.sql.Types.CHAR);}else{stm.setString(26, prevenda.getPrvhorsai());}
                if(prevenda.getPrvstaatu() == null){stm.setNull(27, java.sql.Types.CHAR);}else{stm.setString(27, prevenda.getPrvstaatu());}
                if(prevenda.getPrvdcn() == null){stm.setNull(28, java.sql.Types.NUMERIC);}else{stm.setDouble(28, prevenda.getPrvdcn());}
                if(prevenda.getPrvdcnvlr() == null){stm.setNull(29, java.sql.Types.NUMERIC);}else{stm.setDouble(29, prevenda.getPrvdcnvlr());}
                if(prevenda.getPrvdcnper() == null){stm.setNull(30, java.sql.Types.NUMERIC);}else{stm.setDouble(30, prevenda.getPrvdcnper());}
                if(prevenda.getPrvclides() == null){stm.setNull(31, java.sql.Types.VARCHAR);}else{stm.setString(31, prevenda.getPrvclides());}
                if(prevenda.getPrvcliend() == null){stm.setNull(32, java.sql.Types.VARCHAR);}else{stm.setString(32, prevenda.getPrvcliend());}
                if(prevenda.getPrvclibai() == null){stm.setNull(33, java.sql.Types.VARCHAR);}else{stm.setString(33, prevenda.getPrvclibai());}
                if(prevenda.getPrvclicid() == null){stm.setNull(34, java.sql.Types.VARCHAR);}else{stm.setString(34, prevenda.getPrvclicid());}
                if(prevenda.getPrvcliest() == null){stm.setNull(35, java.sql.Types.CHAR);}else{stm.setString(35, prevenda.getPrvcliest());}
                if(prevenda.getPrvclinum() == null){stm.setNull(36, java.sql.Types.VARCHAR);}else{stm.setString(36, prevenda.getPrvclinum());}
                if(prevenda.getPrvclicmp() == null){stm.setNull(37, java.sql.Types.VARCHAR);}else{stm.setString(37, prevenda.getPrvclicmp());}
                if(prevenda.getPrvclicep() == null){stm.setNull(38, java.sql.Types.VARCHAR);}else{stm.setString(38, prevenda.getPrvclicep());}
                if(prevenda.getFuncod() == null){stm.setNull(39, java.sql.Types.CHAR);}else{stm.setString(39, prevenda.getFuncod());}
                if(prevenda.getPrvdatrecenv() == null){stm.setNull(40, java.sql.Types.TIMESTAMP);}else{stm.setString(40, data.format(prevenda.getPrvdatrecenv()));}
                if(prevenda.getPrvdatretenv() == null){stm.setNull(41, java.sql.Types.TIMESTAMP);}else{stm.setString(41, data.format(prevenda.getPrvdatretenv()));}
                if(prevenda.getPrvdatenvenv() == null){stm.setNull(42, java.sql.Types.TIMESTAMP);}else{stm.setString(42, data.format(prevenda.getPrvdatenvenv()));}
                if(prevenda.getPrvhorrecenv() == null){stm.setNull(43, java.sql.Types.CHAR);}else{stm.setString(43, prevenda.getPrvhorrecenv());}
                if(prevenda.getPrvhorretenv() == null){stm.setNull(44, java.sql.Types.CHAR);}else{stm.setString(44, prevenda.getPrvhorretenv());}
                if(prevenda.getPrvhorenvenv() == null){stm.setNull(45, java.sql.Types.CHAR);}else{stm.setString(45, prevenda.getPrvhorenvenv());}
                if(prevenda.getPrvtipprc() == null){stm.setNull(46, java.sql.Types.CHAR);}else{stm.setString(46, prevenda.getPrvtipprc());}
                if(prevenda.getPrvacr() == null){stm.setNull(47, java.sql.Types.NUMERIC);}else{stm.setDouble(47, prevenda.getPrvacr());}
                if(prevenda.getPrvacrper() == null){stm.setNull(48, java.sql.Types.NUMERIC);}else{stm.setDouble(48, prevenda.getPrvacrper());}
                if(prevenda.getClitel() == null){stm.setNull(49, java.sql.Types.VARCHAR);}else{stm.setString(49, prevenda.getClitel());}
                if(prevenda.getPrvtipatd() == null){stm.setNull(50, java.sql.Types.CHAR);}else{stm.setString(50, prevenda.getPrvtipatd());}
                if(prevenda.getFzdcodsin() == null){stm.setNull(51, java.sql.Types.CHAR);}else{stm.setString(51, prevenda.getFzdcodsin());}
                if(prevenda.getTrnseqsin() == null){stm.setNull(52, java.sql.Types.CHAR);}else{stm.setString(52, prevenda.getTrnseqsin());}
                if(prevenda.getCxanumsin() == null){stm.setNull(53, java.sql.Types.CHAR);}else{stm.setString(53, prevenda.getCxanumsin());}
                if(prevenda.getTrndatsin() == null){stm.setNull(54, java.sql.Types.TIMESTAMP);}else{stm.setString(54, data.format(prevenda.getTrndatsin()));}
                if(prevenda.getPrvcodext() == null){stm.setNull(55, java.sql.Types.VARCHAR);}else{stm.setString(55, prevenda.getPrvcodext());}
                if(prevenda.getPrventdomvol() == null){stm.setNull(56, java.sql.Types.VARCHAR);}else{stm.setString(56, prevenda.getPrventdomvol());}
                if(prevenda.getPrvblodcn() == null){stm.setNull(57, java.sql.Types.CHAR);}else{stm.setString(57, prevenda.getPrvblodcn());}
                if(prevenda.getPrvbloest() == null){stm.setNull(58, java.sql.Types.CHAR);}else{stm.setString(58, prevenda.getPrvbloest());}
                if(prevenda.getPrvblolimcrd() == null){stm.setNull(59, java.sql.Types.CHAR);}else{stm.setString(59, prevenda.getPrvblolimcrd());}
                if(prevenda.getPrvcorcod() == null){stm.setNull(60, java.sql.Types.CHAR);}else{stm.setString(60, prevenda.getPrvcorcod());}
                if(prevenda.getPrvloccod() == null){stm.setNull(61, java.sql.Types.CHAR);}else{stm.setString(61, prevenda.getPrvloccod());}
                if(prevenda.getPrvtipfin() == null){stm.setNull(62, java.sql.Types.CHAR);}else{stm.setString(62, prevenda.getPrvtipfin());}
                if(prevenda.getPrvdcntip() == null){stm.setNull(63, java.sql.Types.CHAR);}else{stm.setString(63, prevenda.getPrvdcntip());}
                if(prevenda.getPrvclicodibge() == null){stm.setNull(64, java.sql.Types.CHAR);}else{stm.setString(64, prevenda.getPrvclicodibge());}
                if(prevenda.getPrvmotlib() == null){stm.setNull(65, java.sql.Types.VARCHAR);}else{stm.setString(65, prevenda.getPrvmotlib());}
                if(prevenda.getCxares() == null){stm.setNull(66, java.sql.Types.CHAR);}else{stm.setString(66, prevenda.getCxares());}
                if(prevenda.getClicpfcnpj() == null){stm.setNull(67, java.sql.Types.VARCHAR);}else{stm.setString(67, prevenda.getClicpfcnpj());}
                if(prevenda.getPrvtipret() == null){stm.setNull(68, java.sql.Types.CHAR);}else{stm.setString(68, prevenda.getPrvtipret());}
                if(prevenda.getForcod() == null){stm.setNull(69, java.sql.Types.CHAR);}else{stm.setString(69, prevenda.getForcod());}
                if(prevenda.getPrvtpfrete() == null){stm.setNull(70, java.sql.Types.CHAR);}else{stm.setString(70, prevenda.getPrvtpfrete());}
                if(prevenda.getPrvindpres() == null){stm.setNull(71, java.sql.Types.CHAR);}else{stm.setString(71, prevenda.getPrvindpres());}
                if(prevenda.getPrvinterind() == null){stm.setNull(72, java.sql.Types.CHAR);}else{stm.setString(72, prevenda.getPrvinterind());}
                if(prevenda.getPrvcnpjinter() == null){stm.setNull(73, java.sql.Types.VARCHAR);}else{stm.setString(73, prevenda.getPrvcnpjinter());}
                if(prevenda.getPrvintermed() == null){stm.setNull(74, java.sql.Types.VARCHAR);}else{stm.setString(74, prevenda.getPrvintermed());}
                if(prevenda.getPrvcnpjpag() == null){stm.setNull(75, java.sql.Types.VARCHAR);}else{stm.setString(75, prevenda.getPrvcnpjpag());}
                if(prevenda.getPrvobs() == null){stm.setNull(76, java.sql.Types.VARCHAR);}else{stm.setString(76, prevenda.getPrvobs());}
                
                if(prevenda.getPrvnum() == null){stm.setNull(77, java.sql.Types.CHAR);}else{stm.setString(77, prevenda.getPrvnum());}
                if(prevenda.getLojcap() == null){stm.setNull(78, java.sql.Types.CHAR);}else{stm.setString(78, prevenda.getLojcap());}
                
                if(stm.executeUpdate() == 1){
                    System.out.println("Prevenda atualizada com sucesso");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(ServicePrevenda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void rmv(Prevenda prevenda){
        if(prevenda.getPrvnum() != null){
            try {
                String query  = "DELETE FROM PREVENDA WHERE PRVNUM = ? AND LOJCAP = ?";
                PreparedStatement stm = this.link.prepareStatement(query);
                if(prevenda.getPrvnum() == null){stm.setNull(2, java.sql.Types.CHAR);}else{stm.setString(2, prevenda.getPrvnum());}
                if(prevenda.getLojcap() == null){stm.setNull(2, java.sql.Types.CHAR);}else{stm.setString(2, prevenda.getLojcap());}
                
                if(stm.executeUpdate() > 0){
                    System.out.println("Prevenda deletada com sucesso");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ServicePrevenda.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
