package com.bridgelabz.addressbookday24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;

public class AddresBook implements AddressBookInterface {

	Set<Contact> contacts;

	public AddresBook() {
		contacts = new HashSet<>();
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
				"-------------------------Your Contact list----------------------------------------------------------------------------------------");

		if (contacts.isEmpty()) {
			System.out.println("No records found...!");

		} else {
			contacts.forEach(System.out::println);
		}
		System.out.println(
				"--------------------------your contact list---------------------------------------------------------------------------------------");
	}

	@Override
	public void deleteContact(Scanner sc) {

		System.out.println(
				"Enter the first name you want to delete : ");
		String firstName = sc.nextLine();
		boolean contactFound = contacts.stream().anyMatch(c -> c.getFirstName().equals(firstName)); 
		if(contactFound) {
		Contact contact = contacts.stream().filter(c -> c.getFirstName().equals(firstName) ).findFirst().get();
			 
		contacts.remove(contact);

		System.out.println("Record deleted successfully");
			}else {
				System.out.println(
						"No record found with that first name...!");
		}
		
		}


	@Override
	public void editContact(Scanner sc) {
				System.out.println(
				"Enter the first name you want to edit : ");
				String firstName = sc.nextLine();
	
				boolean contactFound = contacts.stream().anyMatch(c -> c.getFirstName().equals(firstName)); 
		

				if(contactFound) {
					Contact contact = contacts.stream().filter(c -> c.getFirstName().equals(firstName) ).findFirst().get();
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
	
				
				}else {
				System.out.println(
						"No record found with that first name...!");
					}
		}
}
