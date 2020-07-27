/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.incidentsCreateTechnicalCase.Facade;

import co.com.claro.incidentsCreateTechnicalCase.entity.PqrCaseCv;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ECM0210H
 */
@Stateless
public class PqrCaseCvFacade extends AbstractFacade<PqrCaseCv> {

    @PersistenceContext(unitName = "CreateCase")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PqrCaseCvFacade() {
        super(PqrCaseCv.class);
    }

    public PqrCaseCv buscarPorCuenta(PqrCaseCv request) {
        String validarCuenta = "";
        if (request.getAccountNumber() != null) {
            validarCuenta = "q.accountNumber = '" + request.getAccountNumber() + "'";
        }
        String validarIdCaso = "";
        if (request.getIdCase() != null) {
            validarIdCaso = "q.idCase = '" + request.getIdCase() + "'";
        }

        if (validarCuenta.length() > 1) {
            if (validarIdCaso.length() > 1) {
                validarIdCaso = " AND " + validarIdCaso;
            }
        }

        List<PqrCaseCv> lista = (List<PqrCaseCv>) em.createQuery("SELECT q FROM PqrCaseCv q WHERE " + validarCuenta + validarIdCaso).getResultList();
        if (lista.size() > 0) {
            PqrCaseCv obj = lista.get(0);
            return obj;
        } else {
            return null;
        }
    }
}
