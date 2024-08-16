package org.base;

import java.util.Scanner;

public class Email {
	
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity=500;
	private int defaultPasswordLength=10;
	private String alternatemail;
	private String companySuffix ="company.com";
	
	public Email(String firstname, String lastname ) {
		this.firstname =firstname;
		this.lastname =lastname;
		System.out.println("EMAIL CREATE: "+this.firstname + " "+this.lastname);
		
		this.department = setDepartment();
		System.out.println("Department: "+this.department);
		
		this.password =randomPassword(defaultPasswordLength);
		System.out.println("Your password is:" +this.password);
		
		String email = firstname.toLowerCase()+ "."+lastname.toLowerCase() + "@"+department +"."+companySuffix;
		System.out.println("Your email is: "+ email);
	}
	
	

	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\n Enter department code: ");
		Scanner in =new Scanner(System.in);
		in.nextInt();
		int depChoice =in.nextInt();
		if(depChoice == 1) { 
			return "sales";
		}
		else if(depChoice ==2) {
			return "dev";
		}
		else if(depChoice ==3) {
			return "acct";
		}
		else {
			return " ";
		}
		}
		private String randomPassword (int length) {
			String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
			char[] password =new char[length];
			for( int i=0; i<length;i++) {
				int rand =(int) (Math.random()*passwordSet.length());
				password[i] = passwordSet.charAt(rand);
				
			}
			return new String(password);
			
		
	}
		public void setMailboxCapacity(int capacity) {
			this.mailboxCapacity = capacity;
		}
		public void setAlternateEmail(String altEmail) {
			this.alternatemail=altEmail;
		}
		
		public void changePassword(String password) {
			this.password=password;
			
		}
		public int getMailboxCapacity() {
			return mailboxCapacity;
		}
		public String getAlternateEmail() {
			return  alternatemail;
		}
		public String getPassword() {
			return password;
		}
		public String showInfo() {
			return "DISPLAY NAME: "+firstname +" "+lastname+"\nCOMPANY EMAIL: "+ email+ "\nMAILBOX CAPACITY: "+mailboxCapacity +"mb";
		}

}
