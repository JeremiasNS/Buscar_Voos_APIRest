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

    public Voo findByOrigemDestino(long idCidadeOrigem, long idCidadeDestino) {
        String jpql = "select v from Voo v where cidadeOrigem.id = :cidadeOrigem and cidadeDestino.id = :cidadeDestino";
        TypedQuery<Voo> query = getEm().createQuery(jpql, Voo.class);
        query.setParameter("cidadeOrigem", idCidadeOrigem);
        query.setParameter("cidadeDestino", idCidadeDestino);
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
