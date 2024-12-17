package main;

public class Address {
		private int pinCode;
		private String State;
		private String city;
		
		public Address() {
		}

		public Address(int pinCode, String state, String city) {
			this.pinCode = pinCode;
			State = state;
			this.city = city;
		}

		public int getPinCode() {
			return pinCode;
		}

		public void setPinCode(int pinCode) {
			this.pinCode = pinCode;
		}

		public String getState() {
			return State;
		}

		public void setState(String state) {
			State = state;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}
		
		
		
}
