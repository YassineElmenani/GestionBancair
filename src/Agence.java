import java.util.ArrayList;

public class Agence {
    private String numero;
    private String adresse;
    private ArrayList<Client> lesClients;
    private ArrayList<Compte> lesComptes;

    private static int AgenceCount = 0;

    public Agence( String adresse) {
        AgenceCount++;
        this.numero = getClass().getSimpleName()+':'+AgenceCount;
        this.adresse=adresse;
        this.lesClients = new ArrayList<>();
        this.lesComptes = new ArrayList<>();
    }

    public Compte getCompte(int index) {
        // Method to get a specific account
        return lesComptes.get(index);
    }

    public Client getClient(int index) {
        // Method to get a specific client
        return lesClients.get(index);
    }

    public void addCompte(Compte compte) {
        // Method to add a new account
        lesComptes.add(compte);
    }

    public void addClient(Client client) {
        // Method to add a new client
        lesClients.add(client);
    }

    public int getNbClients() {
        // Method to get the number of clients
        return lesClients.size();
    
    }

    public int getNbComptes() {
        // Method to get the number of accounts
        return lesComptes.size();
       
    }
    @Override
    public String toString() {
        return "Agence{" +
        "numero='" + numero + '\'' +
        ", adresse='" + adresse + '\'' +
        ", lesClients=" + lesClients +
        ", lesComptes=" + lesComptes +
        '}';
        }
}
