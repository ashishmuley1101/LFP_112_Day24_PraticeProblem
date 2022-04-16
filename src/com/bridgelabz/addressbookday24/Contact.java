package com.bridgelabz.addressbookday24;

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
}
