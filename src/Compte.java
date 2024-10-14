public class Compte {
    private String code;
    protected double solde;
    protected Agence lAgence;
    protected Client proprietaire;
    private static int compteCount = 0;

    public Compte(double solde, Agence lAgence, Client proprietaire) {
        compteCount++;
        this.code= getClass().getSimpleName()+':'+compteCount;
        this.solde=solde;
        this.lAgence=lAgence;
        this.proprietaire=proprietaire;
    }

    public String getCode() {
        // Method to get the code of the account
        return code;
    }

    public void setCode(String code) {
        // Method to set the code of the account
        this.code=code;
    }

    public void deposer(double montant) {
        // Method to deposit money
        solde=+montant;
    }

    public void retirer(double montant) {
        // Method to withdraw money
        if(solde>=montant){
            solde-=montant;
        }else{
            System.out.println("Vous n'avez pas assez d'argent dans votre compte");
        }
    }


    @Override
    public String toString() {
        return "Compte{" +
        "code='" + code + '\'' +
        ", solde=" + solde +
        ", lAgence=" + lAgence +
        ", proprietaire=" + proprietaire +
        '}';
    }
}
