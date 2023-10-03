/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import view.Menu;
import common.Algorithm;
import common.Library;
import model.Contact;

/**
 *
 * @author CongThanh
 */
public class ContactManagementProgram extends Menu<String> {

    static String[] mc = {"Add a contact", "Display all contacts", "Delete a contact", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int prevId = 3;

    public ContactManagementProgram() {
        super("Student Programing", mc);
        library = new Library();
        algorithm = new Algorithm();
        algorithm.add(new Contact(1, "Iker Casillas", "Star",
                "Spain", "1234567890", "Iker", "Casillas"));
        algorithm.add(new Contact(2, "John Terry", "Star",
                "England", "1234567890", "John", "Terry"));
        algorithm.add(new Contact(3, "Raul Gonzalez", "Star",
                "Spain", "1234567890", "Raul", "Gonzalez"));
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                algorithm.createContact(algorithm, ++prevId);
                break;
            case 2:
                algorithm.printAllContact(algorithm);
                break;
            case 3:
                algorithm.deleteContactd(algorithm);
                break;
            case 4:
                System.exit(0);
        }
    }

}
