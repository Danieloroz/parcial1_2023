package enums;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        phoneAgenda agenda = new phoneAgenda();

        while (true) {
            System.out.println("1. Add Contact");
            System.out.println("2. List Contacts");
            System.out.println("3. List contacts by category");
            System.out.println("4. Count contacts by category");
            System.out.println("5. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Type (family/work/friends): ");
                    String type = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    contact newContact = new contact(name, address, type, email, phone);
                    agenda.addContact(newContact);
                    break;
                case 2:
                    agenda.listContacts();
                    break;
                case 3:
                    System.out.print("Input the category: ");
                    String category = scanner.nextLine();
                    agenda.listContactsByCategory(category);
                    break;
                case 4:
                    System.out.print("Input the category: ");
                    String cat = scanner.nextLine();
                    int quantity = agenda.countContactsByCategory(cat);
                    System.out.println("Contacts quantity in that category '" + cat + "': " + quantity);
                    break;
                case 5:
                    System.out.println("Exit...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Option not valid.");
                    break;
            }
        }
    }
}
