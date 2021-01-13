public class Ordine_Domicilio extends Ordine
{    
    private String orario;
    private String indirizzo;
    private static double consegna = 5;
    
    public Ordine_Domicilio(int Indetificativo, String indirizzo, String orario)
    {
        super(Indetificativo);
        this.indirizzo = indirizzo;
        this.orario = orario;
    }
    
    public double PrezzoTotale()
         {
             int i = 0;
             int j = 0;
             double guadagno = 0;
             
             
             Piatti p = new Piatti("","");
             
             for(i = 0; i < Ordinazione.size(); i++)
             {
                 p = (Piatti) Ordinazione.get(i);
                 
                 for(j = 0; j < p.GetIngredienti().size(); j++)
                 {
                     guadagno += p.GetIngredienti().get(j).getPrezzo();
                 }
             }
             
             return guadagno + consegna;
         }    
}
