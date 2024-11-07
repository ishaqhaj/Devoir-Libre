package banking;
import banking.Transaction.Type;
import banking.Banque;
import banking.Client;
import banking.Compte;
import banking.Transaction;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //les banques
        Banque banque1 = new Banque("1","Beni Mellal");
        Banque banque2 = new Banque("2","FQUIH BEN SALAH");

        //les client
        Client client1 = new Client(1,"nom1","prenom1","addresse1","phone1","email1");
        Client client2 = new Client(2,"nom2","prenom2","addresse2","phone2","email2");
        Client client3 = new Client(3,"nom3","prenom3","addresse3","phone3","email3");
        //les comptes
        Compte compte1 = new Compte(1,1200,client1,banque1);
        Compte compte2 = new Compte(2,1500,client2,banque2);
        Compte compte3 = new Compte(3,1900,client3,banque2);
        List<Compte> comptes = new ArrayList<>();
        comptes.add(compte1);
        comptes.add(compte2);
        comptes.add(compte3);
        //objet transaction
        Transaction transaction = new Transaction(comptes);
        //transaction.setComptes(comptes)
        System.out.println(banque1.ToJson());

        //System.out.println(transaction.typetransaction());
    }
}