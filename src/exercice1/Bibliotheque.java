package exercice1;

public class Bibliotheque {
    public static void main(String[] args) {
        Document doc = new Document("Document general");
        Livre livre = new Livre("Les Miserables", "Victor Hugo", 1500);
        Dictionnaire dico = new Dictionnaire("Larousse", "Francais", 3);

        System.out.println(doc);
        System.out.println(livre);
        System.out.println(dico);
    }
}
