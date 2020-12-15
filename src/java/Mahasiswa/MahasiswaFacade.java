/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mahasiswa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Arif Budiman Ar
 */
@Stateless
public class MahasiswaFacade extends AbstractFacade<Mahasiswa> {

    @PersistenceContext(unitName = "2018CWS3PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MahasiswaFacade() {
        super(Mahasiswa.class);
    }
    
}
