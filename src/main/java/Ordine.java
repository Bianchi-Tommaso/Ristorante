
import java.util.ArrayList;
import java.util.Vector;

public class Ordine
{
    protected int Identificativo;
    protected ArrayList<Piatti> Ordinazione = new ArrayList<Piatti>();
    private double Prezzo;
      
    public Ordine()
    {
        Identificativo = 0;
        Prezzo = 0;
    }
    
    public Ordine(int Indetificativo)
    {
        this.Identificativo = Identificativo;
        Prezzo = 0;
    }
    
    public void AggiungiPiatto(Piatti x)
    {
       Ordinazione.add(x);
    }
    
    public void RimuoviPiatto(int x)
    {
       Piatti p = new Piatti("","");
       p = (Piatti) Ordinazione.get(x);
       Ordinazione.remove(x);
    }
}
