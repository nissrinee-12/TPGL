/**
 *
 * @author roudet
 */
public class Orange {
    private double prix;
    private String origine;
	
    public Orange() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Orange(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Orange de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Orange or = (Orange) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
    
   // Création d'objets Orange avec les deux constructeurs
    Orange orange1 = new Orange();
    Orange orange2 = new Orange(0.8, "Maroc");

    // Affichage des oranges
    System.out.println("Orange 1 : " + orange1);
    System.out.println("Orange 2 : " + orange2);

    // Test de la méthode equals
    System.out.println("Les oranges sont-elles équivalentes ? " + orange1.equals(orange2));

    // Test de la méthode isSeedless
    System.out.println("L'orange 1 a-t-elle des pépins ? " + orange1.isSeedless());
    System.out.println("L'orange 2 a-t-elle des pépins ? " + orange2.isSeedless());

	System.out.println("premier test Orange");
   }
}
