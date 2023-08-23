package enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class phoneAgenda {
    private List<contact> contacts;
    private Map<String, Integer> categoryCounts;

    public phoneAgenda() {
        contacts = new ArrayList<>();
        categoryCounts = new HashMap<>();
    }

    public void addContact(contact contact) {
        contacts.add(contact);
        String tipo = contact.getType();
        categoryCounts.put(tipo, categoryCounts.getOrDefault(tipo, 0) + 1);
    }

    public void listContacts() {
        for (contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void listContactsByCategory(String categoria) {
        for (contact contact : contacts) {
            if (contact.getType().equalsIgnoreCase(categoria)) {
                System.out.println("Name: " + contact.getName() + ", Phone: " + contact.getPhone());
            }
        }
    }

    public int countContactsByCategory(String categoria) {
        return categoryCounts.getOrDefault(categoria, 0);
    }
}
