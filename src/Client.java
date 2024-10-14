import java.util.ArrayList;

public class Client {
    private String code;
    private String nom;
    private String prenom;
    private String adresse;
    private Agence monAgence;
    private ArrayList<Compte> mesComptes;

    private static int clientCount = 0;


    public Client(String nom, String prenom, String adresse, Agence monAgence) {
        clientCount ++;
        this.code = getClass().getSimpleName()+':'+clientCount;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.monAgence=monAgence;
        this.mesComptes= new ArrayList<>();
    }

    public Compte getCompte(int index) {
        return mesComptes.get(index);
    }

    public void addCompte(Compte compte) {
       mesComptes.add(compte);
    }

    public void deposer(int index, double montant) {
        // Method to deposit money
        mesComptes.get(index).deposer(montant);
    }

    public void retirer(int index, double montant) {
        // Method to withdraw money
        mesComptes.get(index).retirer(montant);
    }

    public int getNbComptes() {
        // Method to get the number of accounts
        return mesComptes.size();
    }

    public String getCode() {
        // Method to get the code of the client
        return code;
    }
    @Override 
    public String toString() {
        return "Client [code=" + code + ", nom=" + nom + ", prenom="
        + prenom + ", adresse=" + adresse + ", monAgence=" + monAgence+"mes comptes="+mesComptes+"]";
    }


}
