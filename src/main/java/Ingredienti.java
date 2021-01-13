public class Ingredienti 
{
    private String Descrizione;
    private int Quantita;
    private double Prezzo;
    
    public Ingredienti()
    {
        this.Descrizione = "";
        this.Quantita = 0;
        this.Prezzo = 0;
    }
    
    public Ingredienti(String Descrizione, int Quantita, double Prezzo)
    {
        this.Descrizione = Descrizione;
        this.Quantita = Quantita;
        this.Prezzo = Prezzo;
    }
    

    public String getDescrizione() {
        return Descrizione;
    }

    public void setDescrizione(String Descrizione) {
        this.Descrizione = Descrizione;
    }

    public int getQuantita() {
        return Quantita;
    }

    public void setQuantita(int Quantita) {
        this.Quantita = Quantita;
    }

    public double getPrezzo() {
        return Prezzo;
    }

    public void setPrezzo(double Prezzo) {
        this.Prezzo = Prezzo;
    }
    
    
}
