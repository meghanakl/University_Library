package com.meghana;

import java.util.Scanner;

public class Proagram {
	public static void main(String args[]) {
		RegisterBarrower();
	}

	public static void RegisterBarrower() {

		System.out.println("Enter a title");
		Scanner s = new Scanner(System.in);
		String Title = s.nextLine();

		System.out.println("Enter a First_Name");
		Scanner s2 = new Scanner(System.in);
		String First_Name = s.nextLine();

		System.out.println("Enter a Last_Name");
		Scanner s3 = new Scanner(System.in);
		String Last_Name = s.nextLine();

		System.out.println("Enter a AddressLine1");
		Scanner s4 = new Scanner(System.in);
		String AddressLine1 = s.nextLine();

		System.out.println("Enter a AddressLine2");
		Scanner s5 = new Scanner(System.in);
		String AddressLine2 = s.nextLine();

		System.out.println("Enter a city");
		Scanner s6 = new Scanner(System.in);
		String city = s.nextLine();

		System.out.println("Enter a StateName");
		Scanner s7 = new Scanner(System.in);
		String StateName = s.nextLine();

		System.out.println("Enter a Country");
		Scanner s8 = new Scanner(System.in);
		String Country = s.nextLine();

		System.out.println("Enter a postCode");
		Scanner s9 = new Scanner(System.in);
		int PostCode = s.nextInt();

		System.out.println("Enter a MobileNumberCountryCode");
		Scanner s10 = new Scanner(System.in);
		int CountryCode = s.nextInt();

		System.out.println("Enter a MobileNumber");
		Scanner s11 = new Scanner(System.in);
		long Mobile_Number = s.nextLong();

		System.out.println("Enter a MobileNumberCountryCode");
		Scanner s12 = new Scanner(System.in);
		int Mobile_Number_CountryCode = s.nextInt();

		System.out.println("Enter a Email_id");
		Scanner s13 = new Scanner(System.in);
		String Email_id = s.nextLine();

		System.out.println("Enter a barrowertype");
		Scanner s14 = new Scanner(System.in);
		String Barrower_type =  s.nextLine();  

		Barrower b = new Barrower(Title, First_Name, Last_Name, AddressLine1, AddressLine2, city, StateName, Country,
				PostCode, Mobile_Number_CountryCode, Mobile_Number, Email_id, Barrower_type);
		b.Register();
	}

	// Barrower b2 = new Barrower(Title,First_Name, Last_Name, AddressLine1,
	// AddressLine2,city,StateName,Country,PostCode,CountryCode,MobileNUmber,EmailId,BarrowerType);
}
