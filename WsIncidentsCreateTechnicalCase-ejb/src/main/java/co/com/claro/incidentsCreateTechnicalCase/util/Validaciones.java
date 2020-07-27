/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.incidentsCreateTechnicalCase.util;

import co.com.claro.incidentsCreateTechnicalCase.entity.PqrCaseCv;

/**
 *
 * @author ECM0210H
 */
public class Validaciones {

    public PqrCaseCv validarNulos(PqrCaseCv request, PqrCaseCv objetoActualizar) {
//        if (campoLleno(request.getId() + "")) {
//            objetoActualizar.setId(request.getId());
//        }

        if (campoLleno(request.getRequest())) {
            objetoActualizar.setRequest(request.getRequest());
        }

        if (campoLleno(request.getReason())) {
            objetoActualizar.setReason(request.getReason());
        }

        if (campoLleno(request.getPhoneNumber())) {
            objetoActualizar.setPhoneNumber(request.getPhoneNumber());
        }

        if (campoLleno(request.getAddressedTo())) {
            objetoActualizar.setAddressedTo(request.getAddressedTo());
        }
        if (campoLleno(request.getApplicantName())) {
            objetoActualizar.setApplicantName(request.getApplicantName());
        }
        if (campoLleno(request.getApplicantSurname())) {
            objetoActualizar.setApplicantSurname(request.getApplicantSurname());
        }
        if (campoLleno(request.getEmail())) {
            objetoActualizar.setEmail(request.getEmail());
        }
        if (campoLleno(request.getContactNumber())) {
            objetoActualizar.setContactNumber(request.getContactNumber());
        }
        if (campoLleno(request.getRequestObject())) {
            objetoActualizar.setRequestObject(request.getRequestObject());
        }
        if (campoLleno(request.getFactsRequest())) {
            objetoActualizar.setFactsRequest(request.getFactsRequest());
        }
        if (campoLleno(request.getAccountNumber())) {
            objetoActualizar.setAccountNumber(request.getAccountNumber());
        }
        if (campoLleno(request.getTransaction())) {
            objetoActualizar.setTransaction(request.getTransaction());
        }
        if (campoLleno(request.getIdState() + "")) {
            objetoActualizar.setIdState(request.getIdState());
        }
        if (campoLleno(request.getDateCase() + "")) {
            objetoActualizar.setDateCase(request.getDateCase());
        }
        if (campoLleno(request.getIdCategory())) {
            objetoActualizar.setIdCategory(request.getIdCategory());
        }
        if (campoLleno(request.getIdSubcategory())) {
            objetoActualizar.setIdSubcategory(request.getIdSubcategory());
        }
        if (campoLleno(request.getIdCustomerVoice())) {
            objetoActualizar.setIdCustomerVoice(request.getIdCustomerVoice());
        }
        if (campoLleno(request.getIdCloseCode())) {
            objetoActualizar.setIdCloseCode(request.getIdCloseCode());
        }
        if (campoLleno(request.getOriginCase())) {
            objetoActualizar.setOriginCase(request.getOriginCase());
        }
        if (campoLleno(request.getCaseDateEnd() + "")) {
            objetoActualizar.setCaseDateEnd(request.getCaseDateEnd());
        }
        if (campoLleno(request.getCaseHour() + "")) {
            objetoActualizar.setCaseHour(request.getCaseHour());
        }
        if (campoLleno(request.getCaseHourEnd() + "")) {
            objetoActualizar.setCaseHourEnd(request.getCaseHourEnd());
        }
        if (campoLleno(request.getChannel())) {
            objetoActualizar.setChannel(request.getChannel());
        }
        if (campoLleno(request.getAdviser())) {
            objetoActualizar.setAdviser(request.getAdviser());
        }
        if (campoLleno(request.getComments())) {
            objetoActualizar.setComments(request.getComments());
        }
        if (campoLleno(request.getCustomerIdentification())) {
            objetoActualizar.setCustomerIdentification(request.getCustomerIdentification());
        }
        if (campoLleno(request.getPersonReport())) {
            objetoActualizar.setPersonReport(request.getPersonReport());
        }
        if (campoLleno(request.getNamePersonReport())) {
            objetoActualizar.setNamePersonReport(request.getNamePersonReport());
        }
        if (campoLleno(request.getNode())) {
            objetoActualizar.setNode(request.getNode());
        }
        if (campoLleno(request.getCcmm())) {
            objetoActualizar.setCcmm(request.getCcmm());
        }
        if (campoLleno(request.getProduct())) {
            objetoActualizar.setProduct(request.getProduct());
        }
        if (campoLleno(request.getService())) {
            objetoActualizar.setService(request.getService());
        }
        if (campoLleno(request.getSubservice())) {
            objetoActualizar.setSubservice(request.getSubservice());
        }
        if (campoLleno(request.getFunctionality())) {
            objetoActualizar.setFunctionality(request.getFunctionality());
        }
        if (campoLleno(request.getStatusReason())) {
            objetoActualizar.setStatusReason(request.getStatusReason());
        }
        if (campoLleno(request.getTimeByState())) {
            objetoActualizar.setTimeByState(request.getTimeByState());
        }
        if (campoLleno(request.getSla())) {
            objetoActualizar.setSla(request.getSla());
        }
        if (campoLleno(request.getAddressFails())) {
            objetoActualizar.setAddressFails(request.getAddressFails());
        }
        if (campoLleno(request.getCity())) {
            objetoActualizar.setCity(request.getCity());
        }
        if (campoLleno(request.getDepartment())) {
            objetoActualizar.setDepartment(request.getDepartment());
        }
        if (campoLleno(request.getLatitude())) {
            objetoActualizar.setLatitude(request.getLatitude());
        }
        if (campoLleno(request.getLongitude())) {
            objetoActualizar.setLongitude(request.getLongitude());
        }
        if (campoLleno(request.getSector())) {
            objetoActualizar.setSector(request.getSector());
        }
        if (campoLleno(request.getZone())) {
            objetoActualizar.setZone(request.getZone());
        }
        if (campoLleno(request.getZoneType())) {
            objetoActualizar.setZoneType(request.getZoneType());
        }
        if (campoLleno(request.getDiagnosisLevel())) {
            objetoActualizar.setDiagnosisLevel(request.getDiagnosisLevel());
        }
        if (campoLleno(request.getTypificationCloseCase())) {
            objetoActualizar.setTypificationCloseCase(request.getTypificationCloseCase());
        }
        if (campoLleno(request.getDiagnosticGuide())) {
            objetoActualizar.setDiagnosticGuide(request.getDiagnosticGuide());
        }
        if (campoLleno(request.getCause())) {
            objetoActualizar.setCause(request.getCause());
        }
        if (campoLleno(request.getAction())) {
            objetoActualizar.setAction(request.getAction());
        }
        if (campoLleno(request.getCaseAssignmentGroup())) {
            objetoActualizar.setCaseAssignmentGroup(request.getCaseAssignmentGroup());
        }
        if (campoLleno(request.getIncidentAssignmentGroup())) {
            objetoActualizar.setIncidentAssignmentGroup(request.getIncidentAssignmentGroup());
        }
        if (campoLleno(request.getNotes())) {
            objetoActualizar.setNotes(request.getNotes());
        }
        if (campoLleno(request.getImpact())) {
            objetoActualizar.setImpact(request.getImpact());
        }
        if (campoLleno(request.getUrgency())) {
            objetoActualizar.setUrgency(request.getUrgency());
        }
        if (campoLleno(request.getPriority())) {
            objetoActualizar.setPriority(request.getPriority());
        }
        if (campoLleno(request.getRelatedIncident())) {
            objetoActualizar.setRelatedIncident(request.getRelatedIncident());
        }
        if (campoLleno(request.getRelatedChange())) {
            objetoActualizar.setRelatedChange(request.getRelatedChange());
        }
        if (campoLleno(request.getIdPublication())) {
            objetoActualizar.setIdPublication(request.getIdPublication());
        }
        if (campoLleno(request.getFailureDate() + "")) {
            objetoActualizar.setFailureDate(request.getFailureDate());
        }
        if (campoLleno(request.getFailureDateSolution() + "")) {
            objetoActualizar.setFailureDateSolution(request.getFailureDateSolution());
        }
        if (campoLleno(request.getIncidentManagementSystem())) {
            objetoActualizar.setIncidentManagementSystem(request.getIncidentManagementSystem());
        }
        if (campoLleno(request.getBaseStations())) {
            objetoActualizar.setBaseStations(request.getBaseStations());
        }
        if (campoLleno(request.getMsisdnFailure())) {
            objetoActualizar.setMsisdnFailure(request.getMsisdnFailure());
        }
        if (campoLleno(request.getTechnology())) {
            objetoActualizar.setTechnology(request.getTechnology());
        }
        if (campoLleno(request.getLineType())) {
            objetoActualizar.setLineType(request.getLineType());
        }
        if (campoLleno(request.getPlanType())) {
            objetoActualizar.setPlanType(request.getPlanType());
        }
        if (campoLleno(request.getEquipmentModel())) {
            objetoActualizar.setEquipmentModel(request.getEquipmentModel());
        }
        if (campoLleno(request.getIdCase())) {
            objetoActualizar.setIdCase(request.getIdCase());
        }
        if (campoLleno(request.getUserMod())) {
            objetoActualizar.setUserMod(request.getUserMod());
        }
        if (campoLleno(request.getDateMod() + "")) {
            objetoActualizar.setDateMod(request.getDateMod());
        }
        if (campoLleno(request.getStatus())) {
            objetoActualizar.setStatus(request.getStatus());
        }
        if (campoLleno(request.getTypeRequest())) {
            objetoActualizar.setTypeRequest(request.getTypeRequest());
        }
        if (campoLleno(request.getProblem())) {
            objetoActualizar.setProblem(request.getProblem());
        }
        if (campoLleno(request.getRemedy())) {
            objetoActualizar.setRemedy(request.getRemedy());
        }
        if (campoLleno(request.getUserCreate())) {
            objetoActualizar.setUserCreate(request.getUserCreate());
        }
        if (campoLleno(request.getDateCreate() + "")) {
            objetoActualizar.setDateCreate(request.getDateCreate());
        }

        return objetoActualizar;
    }
    
    public boolean campoLleno(String campo) {
        if (campo == null || campo.equals("") || campo.equals("null")) {
            return false;
        } else {
            return true;
        }
    }

}
