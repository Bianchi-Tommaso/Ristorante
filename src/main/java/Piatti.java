import java.util.ArrayList;
import java.util.Vector;


public class Piatti 
{
    private int Prezzo;
    private String Nome;
    private String Tipo;
    private ArrayList<Ingredienti> ingredienti = new ArrayList<Ingredienti>();
   
    
    public Piatti(String Nome, String Tipo)
    {
        this.Nome = Nome;
        this.Tipo = Tipo;
    }

    public String getNome() 
    {
        return Nome;
    }

    public void setNome(String Nome) 
    {
        this.Nome = Nome;
    }

    public String getTipo() 
    {
        return Tipo;
    }

    public void setTipo(String Tipo) 
    {
        this.Tipo = Tipo;
    }
  
    public int getPrezzo() 
    {
        return Prezzo;
    }

    public void setPrezzo(int Prezzo)
    {
        this.Prezzo = Prezzo;
    }
    
    public void AggiungiPiatto(Ingredienti x)
    {
        ingredienti.add(x);
    }
    
    public void RimuoviPiatto(Ingredienti x)
    {
        ingredienti.remove(x);
    }
    
    public ArrayList<Ingredienti> GetIngredienti()
    {        
        return ingredienti;
    }
    
    public String tooString()
    {
        String Piatto = "Nome: " + Nome + " Tipo: " + Tipo + "Costo: " + Prezzo;
        
        return Piatto;
    }
    
    
}
