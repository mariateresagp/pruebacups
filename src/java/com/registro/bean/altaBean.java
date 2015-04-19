/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.registro.bean;

import com.registro.imp.ClienteDAOImp;
import com.registro.modelo.Clientes;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Tere
 */
@ManagedBean (name = "altaBean")
@RequestScoped
public class altaBean implements Serializable{
   private Clientes cli;

    /**
     * Creates a new instance of altaBean
     */
    public altaBean() {
        cli= new Clientes();
    }

    public void setCli(Clientes cli) {
        this.cli = cli;
    }

    public Clientes getCli() {
        return cli;
    }
    public String insertar() {
        ClienteDAOImp a = new ClienteDAOImp();
        a.insertar(cli);
        return "index";
    }
}
