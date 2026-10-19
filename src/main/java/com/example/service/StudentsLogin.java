package com.example.service;

public class StudentsLogin implements StudentsData
{

	@Override
	public String Name() {
		// TODO Auto-generated method stub
		System.out.println("Student Name");
		return "bob";
	}

	@Override
	public String Address() {
		// TODO Auto-generated method stub
		System.out.println("Student Address");
		return "pune";
	}

	@Override
	public int Age() {
		// TODO Auto-generated method stub
		System.out.println("Student Age");
		return 22;
	}

	@Override
	public int rollNumber() {
		// TODO Auto-generated method stub
		System.out.println("Student RollNumber");
		return 12;
	}

	@Override
	public  String branch() {
		// TODO Auto-generated method stub
		System.out.println("Student Branch");
		return "mca";
	}

	@Override
	public int MobileNumber() {
		// TODO Auto-generated method stub
		System.out.println("Student Mobile Number");
		return 1234567890;
	}

	@Override
	public char Gender() {
		// TODO Auto-generated method stub
		System.out.println("Student Gender");
		return 'm';
	}

}
