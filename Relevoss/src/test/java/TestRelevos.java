/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.relevoss.Utilitaria;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author David
 */
public class TestRelevos {
    
    public TestRelevos() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void TestMayorCorredor1() 
     {
         Utilitaria util=  new Utilitaria ();
        boolean bo = util.mayorCorredor1(15);
         assertTrue(bo);
     }
    
     @Test
     public void TestMayorCorredor2() 
     {
         Utilitaria util=  new Utilitaria ();
        boolean bo = util.mayorCorredor1(45);
         assertTrue(bo);
     }

 
      @Test
     public void bandera() 
     {
         Utilitaria util=  new Utilitaria ();
        boolean bo = util.bandera(2);
         assertTrue(bo);
     }
}
