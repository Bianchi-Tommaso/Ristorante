
import java.util.ArrayList;
import java.util.Vector;

public class Ristorante 
{
    private ArrayList<Ordine> Ordine = new ArrayList<Ordine>();
    private ArrayList<Piatti> Menu = new ArrayList<Piatti>();
    
    public void AggiungiPiatto(Piatti x)
    {
        Menu.add(x);
    }
    
    public void RimozionePiatto(Piatti x)
    {
        Menu.remove(x);
    }
    
    public void AggiungiOrdine(Ordine x)
    {
        Ordine.add(x);
    }
    
    public void RimozioneOrdine(Ordine x)
    {
        Ordine.remove(x);
    }
    
    public Vector<Piatti> TipoPiatto(String tipop)
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
    
    public void StampaPiatti()
    {
        int i = 0;
        
      for(i = 0; i < Menu.size(); i++)
      {
        System.out.println(Menu.get(i).toString());
      }
    }
    
    
    public double IncassoGiornata()
    {
         int i = 0;
         int j = 0;
         double guadagno = 0;
         Ordine_Tavolo TipoOrdine = new Ordine_Tavolo(0, "");
         Ordine_Domicilio TipoOrdine2 = new Ordine_Domicilio(0, "", "");
         
         for(i = 0; i < Ordine.size(); i++)
         {
             if(Ordine.get(i) instanceof Ordine_Tavolo)
             {
                TipoOrdine = (Ordine_Tavolo) Ordine.get(i);
                guadagno += TipoOrdine.PrezzoTotale();
             }
             else
             {
                TipoOrdine2 = (Ordine_Domicilio) Ordine.get(i);
                guadagno += TipoOrdine.PrezzoTotale();
             }
         }
         
         return guadagno;
    }

}
