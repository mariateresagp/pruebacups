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
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Tere
 */
@ManagedBean(name ="editarBean")
@SessionScoped
public class editarBean implements Serializable{
  ClienteDAOImp a= new ClienteDAOImp();
  private Clientes cli;
    /**
     * Creates a new instance of editarBean
     */
    public editarBean() {
    }

    public ClienteDAOImp getA() {
        return a;
    }

    public Clientes getCli() {
        return cli;
    }

    public void setA(ClienteDAOImp a) {
        this.a = a;
    }

    public void setCli(Clientes cli) {
        this.cli = cli;
    }
    public String editar(Integer x) {
        setCli(a.buscarPorId(x));        
        return "editar";
    }

    public String guardar() {
        a.actualizar(cli);
        return "index";
    }
}
