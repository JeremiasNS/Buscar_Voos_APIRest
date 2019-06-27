package com.jeremiasneres.dao;

import com.jeremiasneres.model.Voo;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

/**
 *
 * @author aluno
 */
public class VooDAO extends JpaDAO<Voo> {

    public VooDAO(EntityManager em) {
        super(em, Voo.class);
    }

    public Voo findByOrigemDestino(String cidadeOrigem, String cidadeDestino) {
        String jpql = "select v from Voo v where cidadeOrigem = :cidadeOrigem and cidadeDestino = :cidadeDestino";
        TypedQuery<Voo> query = getEm().createQuery(jpql, Voo.class);
        query.setParameter("cidadeOrigem", cidadeOrigem);
        query.setParameter("cidadeDestino", cidadeDestino);
        return query.getSingleResult();
    }

    @Override
    public void save(Voo entity) {
        getEm().persist(entity);
    }

    public boolean remove(Voo voo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
