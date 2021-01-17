import java.util.Vector;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RistoranteTest
{
    
    
    
    public RistoranteTest() 
    {
    }
    
    @BeforeAll
    public static void setUpClass() 
    {
    }
    
    @AfterAll
    public static void tearDownClass() 
    {
    }
    
    @BeforeEach
    public void setUp() 
    {
    }
    
    @AfterEach
    public void tearDown() 
    {
    }

    /**
     * Test of AggiungiPiatto method, of class Ristorante.
     */
    @Test
    public void testAggiungiPiatto() 
    {
        Piatti primo = new Piatti("Spaghetti", "Primo");
        Piatti secondo = new Piatti("Piatto", "Secondo");
        Piatti terzo = new Piatti("Spaghetti", "Primo");
        Piatti quarto = new Piatti("Piatto", "Secondo");
        Ristorante r = new Ristorante();
        
        //Vengono aggiunti 4 piatti di cui 2 rimossi, quindi ci aspettiamo che il risultato reale sia 2.
        r.AggiungiPiatto(primo);
        r.AggiungiPiatto(secondo);
        r.RimozionePiatto(primo);
        r.AggiungiPiatto(quarto);
        r.AggiungiPiatto(terzo);
        r.RimozionePiatto(secondo);
    
        int expResult = 2;                  //Nella variabile expResult vienei inserito il risultato teorico, quello che ci aspettiamo noi. in questo caso 2
        int result = r.getSizeMenu();       // Nella variabile reuslt viene inserito il risultato reale, quello calcolato dal metodo.            
        
        System.out.println("Risultato Teorico: " + expResult + " Risultato Reale: " + result); // Questa stringa viene stampata in caso il test dovesse fallire(Viene stampata comunque nell'output della console) e stampare il risultato teorico,
        assertEquals(expResult, result); //COntrolla Se I Valori Sono Giusti                   //ovvero quello che ci aspettavamo, e quello reale che il metodo ha calcolato.
        
    }

    /**
     * Test of RimozionePiatto method, of class Ristorante.
     */
    @Test
    public void testRimozionePiatto() 
    {
        
        Piatti primo = new Piatti("Spaghetti", "Primo");
        Piatti secondo = new Piatti("Piatto", "Secondo");
        Ristorante r = new Ristorante();
        
        //Vengono aggiunti 2 piatti al vettore di cui uno tolto, quindi la grandezza del vettore sara 1, quindi ci aspettiamo che il risultato reale sia 1
        r.AggiungiPiatto(primo);
        r.AggiungiPiatto(secondo);
        r.RimozionePiatto(primo);
        
          int result = r.getSizeMenu();   // Nella variabile reuslt viene inserito il risultato reale, quello calcolato dal metodo.                                   
          int expResult = 1;              //Nella variabile expResult vienei inserito il risultato teorico, quello che ci aspettiamo noi. in questo caso 1
       
        System.out.println("Risultato Teorico: " + expResult + " Risultato Reale: " + result);// Questa stringa viene stampata in caso il test dovesse fallire(Viene stampata comunque nell'output della console) e stampare il risultato teorico,
        assertEquals(expResult, result); //COntrolla Se I Valori Sono Giusti                   //ovvero quello che ci aspettavamo, e quello reale che il metodo ha calcolato.
        
        
    }

    /**
     * Test of AggiungiOrdine method, of class Ristorante.
     */
    @Test
    public void testAggiungiOrdine() {
        Ordine_Tavolo tavolo1 = new Ordine_Tavolo(3, "Marcello");
        Ordine_Tavolo tavolo2 = new Ordine_Tavolo(3, "Marcello");
        Ordine_Tavolo tavolo3 = new Ordine_Tavolo(3, "Marcello");
        Ordine_Tavolo tavolo4 = new Ordine_Tavolo(3, "Marcello");
        Ordine_Tavolo tavolo5 = new Ordine_Tavolo(3, "Marcello");
        Ordine_Tavolo tavolo6 = new Ordine_Tavolo(3, "Marcello");
        Ristorante r = new Ristorante();      
        
        //Vengono aggiunti 6 ordini al vettore per poi toglierne 2, quindi la grandezza del vettore sara 4, infatti ci aspettiamo che il risultato reale sia 4
        r.AggiungiOrdine(tavolo1);
        r.AggiungiOrdine(tavolo2);
        r.AggiungiOrdine(tavolo3);
        r.AggiungiOrdine(tavolo4);
        r.AggiungiOrdine(tavolo5);
        r.AggiungiOrdine(tavolo6);
        r.RimozioneOrdine(tavolo2);
        r.RimozioneOrdine(tavolo6);
        
        int result = r.getSizeOrdine(); // Nella variabile reuslt viene inserito il risultato reale, quello calcolato dal metodo.                                   
        int expResult = 4;              //Nella variabile expResult vienei inserito il risultato teorico, quello che ci aspettiamo noi. in questo caso 4
        
        
        System.out.println("Risultato Teorico: " + expResult + " Risultato Reale: " + result); // Questa stringa viene stampata in caso il test dovesse fallire (Viene stampata comunque nell'output della console) e stampare il risultato teorico,
        assertEquals(expResult, result);                                                       //ovvero quello che ci aspettavamo, e quello reale che il metodo ha calcolato.
        
    }

    /**
     * Test of RimozioneOrdine method, of class Ristorante.
     */
    @Test
    public void testRimozioneOrdine() 
    {    
        Ordine_Tavolo tavolo2 = new Ordine_Tavolo(3, "Marcello");
        Ristorante r = new Ristorante();      
        
        r.AggiungiOrdine(tavolo2); //Viene inserito un ordine, quindi il vettore che contiene tavolo2, la sua grandezza si è ingrandita ad 1
        r.RimozioneOrdine(tavolo2);//Qui viene tolto l'ordine, quindi la grandezza del vettore ritorna a 0, infatti noi ci aspettiamo che il risultato torni 0.
        
        int result = r.getSizeOrdine(); // Nella variabile reuslt viene inserito il risultato reale, quello calcolato dal metodo.                                   
        int expResult = 0;              //Nella variabile expResult vienei inserito il risultato teorico, quello che ci aspettiamo noi. in questo caso 0
        
        System.out.println("Risultato Teorico: " + expResult + " Risultato Reale: " + result); // Questa stringa viene stampata in caso il test dovesse fallire (Viene stampata comunque nell'output della console) e stampare il risultato teorico,
        assertEquals(expResult, result); //COntrolla Se I Valori Sono Giusti                   //ovvero quello che ci aspettavamo, e quello reale che il metodo ha calcolato.
    }

    /**
     * Test of TipoPiatto method, of class Ristorante.
     */
    @Test
    public void testTipoPiatto() 
    {
        
        Piatti primo = new Piatti("Spaghetti", "Primo");
        Piatti secondo = new Piatti("Bistecca", "Secondo");
        Piatti primo2 = new Piatti("Lasagne", "Primo");
        Piatti secondo2 = new Piatti("Salsicce", "Secondo");
        Piatti secondo3 = new Piatti("Pollo", "Secondo");
           
        Ristorante r = new Ristorante();
          
        //Vengono aggiunti vari piatti 
        r.AggiungiPiatto(primo); 
        r.AggiungiPiatto(secondo);
        r.AggiungiPiatto(primo2);
        r.AggiungiPiatto(secondo2);
        r.AggiungiPiatto(secondo3);
        
        
        assertEquals(2, r.TipoPiatto("Primo").size()); //COntrolla Se I Valori Sono Giusti
        
    }

    /**
     * Test of StampaPiatti method, of class Ristorante.
     */
    @Test
    public void testStampaPiatti() 
    {
        Piatti primo = new Piatti("Spaghetti", "Primo");
        Piatti secondo = new Piatti("Bistecca", "Secondo");
        Piatti primo2 = new Piatti("Lasagne", "Primo");
        Piatti secondo2 = new Piatti("Salsicce", "Secondo");
        Piatti secondo3 = new Piatti("Pollo", "Secondo");
           
        Ristorante r = new Ristorante();
                
        r.AggiungiPiatto(primo);
        r.AggiungiPiatto(secondo);
        r.AggiungiPiatto(primo2);
        r.AggiungiPiatto(secondo2);
        r.AggiungiPiatto(secondo3);
    }

    /**
     * Test of IncassoGiornata method, of class Ristorante.
     */
    @Test
    public void testIncassoGiornata() 
    {
        
        Piatti primo = new Piatti("Spaghetti", "Primo");
        Piatti secondo = new Piatti("Piatto", "Secondo");
        Ingredienti ing1 = new Ingredienti("Pomodoro", 3, 1.50);
        Ingredienti ing2 = new Ingredienti("Pasta", 150, 3.50);    
        Ordine_Tavolo tavolo2 = new Ordine_Tavolo(3, "Marcello");
        Ristorante r = new Ristorante();
        
        primo.AggiungiPiatto(ing2);
        primo.AggiungiPiatto(ing1);
        secondo.AggiungiPiatto(ing2);
        primo.AggiungiPiatto(ing2);
        secondo.AggiungiPiatto(ing1);
        
        tavolo2.AggiungiPiatto(primo);       // Viene aggiunto il piatto(primo) a tavolo2 
        tavolo2.AggiungiPiatto(secondo);     // Viene aggiunto il piatto(secondo) a tavolo2   
        
        r.AggiungiOrdine(tavolo2);        // Viene aggiunto l'ordine(tavolo2) 
        
        double x = r.IncassoGiornata();  // Nella variabile x viene inserito il risultato reale, quello calcolato dal metodo.
        double expResult = 13.5;         //Nella variabile expResult vienei inserito il risultato teorico, quello che ci aspettiamo noi.
        double result = x;
        
         System.out.println("Risultato Teorico: " + expResult + " Risultato Reale: " + result); // Questa stringa viene stampata in caso il test dovesse fallire (Viene stampata comunque nell'output della console) e stampare il risultato teorico, 
        assertEquals(expResult, result);   //COntrolla Se I Valori Sono Giusti                  //ovvero quello che ci aspettavamo, e quello reale che il metodo ha calcolato.
    }
    
}
