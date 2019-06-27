package com.jeremiasneres.rest;

import com.jeremiasneres.dao.VooDAO;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Path;

/**
 *
 * @author jeremias
 */
@Transactional
@Path("/voogen")
public class VooResourceGenerico {
    
    @Inject
    private VooDAO dao;

    
}
