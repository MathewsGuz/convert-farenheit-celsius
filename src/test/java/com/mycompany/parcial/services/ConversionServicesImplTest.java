/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial.services;

import com.mycompany.parcial.model.Value;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2108310
 */
public class ConversionServicesImplTest {
    
    public ConversionServicesImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of convertCelsiusToFarenheit method, of class ConversionServicesImpl.
     */
    
    
    @Test
    public void convertToFarenheitTest(){
        ConversionServicesImpl services = new ConversionServicesImpl();
        Value value1=services.convertCelsiusToFarenheit(10);
        Value value2=services.convertCelsiusToFarenheit(22);
        assertEquals(10, value1.getCelsiusDegrees(),0.1);
        assertEquals(50, value1.getFarenheitDegrees(),0.1);
        assertEquals(22, value2.getCelsiusDegrees(),0.1);
        assertEquals(71.6, value2.getFarenheitDegrees(),0.1);
    }
    
    @Test
    public void convertToCelsiusTest(){
        ConversionServicesImpl services = new ConversionServicesImpl();
        Value value1=services.convertFarenheitToCelsius(50);
        Value value2=services.convertFarenheitToCelsius((float) 71.6);
        assertEquals(10, value1.getCelsiusDegrees(),0.1);
        assertEquals(50, value1.getFarenheitDegrees(),0.1);
        assertEquals(22, value2.getCelsiusDegrees(),0.1);
        assertEquals(71.6, value2.getFarenheitDegrees(),0.1);
    }
    
}
