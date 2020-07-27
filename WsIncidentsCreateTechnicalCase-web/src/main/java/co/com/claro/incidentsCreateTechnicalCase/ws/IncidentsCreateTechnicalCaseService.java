/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.incidentsCreateTechnicalCase.ws;

import co.com.claro.incidentsCreateTechnicalCase.Facade.PqrCaseCvFacade;
import co.com.claro.incidentsCreateTechnicalCase.entity.PqrCaseCv;
import co.com.claro.incidentsCreateTechnicalCase.entity.requestCrear;
import co.com.claro.incidentsCreateTechnicalCase.entity.responseCrear;
import co.com.claro.incidentsCreateTechnicalCase.util.Validaciones;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.ejb.EJB;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;

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

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    @Path("Create")
    public responseCrear editar(requestCrear requestT) throws JsonProcessingException, ParseException {
        responseCrear response = new responseCrear();

        try {
            Validaciones val = new Validaciones();

            if (requestT.getFechas() != null) {
                if (val.campoLleno(requestT.getFechas().getDateCase())) {
                    requestT.getDatos().setDateCase(new SimpleDateFormat("dd/MM/yy").parse(requestT.getFechas().getDateCase()));
                } else {
                    requestT.getDatos().setDateCase(null);
                }
                if (val.campoLleno(requestT.getFechas().getCaseDateEnd())) {
                    requestT.getDatos().setCaseDateEnd(new SimpleDateFormat("dd/MM/yy").parse(requestT.getFechas().getCaseDateEnd()));
                } else {
                    requestT.getDatos().setCaseDateEnd(null);
                }
                if (val.campoLleno(requestT.getFechas().getCaseHour())) {
                    requestT.getDatos().setCaseHour(new SimpleDateFormat("dd/MM/yy HH:mm:ss").parse(requestT.getFechas().getCaseHour()));
                } else {
                    requestT.getDatos().setCaseHour(null);
                }
                if (val.campoLleno(requestT.getFechas().getCaseHourEnd())) {
                    requestT.getDatos().setCaseHourEnd(new SimpleDateFormat("dd/MM/yy HH:mm:ss").parse(requestT.getFechas().getCaseHourEnd()));
                } else {
                    requestT.getDatos().setCaseHourEnd(null);
                }
                if (val.campoLleno(requestT.getFechas().getFailureDate())) {
                    requestT.getDatos().setFailureDate(new SimpleDateFormat("dd/MM/yy").parse(requestT.getFechas().getFailureDate()));
                } else {
                    requestT.getDatos().setFailureDate(null);
                }
                if (val.campoLleno(requestT.getFechas().getFailureDateSolution())) {
                    requestT.getDatos().setFailureDateSolution(new SimpleDateFormat("dd/MM/yy").parse(requestT.getFechas().getFailureDateSolution()));
                } else {
                    requestT.getDatos().setFailureDateSolution(null);
                }
                if (val.campoLleno(requestT.getFechas().getDateMod())) {
                    requestT.getDatos().setDateMod(new SimpleDateFormat("dd/MM/yy").parse(requestT.getFechas().getDateMod()));
                } else {
                    requestT.getDatos().setDateMod(null);
                }
                if (val.campoLleno(requestT.getFechas().getDateCreate())) {
                    requestT.getDatos().setDateCreate(new SimpleDateFormat("dd/MM/yy").parse(requestT.getFechas().getDateCreate()));
                } else {
                    requestT.getDatos().setDateCreate(null);
                }

            } else {
                requestT.getDatos().setDateCase(null);
                requestT.getDatos().setCaseDateEnd(null);
                requestT.getDatos().setCaseHour(null);
                requestT.getDatos().setCaseHourEnd(null);
                requestT.getDatos().setFailureDate(null);
                requestT.getDatos().setFailureDateSolution(null);
                requestT.getDatos().setDateMod(null);
                requestT.getDatos().setDateCreate(null);

            }

            PqrCaseCv request = requestT.getDatos();
            if (request.getAccountNumber() != null || request.getIdCase() != null) {
                PqrCaseCv objCrear = pqrFacade.buscarPorCuenta(request);
                if (objCrear != null) {
                    // SE REEMPLAZAN LOS DATOS NUEVOS

                    objCrear = val.validarNulos(request, objCrear);
                    pqrFacade.edit(objCrear);
                    response.isValid = true;
                    response.description = "Transaction Complete";
                } else {
                    response.isValid = false;
                    response.description = "No se encontro ningun registro.";
                }

            } else {
                response.isValid = false;
                response.description = "Debe ir número de cuenta.";
            }

        } catch (Exception e) {
            response.isValid = false;
            response.description = "Falla del servicio de creacion de casos tecnicos. Descripción: " + e.getMessage();
        }
        return response;
    }

}
