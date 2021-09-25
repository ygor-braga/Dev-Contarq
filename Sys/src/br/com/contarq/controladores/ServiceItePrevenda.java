/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.contarq.controladores;

import br.com.contarq.dao.ItePrevenda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ServiceItePrevenda {
    Connection link = null;
    
    public ServiceItePrevenda(Connection link){
        this.link = link;
    }
    
    public void add(ItePrevenda iteprevenda){
        if(checkProforlin(iteprevenda.getProcod())){
            //if(checkDcnmax(iteprevenda.getProcod(), iteprevenda.getIpvdcn(), iteprevenda.getIpvdcntip(), (iteprevenda.getIpvqtd() * iteprevenda.getIpvvlruni()))){
        
                try {
                    String query = "INSERT INTO ITEPREVENDA(PRVNUM, PROCOD, LOJCOD, IPVQTD, IPVVLRUNI, IPVDCN, IPVDCNTIP, IPVTRF, IPVTIP, IPVFAB, IPVOBS, IPVQTDEFE, IPVASSTIP, IPVASSCOD, IPVQTDBONENV, IPVPRODES, IPVPRODESRDZ, IPVSECCOD, IPVTRBID, IPVSERPRO, PROCODAUX, IPVCTREST, FUNCOD, IPVPRODESVAR, IPVTXAENT, IPVCODASS, IPVPERDCN, IPVPRCVDA, IPVDESVLR, IPVPRCGAR, IPVCSTPIS, IPVALIQPIS, IPVCSTCOFINS, IPVALIQCOFINS) "
                            + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) RETURNING ID";
                    PreparedStatement stm = link.prepareStatement(query);

                    if(iteprevenda.getPrvnum() == null || iteprevenda.getPrvnum().equals("")){stm.setNull(1, java.sql.Types.CHAR);}else{stm.setString(1, iteprevenda.getPrvnum());}
                    if(iteprevenda.getProcod() == null || iteprevenda.getProcod().equals("")){stm.setNull(2, java.sql.Types.CHAR);}else{stm.setString(2, iteprevenda.getProcod());}
                    if(iteprevenda.getLojcod() == null || iteprevenda.getLojcod().equals("")){stm.setNull(3, java.sql.Types.CHAR);}else{stm.setString(3, iteprevenda.getLojcod());}
                    if(iteprevenda.getIpvqtd() == null){stm.setNull(4, java.sql.Types.NUMERIC);}else{stm.setDouble(4, iteprevenda.getIpvqtd());}
                    if(iteprevenda.getIpvvlruni() == null){stm.setNull(5, java.sql.Types.NUMERIC);}else{stm.setDouble(5, iteprevenda.getIpvvlruni());}
                    if(iteprevenda.getIpvdcn() == null){stm.setNull(6, java.sql.Types.NUMERIC);}else{stm.setDouble(6, iteprevenda.getIpvdcn());}
                    if(iteprevenda.getIpvdcntip() == null || iteprevenda.getIpvdcntip().equals("")){stm.setNull(7, java.sql.Types.CHAR);}else{stm.setString(7, iteprevenda.getIpvdcntip());}
                    if(iteprevenda.getIpvtrf() == null || iteprevenda.getIpvtrf().equals("")){stm.setNull(8, java.sql.Types.CHAR);}else{stm.setString(8, iteprevenda.getIpvtrf());}
                    if(iteprevenda.getIpvtip() == null || iteprevenda.getIpvtip().equals("")){stm.setNull(9, java.sql.Types.CHAR);}else{stm.setString(9, iteprevenda.getIpvtip());}
                    if(iteprevenda.getIpvfab() == null || iteprevenda.getIpvfab().equals("")){stm.setNull(10, java.sql.Types.CHAR);}else{stm.setString(10, iteprevenda.getIpvfab());}
                    if(iteprevenda.getIpvobs() == null || iteprevenda.getIpvobs().equals("")){stm.setNull(11, java.sql.Types.VARCHAR);}else{stm.setString(11, iteprevenda.getIpvobs());}
                    if(iteprevenda.getIpvqtdefe() == null){stm.setNull(12, java.sql.Types.NUMERIC);}else{stm.setDouble(12, iteprevenda.getIpvqtdefe());}
                    if(iteprevenda.getIpvasstip() == null || iteprevenda.getIpvasstip().equals("")){stm.setNull(13, java.sql.Types.CHAR);}else{stm.setString(13, iteprevenda.getIpvasstip());}
                    if(iteprevenda.getIpvasscod() == null || iteprevenda.getIpvasscod().equals("")){stm.setNull(14, java.sql.Types.CHAR);}else{stm.setString(14, iteprevenda.getIpvasscod());}
                    if(iteprevenda.getIpvqtdbonenv() == null){stm.setNull(15, java.sql.Types.INTEGER);}else{stm.setInt(15, iteprevenda.getIpvqtdbonenv());}
                    if(iteprevenda.getIpvprodes() == null || iteprevenda.getIpvprodes().equals("")){stm.setNull(16, java.sql.Types.VARCHAR);}else{stm.setString(16, iteprevenda.getIpvprodes());}
                    if(iteprevenda.getIpvprodesrdz() == null || iteprevenda.getIpvprodesrdz().equals("")){stm.setNull(17, java.sql.Types.CHAR);}else{stm.setString(17, iteprevenda.getIpvprodesrdz());}
                    if(iteprevenda.getIpvseccod() == null || iteprevenda.getIpvseccod().equals("")){stm.setNull(18, java.sql.Types.CHAR);}else{stm.setString(18, iteprevenda.getIpvseccod());}
                    if(iteprevenda.getIpvtrbid() == null || iteprevenda.getIpvtrbid().equals("")){stm.setNull(19, java.sql.Types.CHAR);}else{stm.setString(19, iteprevenda.getIpvtrbid());}
                    if(iteprevenda.getIpvserpro() == null || iteprevenda.getIpvserpro().equals("")){stm.setNull(20, java.sql.Types.VARCHAR);}else{stm.setString(20, iteprevenda.getIpvserpro());}
                    if(iteprevenda.getProcodaux() == null || iteprevenda.getProcodaux().equals("")){stm.setNull(21, java.sql.Types.CHAR);}else{stm.setString(21, iteprevenda.getProcodaux());}
                    if(iteprevenda.getIpvctrest() == null || iteprevenda.getIpvctrest().equals("")){stm.setNull(22, java.sql.Types.CHAR);}else{stm.setString(22, iteprevenda.getIpvctrest());}
                    if(iteprevenda.getFuncod() == null || iteprevenda.getFuncod().equals("")){stm.setNull(23, java.sql.Types.CHAR);}else{stm.setString(23, iteprevenda.getFuncod());}
                    if(iteprevenda.getIpvprodesvar() == null || iteprevenda.getIpvprodesvar().equals("")){stm.setNull(24, java.sql.Types.CHAR);}else{stm.setString(24, iteprevenda.getIpvprodesvar());}
                    if(iteprevenda.getIpvtxaent() == null || iteprevenda.getIpvtxaent().equals("")){stm.setNull(25, java.sql.Types.CHAR);}else{stm.setString(25, iteprevenda.getIpvtxaent());}
                    if(iteprevenda.getIpvcodass() == null || iteprevenda.getIpvcodass().equals("")){stm.setNull(26, java.sql.Types.CHAR);}else{stm.setString(26, iteprevenda.getIpvcodass());}
                    if(iteprevenda.getIpvperdcn() == null || iteprevenda.getIpvperdcn().equals("")){stm.setNull(27, java.sql.Types.CHAR);}else{stm.setString(27, iteprevenda.getIpvperdcn());}
                    if(iteprevenda.getIpvprcdva() == null){stm.setNull(28, java.sql.Types.NUMERIC);}else{stm.setDouble(28, iteprevenda.getIpvprcdva());}
                    if(iteprevenda.getIpvdesvlr() == null){stm.setNull(29, java.sql.Types.NUMERIC);}else{stm.setDouble(29, iteprevenda.getIpvdesvlr());}
                    if(iteprevenda.getIpvprcgar() == null){stm.setNull(30, java.sql.Types.NUMERIC);}else{stm.setDouble(30, iteprevenda.getIpvprcgar());}
                    if(iteprevenda.getIpvcstpis() == null || iteprevenda.getIpvcstpis().equals("")){stm.setNull(31, java.sql.Types.VARCHAR);}else{stm.setString(31, iteprevenda.getIpvcstpis());}
                    if(iteprevenda.getIpvaliqpis() == null){stm.setNull(32, java.sql.Types.NUMERIC);}else{stm.setDouble(32, iteprevenda.getIpvaliqpis());}
                    if(iteprevenda.getIpvcstcofins() == null || iteprevenda.getIpvcstcofins().equals("")){stm.setNull(33, java.sql.Types.VARCHAR);}else{stm.setString(33, iteprevenda.getIpvcstcofins());}
                    if(iteprevenda.getIpvaliqcofins() == null){stm.setNull(34, java.sql.Types.NUMERIC);}else{stm.setDouble(34, iteprevenda.getIpvaliqcofins());}

                    ResultSet result = stm.executeQuery();
                    if(result.next()){
                        iteprevenda.setId(result.getInt("ID"));

                        query = "UPDATE ITEPREVENDA SET PRVNUM = ?, PROCOD = ?, LOJCOD = ?, IPVQTD = ?, IPVVLRUNI = ?, IPVDCN = ?, IPVDCNTIP = ?, IPVTRF = ?, IPVTIP = ?, IPVFAB = ?, IPVOBS = ?, IPVQTDEFE = ?, IPVASSTIP = ?, IPVASSCOD = ?, IPVQTDBONENV = ?, IPVPRODES = ?, IPVPRODESRDZ = ?, IPVSECCOD = ?, IPVTRBID = ?, IPVSERPRO = ?, PROCODAUX = ?, IPVCTREST = ?, FUNCOD = ?, IPVPRODESVAR = ?, IPVTXAENT = ?, IPVCODASS = ?, IPVPERDCN = ?, IPVPRCVDA = ?, IPVDESVLR = ?, IPVPRCGAR = ?, IPVCSTPIS = ?, IPVALIQPIS = ?, IPVCSTCOFINS = ?, IPVALIQCOFINS = ? WHERE ID = ?";
                        stm = link.prepareStatement(query);

                        if(iteprevenda.getPrvnum() == null || iteprevenda.getPrvnum().equals("")){stm.setNull(1, java.sql.Types.CHAR);}else{stm.setString(1, iteprevenda.getPrvnum());}
                        if(iteprevenda.getProcod() == null || iteprevenda.getProcod().equals("")){stm.setNull(2, java.sql.Types.CHAR);}else{stm.setString(2, iteprevenda.getProcod());}
                        if(iteprevenda.getLojcod() == null || iteprevenda.getLojcod().equals("")){stm.setNull(3, java.sql.Types.CHAR);}else{stm.setString(3, iteprevenda.getLojcod());}
                        if(iteprevenda.getIpvqtd() == null){stm.setNull(4, java.sql.Types.NUMERIC);}else{stm.setDouble(4, iteprevenda.getIpvqtd());}
                        if(iteprevenda.getIpvvlruni() == null){stm.setNull(5, java.sql.Types.NUMERIC);}else{stm.setDouble(5, iteprevenda.getIpvvlruni());}
                        if(iteprevenda.getIpvdcn() == null){stm.setNull(6, java.sql.Types.NUMERIC);}else{stm.setDouble(6, iteprevenda.getIpvdcn());}
                        if(iteprevenda.getIpvdcntip() == null || iteprevenda.getIpvdcntip().equals("")){stm.setNull(7, java.sql.Types.CHAR);}else{stm.setString(7, iteprevenda.getIpvdcntip());}
                        if(iteprevenda.getIpvtrf() == null || iteprevenda.getIpvtrf().equals("")){stm.setNull(8, java.sql.Types.CHAR);}else{stm.setString(8, iteprevenda.getIpvtrf());}
                        if(iteprevenda.getIpvtip() == null || iteprevenda.getIpvtip().equals("")){stm.setNull(9, java.sql.Types.CHAR);}else{stm.setString(9, iteprevenda.getIpvtip());}
                        if(iteprevenda.getIpvfab() == null || iteprevenda.getIpvfab().equals("")){stm.setNull(10, java.sql.Types.CHAR);}else{stm.setString(10, iteprevenda.getIpvfab());}
                        if(iteprevenda.getIpvobs() == null || iteprevenda.getIpvobs().equals("")){stm.setNull(11, java.sql.Types.VARCHAR);}else{stm.setString(11, iteprevenda.getIpvobs());}
                        if(iteprevenda.getIpvqtdefe() == null){stm.setNull(12, java.sql.Types.NUMERIC);}else{stm.setDouble(12, iteprevenda.getIpvqtdefe());}
                        if(iteprevenda.getIpvasstip() == null || iteprevenda.getIpvasstip().equals("")){stm.setNull(13, java.sql.Types.CHAR);}else{stm.setString(13, iteprevenda.getIpvasstip());}
                        if(iteprevenda.getIpvasscod() == null || iteprevenda.getIpvasscod().equals("")){stm.setNull(14, java.sql.Types.CHAR);}else{stm.setString(14, iteprevenda.getIpvasscod());}
                        if(iteprevenda.getIpvqtdbonenv() == null){stm.setNull(15, java.sql.Types.INTEGER);}else{stm.setInt(15, iteprevenda.getIpvqtdbonenv());}
                        if(iteprevenda.getIpvprodes() == null || iteprevenda.getIpvprodes().equals("")){stm.setNull(16, java.sql.Types.VARCHAR);}else{stm.setString(16, iteprevenda.getIpvprodes());}
                        if(iteprevenda.getIpvprodesrdz() == null || iteprevenda.getIpvprodesrdz().equals("")){stm.setNull(17, java.sql.Types.CHAR);}else{stm.setString(17, iteprevenda.getIpvprodesrdz());}
                        if(iteprevenda.getIpvseccod() == null || iteprevenda.getIpvseccod().equals("")){stm.setNull(18, java.sql.Types.CHAR);}else{stm.setString(18, iteprevenda.getIpvseccod());}
                        if(iteprevenda.getIpvtrbid() == null || iteprevenda.getIpvtrbid().equals("")){stm.setNull(19, java.sql.Types.CHAR);}else{stm.setString(19, iteprevenda.getIpvtrbid());}
                        if(iteprevenda.getIpvserpro() == null || iteprevenda.getIpvserpro().equals("")){stm.setNull(20, java.sql.Types.VARCHAR);}else{stm.setString(20, iteprevenda.getIpvserpro());}
                        if(iteprevenda.getProcodaux() == null || iteprevenda.getProcodaux().equals("")){stm.setNull(21, java.sql.Types.CHAR);}else{stm.setString(21, iteprevenda.getProcodaux());}
                        if(iteprevenda.getIpvctrest() == null || iteprevenda.getIpvctrest().equals("")){stm.setNull(22, java.sql.Types.CHAR);}else{stm.setString(22, iteprevenda.getIpvctrest());}
                        if(iteprevenda.getFuncod() == null || iteprevenda.getFuncod().equals("")){stm.setNull(23, java.sql.Types.CHAR);}else{stm.setString(23, iteprevenda.getFuncod());}
                        if(iteprevenda.getIpvprodesvar() == null || iteprevenda.getIpvprodesvar().equals("")){stm.setNull(24, java.sql.Types.CHAR);}else{stm.setString(24, iteprevenda.getIpvprodesvar());}
                        if(iteprevenda.getIpvtxaent() == null || iteprevenda.getIpvtxaent().equals("")){stm.setNull(25, java.sql.Types.CHAR);}else{stm.setString(25, iteprevenda.getIpvtxaent());}
                        if(iteprevenda.getIpvcodass() == null || iteprevenda.getIpvcodass().equals("")){stm.setNull(26, java.sql.Types.CHAR);}else{stm.setString(26, iteprevenda.getIpvcodass());}
                        if(iteprevenda.getIpvperdcn() == null || iteprevenda.getIpvperdcn().equals("")){stm.setNull(27, java.sql.Types.CHAR);}else{stm.setString(27, iteprevenda.getIpvperdcn());}
                        if(iteprevenda.getIpvprcdva() == null){stm.setNull(28, java.sql.Types.NUMERIC);}else{stm.setDouble(28, iteprevenda.getIpvprcdva());}
                        if(iteprevenda.getIpvdesvlr() == null){stm.setNull(29, java.sql.Types.NUMERIC);}else{stm.setDouble(29, iteprevenda.getIpvdesvlr());}
                        if(iteprevenda.getIpvprcgar() == null){stm.setNull(30, java.sql.Types.NUMERIC);}else{stm.setDouble(30, iteprevenda.getIpvprcgar());}
                        if(iteprevenda.getIpvcstpis() == null || iteprevenda.getIpvcstpis().equals("")){stm.setNull(31, java.sql.Types.VARCHAR);}else{stm.setString(31, iteprevenda.getIpvcstpis());}
                        if(iteprevenda.getIpvaliqpis() == null){stm.setNull(32, java.sql.Types.NUMERIC);}else{stm.setDouble(32, iteprevenda.getIpvaliqpis());}
                        if(iteprevenda.getIpvcstcofins() == null || iteprevenda.getIpvcstcofins().equals("")){stm.setNull(33, java.sql.Types.VARCHAR);}else{stm.setString(33, iteprevenda.getIpvcstcofins());}
                        if(iteprevenda.getIpvaliqcofins() == null){stm.setNull(34, java.sql.Types.NUMERIC);}else{stm.setDouble(34, iteprevenda.getIpvaliqcofins());}
                        stm.setInt(35, iteprevenda.getId());

                        stm.executeUpdate();
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ServiceItePrevenda.class.getName()).log(Level.SEVERE, null, ex);
                }
            //}else{
                //System.out.println("VALOR DE DESCONTO INVALIDO");
            //}
        }else{
            System.out.println("PRODUTO FORA DE LINHA");
        }
    }
    
    public void update(ItePrevenda iteprevenda){
        if(iteprevenda.getId() != null){
            if(checkProforlin(iteprevenda.getProcod())){
                if(checkDcnmax(iteprevenda.getProcod(), iteprevenda.getIpvdcn(), iteprevenda.getIpvdcntip(), (iteprevenda.getIpvqtd() * iteprevenda.getIpvvlruni()))){

                    try {
                        String query = "UPDATE ITEPREVENDA SET PRVNUM = ?, PROCOD = ?, LOJCOD = ?, IPVQTD = ?, IPVVLRUNI = ?, IPVDCN = ?, IPVDCNTIP = ?, IPVTRF = ?, IPVTIP = ?, IPVFAB = ?, IPVOBS = ?, IPVQTDEFE = ?, IPVASSTIP = ?, IPVASSCOD = ?, IPVQTDBONENV = ?, IPVPRODES = ?, IPVPRODESRDZ = ?, IPVSECCOD = ?, IPVTRBID = ?, IPVSERPRO = ?, PROCODAUX = ?, IPVCTREST = ?, FUNCOD = ?, IPVPRODESVAR = ?, IPVTXAENT = ?, IPVCODASS = ?, IPVPERDCN = ?, IPVPRCVDA = ?, IPVDESVLR = ?, IPVPRCGAR = ?, IPVCSTPIS = ?, IPVALIQPIS = ?, IPVCSTCOFINS = ?, IPVALIQCOFINS = ? WHERE ID = ?";
                        PreparedStatement stm = link.prepareStatement(query);

                        if(iteprevenda.getPrvnum() == null || iteprevenda.getPrvnum().equals("")){stm.setNull(1, java.sql.Types.CHAR);}else{stm.setString(1, iteprevenda.getPrvnum());}
                        if(iteprevenda.getProcod() == null || iteprevenda.getProcod().equals("")){stm.setNull(2, java.sql.Types.CHAR);}else{stm.setString(2, iteprevenda.getProcod());}
                        if(iteprevenda.getLojcod() == null || iteprevenda.getLojcod().equals("")){stm.setNull(3, java.sql.Types.CHAR);}else{stm.setString(3, iteprevenda.getLojcod());}
                        if(iteprevenda.getIpvqtd() == null){stm.setNull(4, java.sql.Types.NUMERIC);}else{stm.setDouble(4, iteprevenda.getIpvqtd());}
                        if(iteprevenda.getIpvvlruni() == null){stm.setNull(5, java.sql.Types.NUMERIC);}else{stm.setDouble(5, iteprevenda.getIpvvlruni());}
                        if(iteprevenda.getIpvdcn() == null){stm.setNull(6, java.sql.Types.NUMERIC);}else{stm.setDouble(6, iteprevenda.getIpvdcn());}
                        if(iteprevenda.getIpvdcntip() == null || iteprevenda.getIpvdcntip().equals("")){stm.setNull(7, java.sql.Types.CHAR);}else{stm.setString(7, iteprevenda.getIpvdcntip());}
                        if(iteprevenda.getIpvtrf() == null || iteprevenda.getIpvtrf().equals("")){stm.setNull(8, java.sql.Types.CHAR);}else{stm.setString(8, iteprevenda.getIpvtrf());}
                        if(iteprevenda.getIpvtip() == null || iteprevenda.getIpvtip().equals("")){stm.setNull(9, java.sql.Types.CHAR);}else{stm.setString(9, iteprevenda.getIpvtip());}
                        if(iteprevenda.getIpvfab() == null || iteprevenda.getIpvfab().equals("")){stm.setNull(10, java.sql.Types.CHAR);}else{stm.setString(10, iteprevenda.getIpvfab());}
                        if(iteprevenda.getIpvobs() == null || iteprevenda.getIpvobs().equals("")){stm.setNull(11, java.sql.Types.VARCHAR);}else{stm.setString(11, iteprevenda.getIpvobs());}
                        if(iteprevenda.getIpvqtdefe() == null){stm.setNull(12, java.sql.Types.NUMERIC);}else{stm.setDouble(12, iteprevenda.getIpvqtdefe());}
                        if(iteprevenda.getIpvasstip() == null || iteprevenda.getIpvasstip().equals("")){stm.setNull(13, java.sql.Types.CHAR);}else{stm.setString(13, iteprevenda.getIpvasstip());}
                        if(iteprevenda.getIpvasscod() == null || iteprevenda.getIpvasscod().equals("")){stm.setNull(14, java.sql.Types.CHAR);}else{stm.setString(14, iteprevenda.getIpvasscod());}
                        if(iteprevenda.getIpvqtdbonenv() == null){stm.setNull(15, java.sql.Types.INTEGER);}else{stm.setInt(15, iteprevenda.getIpvqtdbonenv());}
                        if(iteprevenda.getIpvprodes() == null || iteprevenda.getIpvprodes().equals("")){stm.setNull(16, java.sql.Types.VARCHAR);}else{stm.setString(16, iteprevenda.getIpvprodes());}
                        if(iteprevenda.getIpvprodesrdz() == null || iteprevenda.getIpvprodesrdz().equals("")){stm.setNull(17, java.sql.Types.CHAR);}else{stm.setString(17, iteprevenda.getIpvprodesrdz());}
                        if(iteprevenda.getIpvseccod() == null || iteprevenda.getIpvseccod().equals("")){stm.setNull(18, java.sql.Types.CHAR);}else{stm.setString(18, iteprevenda.getIpvseccod());}
                        if(iteprevenda.getIpvtrbid() == null || iteprevenda.getIpvtrbid().equals("")){stm.setNull(19, java.sql.Types.CHAR);}else{stm.setString(19, iteprevenda.getIpvtrbid());}
                        if(iteprevenda.getIpvserpro() == null || iteprevenda.getIpvserpro().equals("")){stm.setNull(20, java.sql.Types.VARCHAR);}else{stm.setString(20, iteprevenda.getIpvserpro());}
                        if(iteprevenda.getProcodaux() == null || iteprevenda.getProcodaux().equals("")){stm.setNull(21, java.sql.Types.CHAR);}else{stm.setString(21, iteprevenda.getProcodaux());}
                        if(iteprevenda.getIpvctrest() == null || iteprevenda.getIpvctrest().equals("")){stm.setNull(22, java.sql.Types.CHAR);}else{stm.setString(22, iteprevenda.getIpvctrest());}
                        if(iteprevenda.getFuncod() == null || iteprevenda.getFuncod().equals("")){stm.setNull(23, java.sql.Types.CHAR);}else{stm.setString(23, iteprevenda.getFuncod());}
                        if(iteprevenda.getIpvprodesvar() == null || iteprevenda.getIpvprodesvar().equals("")){stm.setNull(24, java.sql.Types.CHAR);}else{stm.setString(24, iteprevenda.getIpvprodesvar());}
                        if(iteprevenda.getIpvtxaent() == null || iteprevenda.getIpvtxaent().equals("")){stm.setNull(25, java.sql.Types.CHAR);}else{stm.setString(25, iteprevenda.getIpvtxaent());}
                        if(iteprevenda.getIpvcodass() == null || iteprevenda.getIpvcodass().equals("")){stm.setNull(26, java.sql.Types.CHAR);}else{stm.setString(26, iteprevenda.getIpvcodass());}
                        if(iteprevenda.getIpvperdcn() == null || iteprevenda.getIpvperdcn().equals("")){stm.setNull(27, java.sql.Types.CHAR);}else{stm.setString(27, iteprevenda.getIpvperdcn());}
                        if(iteprevenda.getIpvprcdva() == null){stm.setNull(28, java.sql.Types.NUMERIC);}else{stm.setDouble(28, iteprevenda.getIpvprcdva());}
                        if(iteprevenda.getIpvdesvlr() == null){stm.setNull(29, java.sql.Types.NUMERIC);}else{stm.setDouble(29, iteprevenda.getIpvdesvlr());}
                        if(iteprevenda.getIpvprcgar() == null){stm.setNull(30, java.sql.Types.NUMERIC);}else{stm.setDouble(30, iteprevenda.getIpvprcgar());}
                        if(iteprevenda.getIpvcstpis() == null || iteprevenda.getIpvcstpis().equals("")){stm.setNull(31, java.sql.Types.VARCHAR);}else{stm.setString(31, iteprevenda.getIpvcstpis());}
                        if(iteprevenda.getIpvaliqpis() == null){stm.setNull(32, java.sql.Types.NUMERIC);}else{stm.setDouble(32, iteprevenda.getIpvaliqpis());}
                        if(iteprevenda.getIpvcstcofins() == null || iteprevenda.getIpvcstcofins().equals("")){stm.setNull(33, java.sql.Types.VARCHAR);}else{stm.setString(33, iteprevenda.getIpvcstcofins());}
                        if(iteprevenda.getIpvaliqcofins() == null){stm.setNull(34, java.sql.Types.NUMERIC);}else{stm.setDouble(34, iteprevenda.getIpvaliqcofins());}
                        stm.setInt(35, iteprevenda.getId());

                        stm.executeUpdate();
                    } catch (SQLException ex) {
                        Logger.getLogger(ServiceItePrevenda.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    System.out.println("VALOR DE DESCONTO INVALIDO");
                }
            }else{
                System.out.println("PRODUTO FORA DE LINHA");
            }
        }else{
            System.out.println("ERROR: Item não adcionado");
        }
    }
    
    public void rmv(ItePrevenda iteprevenda){
        if(iteprevenda.getId() != null){
            try {
                String query = "DELETE FROM ITEPREVENDA WHERE ID = ?";
                PreparedStatement stm = link.prepareStatement(query);
                stm.setInt(1, iteprevenda.getId());
                stm.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(ServiceItePrevenda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("ERROR: Item não presente");
        }
    }
        
    //VERIFICA SE O PRODUTO JÁ ESTÁ FORA DE LINHA {TRUE => SIM | FALSE => NÃO}
    private boolean checkProforlin(String procod){        
        String check = "SELECT * FROM PRODUTO WHERE PROCOD = ?";
        PreparedStatement stm;
        try {
            stm = link.prepareStatement(check);
            stm.setString(1, procod);
            ResultSet result = stm.executeQuery();
            if(result.next()){
                if(result.getString("PROFORLIN").equals("N")){
                    stm.close();
                    return true;
                }
            }else{
                System.out.println("ERROR: Produto não encontrado.");
            }
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceItePrevenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    //VERIFICA SE O VALOR DO DESCONTO É IGUAL OU MENOR AO DESCONTO MAX {TRUE => ABAIXO OU IGUAL | FALSE => ACIMA DO VALOR}
    private boolean checkDcnmax(String procod, Double dcn, String dcntip, Double vlr){ 
        String check = "SELECT * FROM PRODUTO WHERE PROCOD = ?";
        PreparedStatement stm;
        try {
            stm = link.prepareStatement(check);
            stm.setString(1, procod);
            ResultSet result = stm.executeQuery();
            if(result.next()){
                Double dcnmax = result.getDouble("PRODCNMAX");                
                if(dcntip.equals("V")){
                    dcn = (dcn / vlr) * 100;
                }
                if(dcn <= dcnmax){
                    stm.close();
                    return true;
                }
            }else{
                System.out.println("ERROR: Produto não encontrado.");
            }            
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(ServiceItePrevenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
