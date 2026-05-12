// Classe qui gère la liste des contacts
public class ContactsManager {
    Contact[] contacts;
    int count;

    // Constructeur par défaut : initialise le tableau et le compteur
    public ContactsManager() {
        contacts = new Contact[100];
        count = 0;
    }

    // Ajouter un contact dans le tableau
    public void addContact(Contact contact) {
        contacts[count] = contact;
        count++;
        System.out.println("Contact ajouté : " + contact.name);
    }

    // Rechercher un contact par son nom
    public Contact searchContact(String name) {
        for (int i = 0; i < count; i++) {
            if (contacts[i].name.equalsIgnoreCase(name)) {
                return contacts[i];
            }
        }
        // Retourner null si le contact n'est pas trouvé
        return null;
    }
}