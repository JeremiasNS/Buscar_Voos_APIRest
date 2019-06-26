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
    public void save(T entity) {
        getEm().persist(entity);
    }

    @Override
    public boolean remove(Long id) {
        getEm().remove(id);
        return true;
    }

    /**
     * @return the em
     */
    public EntityManager getEm() {
        return em;
    }

}
