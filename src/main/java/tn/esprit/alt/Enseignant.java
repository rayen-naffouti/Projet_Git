public class Enseignant extends Personne {
    private String matiere;

    public Enseignant(String nom, int age, String matiere) {
        super(nom, age);
        this.matiere = matiere;
    }
    //test
    public String getMatiere() {
        return matiere;
    }
}