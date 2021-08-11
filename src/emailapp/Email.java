package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity;
	private int defaultPasswordLength = 10;
	private String alternateemail;
	private String companySuffix = "AEcompany.com";
	
	public Email(String firstName,String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + " " + this.firstName + " " + this.lastName);
		
		this.department = setDepartment();
		System.out.println("Department:" + " " + this.department);
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password: " + this.password);
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		System.out.println("EMAIL CREATED: " + this.email);
	}
	
	private String setDepartment() {
		System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in=new Scanner(System.in);
		int deptChoice = in.nextInt();
		if(deptChoice == 1) { return "sales";  }
		else if(deptChoice == 2) { return "dev"; }
		else if(deptChoice == 3) { return "acct"; }
		else { return ""; }
	}


private String randomPassword(int length) {
	String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$";
	char[] password = new char[length];
	for(int i=0; i<length ; i++) {
		int rand= (int) (Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand);
	}
	return new String(password);
	
}

  public void setMailboxCapacity(int capacity) {
	  this.mailboxCapacity = capacity;
 }
  public void setAlternateEmail(String altEmail) {
	  this.alternateemail = altEmail;
  }
  
 public void changePassword(String Password) {
	 this.password =  password;
 }
 
 public int getMailboxCapacity () { return mailboxCapacity; }
 public String getAlternateEmail() { return alternateemail; }
 public String getPassword() { return password; }
 
 
 
 








 public String showInfo() {
	 return "DISPLAY NAME: " + firstName + " " + lastName +
		    "COMPANY EMAIL: " + email +
		    "MAILBOX CAPACITY: " + mailboxCapacity + "mb";
 }


}


