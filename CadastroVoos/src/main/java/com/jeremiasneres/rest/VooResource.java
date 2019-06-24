/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeremiasneres.rest;

import com.jeremiasneres.dao.DAO;
import com.jeremiasneres.dao.VooDAO;
import com.jeremiasneres.model.Voo;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author aluno
 */
@Transactional
@Path("/voo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VooResource {

    @Inject
    private VooDAO dao;

    @GET
    @Path("{origem}/{destino}")
    public Voo findById(@PathParam("destino") long id) {
        //System.out.println("findById: " + id);
        return dao.findById(id);
        // return new Piloto();
    }
    

    @GET
    @Path("{origem}/{destino}")
    public Voo findByOrigemDestino(@PathParam("origem")String origem, @PathParam("destino")String destino) {
        return dao.findByOrigemDestino(origem, destino);
    }    

    @POST
    public void insert(Voo voo) {
        dao.save(voo);
    }

}
