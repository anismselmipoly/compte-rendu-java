package exercice1;

public class Dictionnaire extends Document {
    private String langue;
    private int nombreTomes;

    public Dictionnaire(String titre, String langue, int nombreTomes) {
        super(titre);
        this.langue = langue;
        this.nombreTomes = nombreTomes;
    }

    public String getLangue() {
        return langue;
    }

    public int getNombreTomes() {
        return nombreTomes;
    }

    @Override
    public String toString() {
        return super.toString() + " | Dictionnaire - Langue: " + langue + ", Tomes: " + nombreTomes;
    }
}
