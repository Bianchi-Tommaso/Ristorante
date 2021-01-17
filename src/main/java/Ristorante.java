
import java.util.ArrayList;
import java.util.Vector;

public class Ristorante 
{
    private ArrayList<Ordine> Ordine = new ArrayList<Ordine>();
    private ArrayList<Piatti> Menu = new ArrayList<Piatti>();
    
    public void AggiungiPiatto(Piatti x)      //ggiunge a Menu un Piatto passato come parametro
    {
        Menu.add(x);
    }
    
    public void RimozionePiatto(Piatti x)       //rimuove da Menu un Piatto passato come parametro
    {
        Menu.remove(x);
    }
    
    public void AggiungiOrdine(Ordine x)    //Aggiunge in Ordine un ordine passato come parametro
    {
        Ordine.add(x);
    }
    
    public Ristorante RimozioneOrdine(Ordine x)  //rimuove da Ordine un ordine passato come parametro
    {
        Ordine.remove(x);
        return null;
    }
    
    public int getSizeOrdine()   //ritorna la grandezza di Ordine
    {
        return Ordine.size();
    }
    
     public int getSizeMenu()    //ritorna la grandezza di menu
    {
        return Menu.size();
    }
     
    public Vector<Piatti> TipoPiatto(String tipop) //Questo metodo controllo se la stringa passata si trova all'interno di menu
    {
        int i = 0;
        Vector<Piatti> Ordinetipo = new Vector<Piatti>();
        
        for(i = 0; i < Menu.size(); i++)
        {
            if(Menu.get(i).getTipo().equals(tipop))
            {
                Ordinetipo.addElement(Menu.get(i));
            }
        }
        return Ordinetipo;
    }
    
    public void StampaPiatti() //stampa tutti i piatti all'interno di Menu
    {
        int i = 0;
        
      for(i = 0; i < Menu.size(); i++)
      {
        System.out.println(Menu.get(i).toString());
      }
    }
    
    
    public double IncassoGiornata()//questo metodo si calcola il guadagno tramite gli ingredienti che si trovano all'interno di TipoOrdine o TipoOrdine2
    {
         int i = 0;
         int j = 0;
         double guadagno = 0;
         Ordine_Tavolo TipoOrdine = new Ordine_Tavolo(0, "");
         Ordine_Domicilio TipoOrdine2 = new Ordine_Domicilio(0, "", "");
         
         for(i = 0; i < Ordine.size(); i++)
         {
             if(Ordine.get(i) instanceof Ordine_Tavolo)   //Conttrollo se l'elemento i esimo e di tipo Ordine_Tavolo.
             {
                TipoOrdine = (Ordine_Tavolo) Ordine.get(i); //Prende l'elemento i esimo e l'aggiunge a TipoOrdine e richiama il metodo PrezzoTotale situato nella class Ordine_Tavolo
                guadagno += TipoOrdine.PrezzoTotale();      // E' una classe che estende la classe Ordine. infine lo somma alla variabile guadagno.
             }
             else
             {
                TipoOrdine2 = (Ordine_Domicilio) Ordine.get(i);
                guadagno += TipoOrdine2.PrezzoTotale();
             }
         }
         
         return guadagno;
    }

}
