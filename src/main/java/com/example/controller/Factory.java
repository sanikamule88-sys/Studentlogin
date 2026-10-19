package com.example.controller;

import com.example.service.StudentsData;
import com.example.service.StudentsLogin;

public class Factory 
{
public static StudentsData createObject(String type) 
{
	if (type.equals("bob"))
	{
		StudentsLogin s= new StudentsLogin();
		return s;
	}
	return null;
}
}
 