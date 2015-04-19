/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.registro.imp;

import com.registro.HibernateUtil;
import com.registro.modelo.Clientes;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClienteDAOImp {

    private Session session = HibernateUtil.getSessionFactory().openSession();

    public void insertar(Clientes cliente) {
        Transaction tx = session.beginTransaction();
        try {
            session.save(cliente);
            tx.commit();
        } catch (Exception e) {
            System.out.println("Error en insertar " + e.getMessage());
            tx.rollback();
        }
    }

    public void actualizar(Clientes cliente) {
        Transaction tx = session.beginTransaction();
        try {
            session.update(cliente);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Error en actualizar" + e.getMessage());
            tx.rollback();
        }
    }

    public void borrar(Clientes cliente) {
        Transaction tx = session.beginTransaction();
        try {
            session.delete(cliente);
            tx.commit();
        } catch (Exception e) {
            System.out.println("Error en borrar" + e.getMessage());
            tx.rollback();
        }
    }

    public Clientes buscarPorId(Integer id) {
        return (Clientes) session.load(Clientes.class, id);
    }

    public List<Clientes> buscarTodos() {
        return session.createQuery("from Clientes").list();
    }

    public List<Clientes> buscarPorApellido(String ape) {
        Query q = session.createQuery("from Clientes as l where l.cliApe like concat('%',:cadena,'%')");
        q.setParameter("cadena", ape);
        return q.list();
    }
}
