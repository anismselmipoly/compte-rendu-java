package exercice2;

public abstract class Etudiant {
    private String nom;
    private String adresse;
    private int numero;

    public Etudiant(String nom, String adresse, int numero) {
        this.nom = nom;
        this.adresse = adresse;
        this.numero = numero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void afficher() {
        System.out.println("Nom : " + nom);
        System.out.println("Adresse : " + adresse);
        System.out.println("Numero : " + numero);
    }

    public void afficher(boolean compact) {
        if (compact) {
            System.out.println("[" + nom + ", " + adresse + " ," + numero + "]");
        } else {
            afficher();
        }
    }

    public abstract void afficherProfil();
}
