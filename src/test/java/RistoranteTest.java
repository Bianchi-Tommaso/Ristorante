/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Vector;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author HP
 */
public class RistoranteTest {
    
    
    
    public RistoranteTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of AggiungiPiatto method, of class Ristorante.
     */
    @Test
    public void testAggiungiPiatto() {
        System.out.println("AggiungiPiatto");
        Piatti x = null;
        Ristorante instance = new Ristorante();
        instance.AggiungiPiatto(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RimozionePiatto method, of class Ristorante.
     */
    @Test
    public void testRimozionePiatto() {
        System.out.println("RimozionePiatto");
        Piatti x = null;
        Ristorante instance = new Ristorante();
        instance.RimozionePiatto(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AggiungiOrdine method, of class Ristorante.
     */
    @Test
    public void testAggiungiOrdine() {
        System.out.println("AggiungiOrdine");
        Ordine x = null;
        Ristorante instance = new Ristorante();
        instance.AggiungiOrdine(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RimozioneOrdine method, of class Ristorante.
     */
    @Test
    public void testRimozioneOrdine() {
        System.out.println("RimozioneOrdine");
        Ordine x = null;
        Ristorante instance = new Ristorante();
        instance.RimozioneOrdine(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TipoPiatto method, of class Ristorante.
     */
    @Test
    public void testTipoPiatto() 
    {
        
        Piatti Primo = new Piatti("Spaghetti", "Primo");
        Piatti Secondo = new Piatti("Bistecca", "Secondo");
        Piatti Primo2 = new Piatti("Lasagne", "Primo");
        Piatti Secondo2 = new Piatti("Salsicce", "Secondo");
        Piatti Secondo3 = new Piatti("Pollo", "Secondo");
           
        Ristorante r = new Ristorante();
                
        r.AggiungiPiatto(Primo);
        r.AggiungiPiatto(Secondo);
        r.AggiungiPiatto(Primo2);
        r.AggiungiPiatto(Secondo2);
        r.AggiungiPiatto(Secondo3);
        
        
        
        System.out.println("TipoPiatto");
        assertEquals(2, r.TipoPiatto("Primo").size());
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of StampaPiatti method, of class Ristorante.
     */
    @Test
    public void testStampaPiatti() {
        System.out.println("StampaPiatti");
        Ristorante instance = new Ristorante();
        instance.StampaPiatti();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of IncassoGiornata method, of class Ristorante.
     */
    @Test
    public void testIncassoGiornata() {
        System.out.println("IncassoGiornata");
        Ristorante instance = new Ristorante();
        double expResult = 0.0;
        double result = instance.IncassoGiornata();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
