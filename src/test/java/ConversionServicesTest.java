
import com.mycompany.parcial.model.Value;
import com.mycompany.parcial.services.ConversionServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2108310
 */
@SpringBootTest
public class ConversionServicesTest {
    @Autowired
    private ConversionServicesImpl services;
    
    public void convertToFarenheitTest(){
        Value value1=services.convertCelsiusToFarenheit(10);
        Value value2=services.convertCelsiusToFarenheit(22);
        assertEquals(10, value1.getCelsiusDegrees());
        assertEquals(50, value1.getFarenheitDegrees());
        assertEquals(22, value2.getCelsiusDegrees());
        assertEquals(71.6, value2.getFarenheitDegrees());
    }
    
    public void convertToCelsiusTest(){
        Value value1=services.convertFarenheitToCelsius(50);
        Value value2=services.convertFarenheitToCelsius((float) 71.6);
        assertEquals(10, value1.getCelsiusDegrees());
        assertEquals(50, value1.getFarenheitDegrees());
        assertEquals(22, value2.getCelsiusDegrees());
        assertEquals(71.6, value2.getFarenheitDegrees());
    }
}
