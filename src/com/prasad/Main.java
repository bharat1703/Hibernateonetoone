package com.prasad;

import com.prasad.serviceImpl.StudentServiceImpl;

public class Main {

	public static void main(String[] args) {

		
		
		System.out.println("hi this is first commit");
		System.out.println("hi this is second commit");
		System.out.println("hi this is third commit");
		System.out.println("hi this is firstbranch");
		
		
		StudentServiceImpl stuimpl=new StudentServiceImpl();
		stuimpl.saveStudent("varada","prasanna","mca");
	/*	String firstName = args[0];
		String lastName = args[1];
		String branch = args[2];
	
		//stuimpl.saveStudent(args[0],args[1],args[2]);
		
		int operation=Integer.parseInt(args[0]);
		switch(operation) {
		case 1:
			 stuimpl.saveStudent(args[1],args[2],args[3]);
		    break;
		case 2:
			 stuimpl.updateStudent(args[1],args[2],args[3]);
				break;
		case 3:
			 stuimpl.deleteStudent(args[1],args[2],args[3]);
				break;
		
		
		}*/
	
		
		
	}

}
