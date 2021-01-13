public class Ordine_Tavolo extends Ordine
{
   private String cameriere;
    
    public Ordine_Tavolo(int indetificativo, String cameriere)
    {
         super(indetificativo);
         this.cameriere = cameriere;
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
             
             return guadagno;
         }    
}
