public class Main {
    public static void main(String[] args) {

        ContactsManager myContactsManager = new ContactsManager();

        // Contact 1
        Contact contact1 = new Contact();
        contact1.name = "Alice";
        contact1.phoneNumber = "0701020304";
        myContactsManager.addContact(contact1);

        // Contact 2
        Contact contact2 = new Contact();
        contact2.name = "Bob";
        contact2.phoneNumber = "0712345678";
        myContactsManager.addContact(contact2);

        // Contact 3
        Contact contact3 = new Contact();
        contact3.name = "Chloé";
        contact3.phoneNumber = "0698765432";
        myContactsManager.addContact(contact3);

        // Contact 4
        Contact contact4 = new Contact();
        contact4.name = "David";
        contact4.phoneNumber = "0756781234";
        myContactsManager.addContact(contact4);

        // Contact 5
        Contact contact5 = new Contact();
        contact5.name = "Emma";
        contact5.phoneNumber = "0623456789";
        myContactsManager.addContact(contact5);

        // Recherche de contact et afficher son numéro
        Contact found = myContactsManager.searchContact("Alice");
        if (found != null) {
            System.out.println("\nRecherche de Alice :");
            System.out.println("Nom : " + found.name);
            System.out.println("Téléphone : " + found.phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}