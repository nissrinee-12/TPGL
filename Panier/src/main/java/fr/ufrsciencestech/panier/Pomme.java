package fr.ufrsciencestech.panier;

public class Pomme {
    private double prix;
    private String origine;

    public Pomme() {
        this.prix = 0.6;  // Prix en euros par défaut
        this.origine = "France";  // Origine par défaut
    }

    public Pomme(double prix, String origine) {
        if (prix < 0)
            this.prix = -prix;
        else
            this.prix = prix;

        if (origine.equals(""))
            this.origine = "France";
        else
            this.origine = origine;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    @Override
    public String toString() {
        return "Pomme de " + origine + " à " + prix + " euros";
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && getClass() == o.getClass()) {
            Pomme pomme = (Pomme) o;
            return (prix == pomme.prix && origine.equals(pomme.origine));
        }
        return false;
    }

    public boolean isSeedless() {
        return true;  // Les pommes sont généralement sans pépins
    }

    public static void main(String[] args) {
        // Exemple de tests pour la classe Pomme
        Pomme pomme1 = new Pomme();
        Pomme pomme2 = new Pomme(0.8, "Canada");

        System.out.println("Pomme 1 : " + pomme1);
        System.out.println("Pomme 2 : " + pomme2);
        System.out.println("Les pommes sont-elles équivalentes ? " + pomme1.equals(pomme2));
        System.out.println("La pomme 1 a-t-elle des pépins ? " + pomme1.isSeedless());
        System.out.println("La pomme 2 a-t-elle des pépins ? " + pomme2.isSeedless());
    }
}
