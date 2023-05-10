package javaBasic;

import java.util.Locale;

import com.github.javafaker.Faker;

public class javaFaker {
	public static void main(String[] args) {
		Faker faker = new Faker();
		System.out.println(faker.address().firstName() + "\n");
		System.out.println(faker.address().firstName() + "\n");
		System.out.println(faker.address().firstName() + "\n");
		Faker fakerVi = new Faker(new Locale("Vi"));
		System.out.println(fakerVi.address().firstName() + "\n");
		System.out.println(fakerVi.address().firstName() + "\n");
		System.out.println(fakerVi.address().firstName() + "\n");
	}

}
