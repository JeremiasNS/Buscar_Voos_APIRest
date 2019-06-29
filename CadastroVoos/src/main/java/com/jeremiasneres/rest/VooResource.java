/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jeremiasneres.rest;

import com.jeremiasneres.dao.VooDAO;
import com.jeremiasneres.model.Voo;
import java.time.LocalDate;
import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Jeremias Neres
 */
@Transactional
@Path("/voo")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VooResource {

    @Inject
    private VooDAO dao;

<<<<<<< HEAD
 //Consultar voos por origem e destino
=======
    //Consultar voos por origem e destino
>>>>>>> f78c545... Implantando demais funcionalidades
    @GET
    @Path("{origem}/{destino}")
     public Voo findByOrigemDestino(@PathParam("origem") long idOrigem, @PathParam("destino") long idDestino) {
        return dao.findByOrigemDestino(idOrigem, idDestino);
    }
    
    //Consultar voos por origem, destino, data de partida e faixa de preço
    @GET
    @Path("{origem}/{destino}/{dataPartida}/{preco}")
    public Voo findByOrigemDestinoFaixaPreco(@PathParam("origem") long idOrigem,
            @PathParam("destino") long idDestino,
            @PathParam("dataPartida") String dataPartida,
            @PathParam("preco") long preco){
        return dao.findByOrigemDestinoFaixaPreco(idOrigem, idDestino, 
                LocalDate.parse(dataPartida), preco);
    }
    
    //Consultar voos por origem, destino e data de partida
    @GET
    @Path("{origem}/{destino}/{datapartida}")
    public Voo findByOrigemDestinoDataPartida(@PathParam("origem") long idOrigem,
            @PathParam("destino") long idDestino,
            @PathParam("datapartida") String dataPartida) {
        return dao.findByOrigemDestinoDataPartida(idOrigem, idDestino, LocalDate.parse(dataPartida));
    }

    //Cadastrar reserva do voo
    @POST
    public void insert(Voo voo) {
        dao.saveForPost(voo);
    }

    //Alterar reserva do voo
    @PUT
    public boolean update(Voo voo) {
        return dao.save(voo) > 0;
    }

    
    //Excluir reserva do voo
    @DELETE
    @Path("{id}")
    public boolean delete(@PathParam("id") long id) {
        Voo voo = dao.findById(id);
        if (voo == null) {
            throw new WebApplicationException(Response.Status.NOT_FOUND);
        }

        return dao.delete(voo);
    }

}
