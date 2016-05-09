/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Persona;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository(value = "dao")
@Transactional(propagation = Propagation.REQUIRED,timeout = 60,readOnly = true)
public class DaoJPAImplementacion implements Dao{

    @PersistenceContext
    EntityManager em;
    
    @Override
    public List<Persona> getTodas() {
        return em.createQuery("SELECT p FROM Persona p").getResultList();
    }

    @Override    
    @Transactional(readOnly = false )
    public void insertar(Object o) {
        em.persist(o);
    }

    @Override
    @Transactional(readOnly = false)
    public void eliminar(Object o) {
        em.remove(o);
    }

    @Override
    @Transactional(readOnly = false)
    public void actualizar(Object o) {
        em.merge(o);
    }
    
}
