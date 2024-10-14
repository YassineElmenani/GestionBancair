public class ComptePayant extends Compte {
    private static final double TAUX_OPERATION = 1.02;

    public ComptePayant(double solde, Agence lAgence, Client proprietaire) {
        super(solde, lAgence, proprietaire);
        // Constructor code
    }

    @Override
    public void deposer(double montant) {
        // Override deposer method with operation cost
    }

    @Override
    public void retirer(double montant) {
        // Override retirer method with operation cost
    }
    @Override
    public String toString(){
        return "ComptePayant";   
    }
}
