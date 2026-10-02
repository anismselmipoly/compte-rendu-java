package exercice2;

public class EtudiantMaster extends Etudiant {
    private String specialite;

    public EtudiantMaster(String nom, String adresse, int numero, String specialite) {
        super(nom, adresse, numero);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Specialite : " + specialite);
    }

    @Override
    public void afficherProfil() {
        System.out.println(" Etudiants en Master ");
    }
}
