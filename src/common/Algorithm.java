/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.ArrayList;
import java.util.Scanner;
import model.Contact;

/**
 *
 * @author CongThanh
 */
public class Algorithm extends ArrayList<Contact> {

    Library library = new Library();
    Scanner sc = new Scanner(System.in);

    public void createContact(ArrayList<Contact> ad, int prevId) {

        String[] fullName = library.inputString("Enter name: ").split(" ");
        String firstName = fullName[0];
        String lastName = fullName[1];
        String group = library.inputString("Enter gorup: ");
        String address = library.inputString("Enter address: ");
        System.out.print("Enter phone: ");
        String phone = library.checkInputPhone();

        ad.add(new Contact(prevId, firstName + " " + lastName, group, address,
                phone, firstName, lastName));
        System.err.println("Add successful.");
    }

    //allow user display all contact
    public void printAllContact(ArrayList<Contact> lc) {
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
                "First name", "Last name", "Group", "Address", "Phone");
        //print infomation of contact from first to last list contact
        for (Contact contact : lc) {
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
                    contact.getContactId(), contact.getFullName(),
                    contact.getFirstName(), contact.getLastName(),
                    contact.getGroup(), contact.getAddress(), contact.getPhone());
        }
    }

    //allow user delete contact
    public void deleteContactd(ArrayList<Contact> lc) {
        int idDelete = library.getInt("Enter ID: ");
        Contact contactDelete = getContactById(lc, idDelete);
        if (contactDelete == null) {
            System.err.println("Not found contact.");
            return;
        } else {
            lc.remove(contactDelete);
        }
        System.err.println("Delete successful.");
    }

    //get contact by id
    public Contact getContactById(ArrayList<Contact> lc, int idDelete) {
        for (Contact contact : lc) {
            if (contact.getContactId() == idDelete) {
                return contact;
            }
        }
        return null;
    }

}
