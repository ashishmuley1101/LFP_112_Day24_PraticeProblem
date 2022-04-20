package com.bridgelabz.addressbookday24;

import java.util.Objects;

public class Contact {

		String firstName ;
		String lastName;
		String address;
		String city;
		String state;
		String email;
		long phoneNo;
		long zip;
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(long phoneNo) {
			this.phoneNo = phoneNo;
		}
		public long getZip() {
			return zip;
		}
		public void setZip(long zip) {
			this.zip = zip;
		}
		@Override
		public String toString() {
			return "Contact [firstName=" + firstName
					+ ", lastName=" + lastName
					+ ", address=" + address + ", city="
					+ city + ", state=" + state + ", email="
					+ email + ", phoneNo=" + phoneNo
					+ ", zip=" + zip + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(firstName);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Contact other = (Contact) obj;
			return Objects.equals(firstName,
					other.firstName);
		}
		
		
}
