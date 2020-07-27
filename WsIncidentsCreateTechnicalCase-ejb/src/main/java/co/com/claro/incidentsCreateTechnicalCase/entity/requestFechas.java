/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.incidentsCreateTechnicalCase.entity;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author ECM0210H
 */
public class requestFechas {

    @Getter
    @Setter
    private String dateCase;

    @Getter
    @Setter
    private String caseDateEnd;

    @Getter
    @Setter
    private String caseHour;

    @Getter
    @Setter
    private String caseHourEnd;

    @Getter
    @Setter
    private String failureDate;

    @Getter
    @Setter
    private String failureDateSolution;

    @Getter
    @Setter
    private String dateMod;
    
    @Getter
    @Setter
    private String dateCreate;

}
