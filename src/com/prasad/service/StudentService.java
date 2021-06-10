package com.prasad.service;

public interface StudentService {
void saveStudent(String firstName, String lastName, String branch);
public void updateStudent(String firstName, String lastName, String branch);	
void deleteStudent(String firstName, String lastName, String Department);
}
