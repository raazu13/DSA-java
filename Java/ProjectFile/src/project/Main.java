package project;
import java.util.ArrayList;
import java.util.Scanner;


    public class Main{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            ArrayList<Contact> contacts = new ArrayList<>();

            int choice;
            do {
                System.out.println("\n===== ADDRESS BOOK MENU =====");
                System.out.println("1. Add Contact");
                System.out.println("2. Display All Contacts");
                System.out.println("3. Search Contact");
                System.out.println("4. Delete Contact");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Phone Number: ");
                        String phone = sc.nextLine();
                        System.out.print("Enter Email: ");
                        String email = sc.nextLine();

                        contacts.add(new Contact(name, phone, email));
                        System.out.println("✅ Contact added successfully!");
                        break;

                    case 2:
                        System.out.println("\n----- All Contacts -----");
                        if (contacts.isEmpty()) {
                            System.out.println("No contacts available.");
                        } else {
                            for (Contact c : contacts) {
                                c.displayContact();
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Enter name to search: ");
                        String searchName = sc.nextLine();
                        boolean found = false;

                        for (Contact c : contacts) {
                            if (c.name.equalsIgnoreCase(searchName)) {
                                System.out.println("\nContact Found:");
                                c.displayContact();
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("Contact not found!");
                        }
                        break;

                    case 4:
                        System.out.print("Enter name to delete: ");
                        String deleteName = sc.nextLine();
                        boolean deleted = false;

                        for (int i = 0; i < contacts.size(); i++) {
                            if (contacts.get(i).name.equalsIgnoreCase(deleteName)) {
                                contacts.remove(i);
                                System.out.println("🗑 Contact deleted successfully!");
                                deleted = true;
                                break;
                            }
                        }

                        if (!deleted) {
                            System.out.println("Contact not found!");
                        }
                        break;

                    case 5:
                        System.out.println("Exiting Address Book... 👋");
                        break;

                    default:
                        System.out.println("Invalid choice! Please try again.");
                }

            } while (choice != 5);

            sc.close();
        }
    }

