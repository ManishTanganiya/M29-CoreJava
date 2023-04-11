package org.tnsif.classandobject;

public class Customer {
	
		private int customerId;
		private String customerName;
		private String city;
		
		//default constructor
		public Customer() {
			super();
		}
		//parameterized constructor
		public Customer(int customerId, String customerName, String city) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.city = city;
		}

		public int getCustomerId() {
			return customerId;
		}
		

		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", city=" + city + "]";
		}
		
		

	

}
