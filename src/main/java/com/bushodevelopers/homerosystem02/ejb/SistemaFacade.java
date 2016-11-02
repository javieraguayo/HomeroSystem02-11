/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bushodevelopers.homerosystem02.ejb;

import com.bushodevelopers.homerosystem02.model.Sistema;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author javie
 */
@Stateless
public class SistemaFacade extends AbstractFacade<Sistema> {

    @PersistenceContext(unitName = "com.bushoDevelopers_HomeroSystem02-11_war_1.0PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SistemaFacade() {
        super(Sistema.class);
    }
    
}