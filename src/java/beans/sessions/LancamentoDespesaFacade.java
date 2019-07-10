/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.sessions;

import entidade.LancamentoDespesa;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrador
 */
@Stateless
public class LancamentoDespesaFacade extends AbstractFacade<LancamentoDespesa> {
    @PersistenceContext(unitName = "20062017PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LancamentoDespesaFacade() {
        super(LancamentoDespesa.class);
    }
    
}
