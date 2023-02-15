public class Main {
    public static void main(String[] args) {
        Personne p = new Personne("Jean", 30);
        Etudiant e = new Etudiant("Alice", 20, "Informatique");
        Enseignant en = new Enseignant("Marie", 40, "Mathématiques");

        System.out.println(p.getNom() + " a " + p.getAge() + " ans");
        System.out.println(e.getNom() + " étudie " + e.getMatiere());
        System.out.println(en.getNom() + " enseigne " + en.getMatiere());
    }
}