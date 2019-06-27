package com.jeremiasneres.rest;

import com.jeremiasneres.dao.DAO;
import com.jeremiasneres.model.Piloto;
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
@Path("/piloto")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PilotoResource {
   
    @Inject
    private DAO<Piloto> dao;

    @GET
    @Path("{id}")
    public Piloto findById(@PathParam("id") long id) {
       //System.out.println("findById: " + id);
        return dao.findById(id);
       // return new Piloto();
    }

    @POST
    public void insert(Piloto piloto) {
        dao.save(piloto);
    }

}
