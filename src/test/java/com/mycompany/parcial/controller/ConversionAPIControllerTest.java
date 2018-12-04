/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.parcial.controller;

import com.mycompany.parcial.remoteconection.Conection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *
 * @author 2108310
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class ConversionAPIControllerTest {
    @LocalServerPort
    private int port;
    
    private ArrayList<Conection> conexiones= new ArrayList<>();
    
    
    public ConversionAPIControllerTest() {
        for (int i=0;i<10;i++){
            conexiones.add(new Conection());
        }
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
     * Test of convertCelsiusToFarenheit method, of class ConversionAPIController.
     */
    @Test
    public void test10RemoteConnections() {
        for (int i=0;i<10;i++){
            conexiones.get(i).connect("http://localhost:"+port+"/convert/toFarenheit/10");
        }
        
        
        System.out.println("Conexion existosa"+1);
        conexiones.get(0).start();
        System.out.println("Conexion existosa "+2);
        conexiones.get(1).start();
        System.out.println("Conexion existosa "+3);
        conexiones.get(2).start();
        System.out.println("Conexion existosa "+4);
        conexiones.get(3).start();
        System.out.println("Conexion existosa "+5);
        conexiones.get(4).start();
        System.out.println("Conexion existosa "+6);
        conexiones.get(5).start();
        System.out.println("Conexion existosa "+7);
        conexiones.get(6).start();
        System.out.println("Conexion existosa "+8);
        conexiones.get(7).start();
        System.out.println("Conexion existosa "+9);
        conexiones.get(8).start();
        System.out.println("Conexion existosa "+10);
        conexiones.get(9).start();
        
//        for (int i=0;i<10;i++){
//            System.out.println("Conexion "+(i+1));
//            assertEquals(202, conexiones.get(i).getResponseCode());
//            assertEquals("{\"celsiusDegrees\":10.0,\"farenheitDegrees\":50.0}", conexiones.get(i).getResult());
//        }
        
        
    }

    
}
