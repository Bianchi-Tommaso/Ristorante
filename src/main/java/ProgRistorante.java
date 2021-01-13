public class ProgRistorante 
{
    public static void main(String[] args) 
    {
      
        Ingredienti Ing1 = new Ingredienti("Pomodoro", 3, 1.50);
        Ingredienti Ing2 = new Ingredienti("Pasta", 150, 3.50);
        Ingredienti Ing3 = new Ingredienti("Formaggio", 10, 2.50);
        Ingredienti Ing4 = new Ingredienti("Carne", 4, 5.50);
        Ingredienti Ing5 = new Ingredienti("Olio", 2, 3.50);
        Piatti Primo = new Piatti("Piatto", "Primo");
        Piatti Secondo = new Piatti("Piatto", "Secondo");
        Ordine Tavolo1 = new Ordine(2);
        Ordine_Tavolo Tavolo2 = new Ordine_Tavolo(3, "Marcello");
        Ordine_Domicilio Domicilio = new Ordine_Domicilio(4, "via Firenze", "20:00" );
        Ristorante R = new Ristorante();
        
        
        Primo.AggiungiPiatto(Ing1);
        Primo.AggiungiPiatto(Ing2);
        Primo.AggiungiPiatto(Ing3);
        
        Secondo.AggiungiPiatto(Ing4);
        Secondo.AggiungiPiatto(Ing5);
        
        Tavolo2.AggiungiPiatto(Primo);
        Tavolo2.AggiungiPiatto(Secondo);
        
        Domicilio.AggiungiPiatto(Primo);
        Domicilio.AggiungiPiatto(Secondo);
        
        R.AggiungiOrdine(Tavolo2);
        R.AggiungiOrdine(Domicilio);
        
       // System.out.println("L'incasso Giornata E': " + R.IncassoGiornata());
        R.StampaPiatti();
        
        System.out.println("Il Prezzo Totale E' Il Seguente: " + Tavolo2.PrezzoTotale());
        System.out.println("Il Prezzo Totale Della Consegna A Domicilio E': " + Domicilio.PrezzoTotale());
        System.out.println("L'incasso Totale E': " + R.IncassoGiornata());
    }
}
