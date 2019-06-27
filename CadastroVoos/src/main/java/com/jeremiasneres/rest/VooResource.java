/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeremiasneres.rest;

import com.jeremiasneres.dao.VooDAO;
import com.jeremiasneres.model.Voo;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
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

    /*
    @GET
    @Path("{origem}/{destino}")
    public Voo findById(@PathParam("destino") long id) {
        //System.out.println("findById: " + id);
        return dao.findById(id);
        // return new Piloto();
    }
     */

    //Consultar voos por origem e destino
    @GET
    @Path("{origem}/{destino}")
    public Voo findByOrigemDestino(@PathParam("origem") long idOrigem, @PathParam("destino") long idDestino) {
        return dao.findByOrigemDestino(idOrigem, idDestino);
    }

    //Cadastrar reserva do voo
    @POST
    public void insert(Voo voo) {
        dao.save(voo);
    }

    //Alterar reserva do voo--
/*    @PUT
    public void update(Voo voo) {
        Voo vooBuscado = dao.findById(voo.getId());
        dao.save(vooBuscado);
    }
    @PUT
    public boolean update(Voo voo) {
        //Voo vooBuscado = dao.findById(voo.getId());
        return dao.save(voo) > 0;
    }*/

    @DELETE
    public boolean delete(Voo voo) {
        System.out.println("findById: " + voo);
        return dao.remove(voo.getId());
    }

}
