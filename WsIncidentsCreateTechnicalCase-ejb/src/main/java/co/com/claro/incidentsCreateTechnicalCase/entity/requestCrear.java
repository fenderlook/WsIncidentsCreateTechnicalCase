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
public class requestCrear {

    @Getter @Setter
    private PqrCaseCv datos;
    
    @Getter @Setter
    private requestFechas fechas;

}
