package Day27.AddressBookSystem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AddressBookMain {
    public static void main(String[] args) {
        /**
         * create a scanner object
         */
        Scanner sc = new Scanner(System.in);
        /**
         * create a object for  AddressBookSystem class the object name as addressBook
         */
        AddressBookSystem addressBook = new AddressBookSystem();
        /**
         * create a object for map class object name is addressBookMap
         */
        Map<String, AddressBookSystem> addressBookMap = new HashMap<String, AddressBookSystem>();

        while (true) {
            /**
             * 1st display welcome msg
             * then display al the option
             */
            System.out.println("\nWelcome to Address Book System");

            System.out.println("1. New Address Book \n2. Select Address Book \n3. Delete Address Book \n4. Search Contact Data \n5.View Contact Data \n6.Count Contacts \n7. Exit");
            /**
             * choose the option what u want
             */
            System.out.print("Enter Your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            /**
             * using switch case
             */
            switch (choice) {
                case 1:
                    System.out.println("Enter Name of new Address Book: ");
                    String bookName = sc.next();
                    sc.nextLine();
                    /**
                     * adding bookname as a key and value is allocating
                     * memory for addressbook object
                     */
                    addressBookMap.put(bookName, new AddressBookSystem());
                    /**
                     * call addressbookoption method with
                     * passing key of hashmap
                     */
                    AddressBookSystem.addressBookOptions(addressBookMap.get(bookName));
                    break;
                case 2:
                    System.out.println("List of available Address Book : ");
                    /**
                     * retrived keys from hashmap to show addressbooklist
                     */
                    Set<String> keys = addressBookMap.keySet();
                    Iterator<String> i = keys.iterator();
                    while (i.hasNext()) {
                        System.out.println(i.next());
                    }
                    /**
                     * choose the option which address book name u want to open
                     */
                    System.out.println("Enter Address Book name you want to Open : ");
                    String name = sc.nextLine();
                    /**
                     * display current address book name
                     */
                    System.out.println("Current Address Book is : " + name);
                    /**
                     * call method with passing address book name
                     */
                    AddressBookSystem.addressBookOptions(addressBookMap.get(name));
                    break;
                case 3:
                    /**
                     * display address book name to be deleted
                     */
                    System.out.println("Enter Address Book name to be delete: ");
                    name = sc.nextLine();
                    /**
                     * delete hashmap using remove function
                     */
                    addressBookMap.remove(name);
                    break;
                case 4:
                    /**
                     * display all the search options
                     */
                    System.out.println("Welcome to the search option:");
                    /**
                     * calling searchByOptions method from object name as addressBook
                     */
                    addressBook.searchByOptions();
                case 5:
                    /**
                     * display all the search options
                     */
                    System.out.println("Welcome to view By Option:");
                    /**
                     * calling viewByOption method from object name as addressBook
                     */
                    addressBook.viewByOption(addressBookMap);
                    break;
                case 6:
                    /**
                     * display welcome msg for counter
                     */
                    System.out.println("Welcome to the counter");
                    /**
                     * calling countByOption method from object name as addressBook
                     */
                    addressBook.countByOption();
                    break;
                case 7:
                    /**
                     * display welcome msg for soting data alphabetically
                     */
                    System.out.println("Welcome to the sorting data alphabetically");
                    /**
                     * calling sortByOption method from object name as addressBook
                     */
                    addressBook.sortByOption();
                case 8:
                    /**
                     * closing the scanner
                     */
                    sc.close();
                    return;
                /**
                 * if all the cases are false then execute default case
                 */
                default:
                    System.out.println("You Entered Invalid Choice....!");
                    break;
            }
        }
    }
}
