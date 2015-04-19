/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.registro.bean;

import com.registro.imp.ClienteDAOImp;
import com.registro.modelo.Clientes;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Tere
 */
@ManagedBean
@SessionScoped

public class indexBean implements Serializable{
private List<Clientes> cliente;
private String busquedastr = "";
private boolean visible;
/**
* Creates a new instance of indexBean
*/
public indexBean() {
}
public List<Clientes> getCliente() {
ClienteDAOImp a = new ClienteDAOImp();
this.cliente = a.buscarPorApellido(busquedastr);
return cliente;
}
public String filtrar(String x) {
ClienteDAOImp a = new ClienteDAOImp();
this.cliente = a.buscarPorApellido(x);
return "index";
}
public String borrar(int id) {
ClienteDAOImp a = new ClienteDAOImp();
Clientes clien = a.buscarPorId(id);
a.borrar(clien);
return "index";
}
public String getBusquedastr() {
return busquedastr;
}
public void setBusquedastr(String busquedastr) {
this.busquedastr = busquedastr;
    
}

public boolean isVisible() {
if (this.cliente == null) {
this.visible = true;
} else {
this.visible = !this.cliente.isEmpty();
}
return visible;
}
public void setVisible(boolean visible) {
this.visible = visible;
}
}