public class Etudiant extends Personne {
    private String matiere;

    public Etudiant(String nom, int age, String matiere) {
        super(nom, age);
        this.matiere = matiere;
    }

    public String getMatiere() {
        return matiere;
    }
}