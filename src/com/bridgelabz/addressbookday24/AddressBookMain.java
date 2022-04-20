package com.bridgelabz.addressbookday24;

import java.util.HashMap;
import java.util.Scanner;

public class AddressBookMain {

	static Scanner sc;

	public static void main(String[] args)
			throws IllegalAccessError {

		System.out.println(
				"***--Welcome to the addressBook--***");

		sc = new Scanner(System.in);

		HashMap<String, AddressBookInterface> addressBook = new HashMap<>();
		AddressBookInterface familyaddressBook = new AddresBook();
		AddressBookInterface businessaddressBook = new AddresBook();
		AddressBookInterface friendsaddressBook = new AddresBook();

		addressBook.put("Family", familyaddressBook);
		addressBook.put("Business", businessaddressBook);
		addressBook.put("Friends", friendsaddressBook);

		int userInput = 0;

		while (userInput != 5) {

			userInput = getOption(sc);
			sc = new Scanner(System.in);
			String inputValue;
			switch (userInput) {
			case 1:

				System.out.println(
						"Enter which addressBook you want to add contact");
				System.out.println(
						"1. Family \n2. Business \n3. Friends");
				inputValue = sc.nextLine();

				sc = new Scanner(System.in);
				addressBook.get(inputValue).addContact(sc);

				break;
			case 2:

				addressBook.forEach((key, addressbook) -> {
					System.out.println("--------" + key
							+ "-----");

					addressbook.showContact();
				});

				break;

			case 3:
				System.out.println(
						"Enter which addressBook you want to edit the contact");
				System.out.println(
						"1. Family \n2. Business \n3. Friends");
				inputValue = sc.nextLine();

				sc = new Scanner(System.in);
				addressBook.get(inputValue).editContact(
						sc);

				break;

			case 4:
				System.out.println(
						"Enter which addressBook you want to delete the contact");
				System.out.println(
						"1. Family \n2. Business \n3. Friends");
				inputValue = sc.nextLine();

				sc = new Scanner(System.in);
				addressBook.get(inputValue).deleteContact(sc);
				break;

			case 5:

				userInput = 5;
				System.out.println(
						"Exit from addressBook bye...! ");
				break;

			default:
				throw new IllegalArgumentException(
						"check your option again ...!");
			}

		}
		sc.close();
	}

	public static int getOption(Scanner sc) {

		System.out.println(
				"1. Add Contacts\n2. Show Contact \n3. Edit \n4. Delete Contacts \n5. Exit");
		System.out.println("Enter your choice...!");
		int option = sc.nextInt();

		return option;
	}

}
