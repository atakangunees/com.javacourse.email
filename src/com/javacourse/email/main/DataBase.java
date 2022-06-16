package com.javacourse.email.main;

public class DataBase {

	private Email[] emails;

	public DataBase() {

		this.emails = new Email[1];

	}

	public void isValid(String emaile) throws InvalidEmailAddressException {

		 
		
		if (emaile.contains("Q")) {

			System.out.println("Giriþ Yapýlýyor");
		} else {

			throw new InvalidEmailAddressException("Hatalý Giriþ");
		}
	}

	public void saveEmail(Email e) {

		addEmail(e);
	}

	private void addEmail(Email e) {

		if (this.emails[0] == null) {

			this.emails[0] =e;

		} else {

			Email[] newArr = new Email[this.emails.length + 1];

			for (int i = 0; i < this.emails.length; i++) {

				newArr[i] = this.emails[i];
			}

			newArr[newArr.length - 1] = e;

			this.emails = newArr;

		}
		
	 
	}
	
	public Email[] getAllAccounts(){
		return this.emails;
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}