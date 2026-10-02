package exercice1;

public class Document {
    private String titre;
    private int numero;
    private static int compteur = 0;

    public Document(String titre) {
        this.titre = titre;
        this.numero = compteur;
        compteur++;
    }

    public String getTitre() {
        return titre;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return numero + " - " + titre;
    }
}
