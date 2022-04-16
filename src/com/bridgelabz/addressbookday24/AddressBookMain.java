package com.bridgelabz.addressbookday24;

import java.util.Scanner;

public class AddressBookMain {

	static Scanner sc;

	public static void main(String[] args)
			throws IllegalAccessError {

		System.out.println(
				"***--Welcome to the AddressBook--***");

		sc = new Scanner(System.in);

		AddressBookInterface abi = new AddresBook();

		int userInput = 0;

		while (userInput != 5) {

			userInput = getOption(sc);
			sc = new Scanner(System.in);
			switch (userInput) {
			case 1:
				abi.addContact(sc);

				break;
			case 2:
				abi.showContact();

				break;

			case 3:
				abi.editContact(sc);
				break;

			case 4:

				abi.deleteContact(sc);
				break;

			case 5:

				userInput = 5;
				System.out.println(
						"Exit from addressbook bye... ");
				break;

			default:
				throw new IllegalArgumentException(
						"Unexpected");
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
