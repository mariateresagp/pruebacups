package com.registro.modelo;
// Generated 10-nov-2014 19:14:12 by Hibernate Tools 3.6.0



/**
 * Clientes generated by hbm2java
 */
public class Clientes  implements java.io.Serializable {


     private Integer cliId;
     private String cliNom;
     private String cliApe;
     private String cliDir;
     private String cliPcia;

    public Clientes() {
    }

    public Clientes(String cliNom, String cliApe, String cliDir, String cliPcia) {
       this.cliNom = cliNom;
       this.cliApe = cliApe;
       this.cliDir = cliDir;
       this.cliPcia = cliPcia;
    }
   
    public Integer getCliId() {
        return this.cliId;
    }
    
    public void setCliId(Integer cliId) {
        this.cliId = cliId;
    }
    public String getCliNom() {
        return this.cliNom;
    }
    
    public void setCliNom(String cliNom) {
        this.cliNom = cliNom;
    }
    public String getCliApe() {
        return this.cliApe;
    }
    
    public void setCliApe(String cliApe) {
        this.cliApe = cliApe;
    }
    public String getCliDir() {
        return this.cliDir;
    }
    
    public void setCliDir(String cliDir) {
        this.cliDir = cliDir;
    }
    public String getCliPcia() {
        return this.cliPcia;
    }
    
    public void setCliPcia(String cliPcia) {
        this.cliPcia = cliPcia;
    }




}


