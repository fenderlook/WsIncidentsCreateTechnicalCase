/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.incidentsCreateTechnicalCase.ws;

import co.com.claro.incidentsCreateTechnicalCase.Facade.PqrCaseCvFacade;
import co.com.claro.incidentsCreateTechnicalCase.entity.requestCrear;
import co.com.claro.incidentsCreateTechnicalCase.entity.responseCrear;
import co.com.claro.incidentsCreateTechnicalCase.util.Validaciones;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.text.ParseException;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ws.rs.POST;

/**
 *
 * @author omarMad
 */
@Path("IncidentsCreateTechnicalCase")
@Stateless
@TransactionManagement
public class IncidentsCreateTechnicalCaseService {

    public IncidentsCreateTechnicalCaseService() {
    }
    @EJB
    private PqrCaseCvFacade pqrFacade;

    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("create")
    public responseCrear crear(requestCrear requestT) throws JsonProcessingException, ParseException {
        responseCrear response = new responseCrear();
        try {
            Validaciones val = new Validaciones();
            // VALIDAR LAS FECHAS QUE LLEGAN
            requestT = val.validarFechas(requestT);
            //VALIDAR LOS CAMPOS QUE SON OBLIGATORIOS
            String validarObligatorios = val.validarObligatorios(requestT);
            if (validarObligatorios == "") {
                // VALIDAR POR SEGURIDAD LOS CAMPOS NULOS
                requestT.setDatos(val.validarNulos(requestT.getDatos(), requestT.getDatos()));
                int cantidad = pqrFacade.findAll().size();
                requestT.getDatos().setId(Long.parseLong((cantidad + 1) + ""));
                // LLENAR CON CEROS EL IDCASE HASTA LLEGAR A LOS 15 DÍGITOS
                requestT.getDatos().setIdCase(String.format("%015d", cantidad + 1));
                // CREAR CASO
                pqrFacade.create(requestT.getDatos());
                response.isValid = true;
                response.description = "El caso N." + requestT.getDatos().getIdCase() + " fue creado correctamente.";
            } else {
                // NO VAN LOS MÍNIMOS OBLIGATORIOS
                response.isValid = false;
                response.description = "Debe ir" + validarObligatorios + ". Por favor completar los datos.";
            }
        } catch (NumberFormatException | ParseException e) {
            // ERROR INESPERADO DEL SERVICIO
            response.isValid = false;
            response.description = "Falla del servicio de creacion de casos tecnicos. Descripción: " + e.getMessage();
        }
        return response;
    }
}
