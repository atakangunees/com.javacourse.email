package com.javacourse.email.main;

import java.util.Scanner;



public class Application {

	static Scanner s = new Scanner(System.in);
	
	static Email newemail = new Email();

	InvalidEmailAddressException e = new InvalidEmailAddressException();

	public static void main(String[] args) {

		DataBase db = new DataBase();

		while (true) {

			String emaile;

			try {
				System.out.println("Please Enter Your Email Address: ");
				String email = s.nextLine();

				emaile = email;

				db.isValid(emaile);

			} catch (Exception e) {

				s.nextLine();

			}
			
             
			
		
	}
		
	}
}


