/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial.services;

import com.mycompany.parcial.model.Value;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2108310
 */
@Service
public class ConversionServicesImpl {
    public Value convertCelsiusToFarenheit(float value){
        return new Value(value, ((value*9)/5) + 32);
    }
    
    public Value convertFarenheitToCelsius(float value){
        return new Value(((value-32)*5)/9, value);
    }
}
