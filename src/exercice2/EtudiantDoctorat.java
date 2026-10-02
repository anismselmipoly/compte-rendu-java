package exercice2;

public class EtudiantDoctorat extends Etudiant {
    private String directeurRecherche;

    public EtudiantDoctorat(String nom, String adresse, int numero, String directeurRecherche) {
        super(nom, adresse, numero);
        this.directeurRecherche = directeurRecherche;
    }

    public String getDirecteurRecherche() {
        return directeurRecherche;
    }

    public void setDirecteurRecherche(String directeurRecherche) {
        this.directeurRecherche = directeurRecherche;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Directeur de recherche : " + directeurRecherche);
    }

    @Override
    public void afficherProfil() {
        System.out.println(" Etudiants en Doctorat ");
    }
}
