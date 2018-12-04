/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial.model;

/**
 *
 * @author 2108310
 */
public class Value {
    private float celsiusDegrees;
    private float farenheitDegrees;

    public Value(float celsiusDegrees, float farenheitDegrees) {
        this.celsiusDegrees = celsiusDegrees;
        this.farenheitDegrees = farenheitDegrees;
    }
    
    public float getCelsiusDegrees() {
        return celsiusDegrees;
    }

    public float getFarenheitDegrees() {
        return farenheitDegrees;
    }
}
