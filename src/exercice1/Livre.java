package exercice1;

public class Livre extends Document {
    private String auteur;
    private int nombrePages;

    public Livre(String titre, String auteur, int nombrePages) {
        super(titre);
        this.auteur = auteur;
        this.nombrePages = nombrePages;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    @Override
    public String toString() {
        return super.toString() + " | Livre - Auteur: " + auteur + ", Pages: " + nombrePages;
    }
}
