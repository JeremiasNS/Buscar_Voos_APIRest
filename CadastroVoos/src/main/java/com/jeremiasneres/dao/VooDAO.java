package com.jeremiasneres.dao;

import com.jeremiasneres.model.Voo;
import java.time.LocalDate;
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
    public Voo findByOrigemDestinoDataPartida(long idCidadeOrigem, long idCidadeDestino, LocalDate dataPartida) {
        String jpql = "select v from Voo v where cidadeOrigem.id = :cidadeOrigem and cidadeDestino.id = :cidadeDestino and horadataPartida = :horadataPartida";
        TypedQuery<Voo> query = getEm().createQuery(jpql, Voo.class);
        query.setParameter("cidadeOrigem", idCidadeOrigem);
        query.setParameter("cidadeDestino", idCidadeDestino);
        query.setParameter("horadataPartida", dataPartida);
        return query.getSingleResult();
    }

    public Voo findByOrigemDestinoPreco(long idCidadeOrigem, long idCidadeDestino, 
            LocalDate dataPartida,  long preco) {
        String jpql = "select v from Voo v where cidadeOrigem.id = :cidadeOrigem "
                + "and cidadeDestino.id = :cidadeDestino "
                + "and horadataPartida = :horadataPartida "
                + "and precoPacagem = :precoPacagem";
               // + "and precoPacagem <= :atePreco";
        TypedQuery<Voo> query = getEm().createQuery(jpql, Voo.class);
        query.setParameter("cidadeOrigem", idCidadeOrigem);
        query.setParameter("cidadeDestino", idCidadeDestino);
        query.setParameter("horadataPartida", dataPartida);
        query.setParameter("precoPacagem", preco);
        return query.getSingleResult();
    }

    public Voo findByOrigemDestinoFaixaPreco(long idCidadeOrigem, long idCidadeDestino, 
            LocalDate dataPartida, long dePreco, long atePreco) {
        String jpql = "select v from Voo v where cidadeOrigem.id = :cidadeOrigem "
                + "and cidadeDestino.id = :cidadeDestino "
                + "and horadataPartida = :horadataPartida "
                + "and precoPacagem >= :dePreco "
                + "and precoPacagem <= :atePreco";
        TypedQuery<Voo> query = getEm().createQuery(jpql, Voo.class);
        query.setParameter("cidadeOrigem", idCidadeOrigem);
        query.setParameter("cidadeDestino", idCidadeDestino);
        query.setParameter("horadataPartida", dataPartida);
        query.setParameter("dePreco", dePreco);
        query.setParameter("atePreco", atePreco);
        return query.getSingleResult();
    }

    @Override
    public void saveForPost(Voo entity) {
        getEm().persist(entity);
    }
    
    @Override
    public long save(Voo entity) {
        if(entity.getId() > 0)
            getEm().merge(entity);
        else getEm().persist(entity);

        return entity.getId();
    }

  

}
