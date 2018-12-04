/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial.controller;

import com.mycompany.parcial.services.ConversionServicesImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2108310
 */
@RestController
@RequestMapping(value="/convert")
public class ConversionAPIController {
    @Autowired
    private ConversionServicesImpl services;
    
    @RequestMapping(method = RequestMethod.GET,value="/toFarenheit/{value}")
    public ResponseEntity<?> convertCelsiusToFarenheit(@PathVariable("value") float value){
        try{
            return new ResponseEntity<>(services.convertCelsiusToFarenheit(value),HttpStatus.ACCEPTED);
        } catch (Exception e) {
            Logger.getLogger(ConversionAPIController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>("Error",HttpStatus.FORBIDDEN);
        }
    }
    
    @RequestMapping(method = RequestMethod.GET,value="/toCelsius/{value}")
    public ResponseEntity<?> convertFarenheitToCelsius(@PathVariable("value") float value){
        try{
            return new ResponseEntity<>(services.convertFarenheitToCelsius(value),HttpStatus.ACCEPTED);
        } catch (Exception e) {
            Logger.getLogger(ConversionAPIController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>("Error",HttpStatus.FORBIDDEN);
        }
    }
}
