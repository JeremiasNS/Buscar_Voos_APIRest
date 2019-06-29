/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeremiasneres.dao;

import com.jeremiasneres.model.Cadastro;
import javax.persistence.EntityManager;

/**
 *
 * @author aluno
 * @param <T>
 */
public class JpaDAO<T extends Cadastro> implements DAO<T> {

    private final EntityManager em;
    private final Class<T> classe;

    public JpaDAO(EntityManager em, Class<T> classe) {
        this.em = em;
        this.classe = classe;
    }

    @Override
    public T findById(Long id) {
        return getEm().find(classe, id);
    }

     @Override
    public void saveForPost(T entity) {
        getEm().persist(entity);
    }
    
    @Override
    public long save(T entity) {
        /*Se a entidade tem um ID maior que 0 é porque está sendo
        alterada. Se estivesse sendo incluída, não teria um ID ainda.
        Assim, para inclusão usamos persist() e para alteração usamos merge().*/
        if (entity.getId() > 0) {
            em.merge(entity);
        } else {
            em.persist(entity);
        }

        return entity.getId();
    }

    @Override
    public boolean delete(T entity) {
        em.remove(entity);
        return true;
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

}
