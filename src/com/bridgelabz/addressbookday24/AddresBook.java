package com.bridgelabz.addressbookday24;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class AddresBook implements AddressBookInterface {

	List<Contact> contacts;

	public AddresBook() {
		contacts = new ArrayList<>();
	}

	@Override
	public void addContact(Scanner sc) {

		Contact contact = new Contact();

		System.out.println("Enter the first name : ");
		contact.setFirstName(sc.nextLine());

		System.out.println("Enter the last name : ");
		contact.setLastName(sc.nextLine());

		System.out.println("Enter the address : ");
		contact.setAddress(sc.nextLine());

		System.out.println("Enter the city : ");
		contact.setCity(sc.nextLine());

		System.out.println("Enter the state : ");
		contact.setState(sc.nextLine());

		System.out.println("Enter email : ");
		contact.setEmail(sc.nextLine());

		System.out.println("Enter the phone number : ");
		contact.setPhoneNo(sc.nextLong());

		System.out.println("Enter the zip code : ");
		contact.setZip(sc.nextLong());

		contacts.add(contact);

	}

	@Override
	public void showContact() {

		System.out.println(
				"------------------------------------------------------------------------------------------------------------------");

		if (contacts.isEmpty()) {
			System.out.println("No records found...!");

		} else {
			contacts.forEach(System.out::println);
		}
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------");
	}

	@Override
	public boolean deleteContact(Scanner sc) {

		System.out.println(
				"Enter the first name you want to delete : ");
		String firstName = sc.nextLine();
		boolean b = false;
		for (Contact cont1 : contacts) {
			if (cont1.getFirstName().equals(firstName)) {
				b = true;
				contacts.remove(cont1);
				System.out.println(
						"Record successfully deleted..!");
				break;
			}

		}
		System.out.println(
				"No record found with that first name...!");
		return b;
	}

	@Override
	public boolean editContact(Scanner sc) {
				System.out.println(
				"Enter the first name you want to edit : ");
				boolean found = false;

		String firstName = sc.nextLine();
		ListIterator<Contact> li = contacts.listIterator();

		while (li.hasNext()) {
			Contact cont1 = li.next();

			if (cont1.getFirstName().equals(firstName)) {
				found = true;

				System.out.println(
						"Enter the update name : ");
				String str2 = sc.nextLine();

				cont1.setFirstName(str2);
				System.out.println(
						"Record successfully updated..!");

				break;

			}
		}
		System.out.println(
				"No record found with that first name...!");

		return found;
	}
}
