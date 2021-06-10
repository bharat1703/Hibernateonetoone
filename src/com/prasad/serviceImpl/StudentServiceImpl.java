package com.prasad.serviceImpl;

import com.prasad.DaoImpl.StudentDaoImpl;
import com.prasad.Entity.AddressEntity;
import com.prasad.Entity.StudentEntity;
import com.prasad.service.StudentService;

public class StudentServiceImpl implements StudentService{

	StudentDaoImpl studao=new StudentDaoImpl();
	
	@Override
	public void saveStudent(String firstName, String lastName, String Department) {
	
		System.out.println("this is from sevice implementation()");
		AddressEntity address=new AddressEntity(1281, "so and so", "sirattara");
		StudentEntity stuen=new StudentEntity(firstName, lastName, Department, address);
		studao.savestudent(stuen);
	
		
	}

	public void updateStudent(String firstName, String lastName, String Department) {
		//first read the values from the Studentdao 
		StudentEntity stuenobj=studao.getStudentDetails(firstName,lastName);
		if(stuenobj != null) {
			String oldbranch=stuenobj.getDepartment();
			stuenobj.setDepartment(Department);  //if you have any other attribute set here
		
			AddressEntity adressupdate=stuenobj.getAddress();
			adressupdate.setHno(333);
			adressupdate.setStreet("emptry");
			adressupdate.setTown("sir attaenaera");
			stuenobj.setAddress(adressupdate);
			System.out.println("<==== Go and update the data : "+stuenobj);
			
			boolean recordUpdated = studao.updateStudent(stuenobj);
			if(recordUpdated) {
				System.out.println("Emp details have been updated for given emp First Name :"+firstName+", Emp Last Name :"+lastName);
				System.out.println("Emp Department has been updated from :"+oldbranch+" to :"+Department);
			}
		}
		}

	public void deleteStudent(String firstName, String lastName, String Department) {
		StudentEntity stuenobj=studao.getStudentDetails(firstName,lastName);
		if(stuenobj != null) {
			boolean recodeUpdated = studao.deleteEmployee(stuenobj);

			if(recodeUpdated) {
				System.out.println("Emp details have been deleted for given emp First Name :"+firstName+", Emp Last Name :"+lastName);
				System.out.println("Emp has been deleted for emp id :"+stuenobj.getStuid());

		
		
		}
		
	}

	}}
