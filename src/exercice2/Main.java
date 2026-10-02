package exercice2;

public class Main {
    public static void main(String[] args) {
        EtudiantLicence e1 = new EtudiantLicence("CHACHIA MELEK", "SOUSSE", 2, "Informatique");
        EtudiantMaster e2 = new EtudiantMaster("BEN ALI SARA", "TUNIS", 5, "IA");
        EtudiantDoctorat e3 = new EtudiantDoctorat("TRABELSI AMINE", "SFAX", 8, "Dr. Karray");

        Etudiant[] etudiants = {e1, e2, e3};

        for (Etudiant e : etudiants) {
            e.afficherProfil();
            e.afficher();
            System.out.println("---");
            e.afficher(true);
            System.out.println("==========");
        }
    }
}
