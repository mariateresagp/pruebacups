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
import javax.faces.bean.ApplicationScoped;

/**
 *
 * @author Tere
 */
@ManagedBean (name = "bajaBean")
@ApplicationScoped
public class bajaBean implements Serializable{
    private int codigo;
    private Clientes cli;
    /**
     * Creates a new instance of bajaBean
     */
    public bajaBean() {
    }

    public int getCodigo() {
        return codigo;
    }

    public Clientes getCli() {
        return cli;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCli(Clientes cli) {
        this.cli = cli;
    }
     public String confirmar(Clientes x){
        this.cli=x;
        return "borrar";
    }
    
    public String borrar(){
        ClienteDAOImp a = new ClienteDAOImp();
        a.borrar(cli);
        return "index";
    }
    
    
}
