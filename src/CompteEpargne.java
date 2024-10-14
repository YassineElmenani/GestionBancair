public class CompteEpargne extends Compte {
    private double taux;

    public CompteEpargne(double solde, Agence lAgence, Client proprietaire, double taux) {
        super(solde, lAgence, proprietaire);
        this.taux=taux;
        // Constructor code
    }

    public double getTaux() {
        // Method to get the interest rate
        return taux;
    }

    public void setTaux(double taux) {
        // Method to set the interest rate
        this.taux=taux;
    }

    public double calculInteret() {
        // Method to calculate interest
        return solde;
    }
    @Override 
    public String toString(){
        return "CompteEpargne [taux=" + taux +""
        + super.toString();
        }
}
